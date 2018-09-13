package CreationalPatterns; /**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Main.Main
 * Author:   yuxing1994
 * Date:     2018/8/8 23:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import CreationalPatterns.AbstractFactoryPattern.Factory.AbstractFactory;
import CreationalPatterns.AbstractFactoryPattern.Factory.FactoryProducer;
import CreationalPatterns.AbstractFactoryPattern.Factory.LinuxFactory;
import CreationalPatterns.AbstractFactoryPattern.Linux.Gentoo;
import CreationalPatterns.AbstractFactoryPattern.Linux.Linux;
import CreationalPatterns.BuilderPattern.Iterm.Burger.VegBurger;
import CreationalPatterns.BuilderPattern.Iterm.ColdDrink.Coke;
import CreationalPatterns.BuilderPattern.Iterm.ColdDrink.Pepsi;
import CreationalPatterns.BuilderPattern.Meal.Meal;
import CreationalPatterns.FactoryPattern.Apple;
import CreationalPatterns.FactoryPattern.Factory;
import CreationalPatterns.PrototypePattern.Address;
import CreationalPatterns.PrototypePattern.PrototypePattern;
import CreationalPatterns.PrototypePattern.School;
import CreationalPatterns.SingletonPattern.SingletonPattern;



public class Main {
    public static void main(String args[]) {
        System.out.println("创建型设计模式"); }

    /**
     * 工厂模式
     */

    public static void factoryPattern() {
        Factory.get(Apple.class).name();
    }

    /**
     * 抽象工厂模式
     */
    public static void abstractFactoryPattern() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(LinuxFactory.class);
        Linux linux = abstractFactory.getLinux(Gentoo.class);
        linux.kernel();
    }

    /**
     * 单例模式
     */
    public static void singletonPattern() {
        SingletonPattern sigleton1 = SingletonPattern.getInstance();
        SingletonPattern sigleton2 = SingletonPattern.getInstance();
        SingletonPattern sigleton3 = SingletonPattern.getInstance();

        System.out.println(sigleton1.hashCode());
        System.out.println(sigleton2.hashCode());
        System.out.println(sigleton3.hashCode());
    }

    /**
     * 建造者模式
     */
    public static void builderPattern() {
        Meal.MealBulder mealBulder = new Meal.MealBulder();
        Meal build = mealBulder.addProduct(new VegBurger()).addProduct(new Pepsi()).build();
        build.showIterm();
        System.out.println("花费: " + build.getCost());

    }


    /**
     * 原型模式: 原型模式就是讲一个对象作为原型，使用clone()方法来创建新的实例。
     */

    public static void prototypePattern() {
        Address.Builder addressBuilder = Address.newBuilder();
        addressBuilder.setCountry("中国").setProvince("湖南省").setCicy("长沙市").setDistrict("岳麓区");
        Address address = addressBuilder.Build();

        School.Builder schoolBuilder = School.newBuilder();
        schoolBuilder.setName("湖南大学").setAddress(address);
        School school = schoolBuilder.build();

        System.out.println(school.getName());
        System.out.println(school.getAddress().getCountry());
        System.out.println(school.getAddress().getProvince());
        System.out.println(school.getAddress().getCicy());
        System.out.println(school.getAddress().getDistrict());

        System.out.println(school.hashCode());
        System.out.println(PrototypePattern.Clone(school).hashCode());
    }
}