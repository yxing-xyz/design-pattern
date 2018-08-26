package CreationalPatterns; /**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CreationalPatterns.CreationalPatterns
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
import CreationalPatterns.BuilderPattern.Meal.Meal;
import CreationalPatterns.FactoryPattern.Apple;
import CreationalPatterns.FactoryPattern.Factory;
import CreationalPatterns.PrototypePattern.Address;
import CreationalPatterns.PrototypePattern.PrototypePattern;
import CreationalPatterns.PrototypePattern.School;
import CreationalPatterns.SingletonPattern.SingletonPattern;


/**
 * 设计模式的六个原则
 * 1、开闭原则：对扩展开放、对修改关闭。
 * 2、里氏替换原则：只有当衍生类可以替换掉基类，软件功能不受影响，基类被真正复用，而衍生类也能够在基类上增加行为。
 * 3、依赖倒转原则：开闭原则的基础，对接口编程，依赖于抽象而不依赖具体
 * 4、接口隔离原则：使用多个隔离接口降低耦合
 * 5、迪米特法则：一个实体应当尽量少的与其他实体发生作用，使得系统模块功能相对独立
 * 6、合成复用原则：尽量使用合成和聚合的方式，而不是使用继承。继承实际上破坏了类的封装性，超类的方法可能会被子类更改。
 */

public class CreationalPatterns {
    public static void main(String args[]) {
        System.out.println("创建型设计模式");
    }

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
     * BuilderPattern模式: 链式操作
     */
    public static void builderPattern() {
        Meal.MealBulder mealBulder = new Meal.MealBulder();
        Meal build = mealBulder.addProduct(new VegBurger()).addProduct(new Coke()).build();
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