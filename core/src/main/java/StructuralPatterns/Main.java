package StructuralPatterns;

import StructuralPatterns.AdapterPattern.Audio.AudioPlayer;
import StructuralPatterns.BridgePattern.Circle.Circle;
import StructuralPatterns.BridgePattern.Circle.GreenCircle;
import StructuralPatterns.BridgePattern.Circle.RedCircle;
import StructuralPatterns.CompositePattern.Employee;
import StructuralPatterns.DecoratorPattern.Decorator.RedShapeDecorator;
import StructuralPatterns.DecoratorPattern.Shape.Rectangle;
import StructuralPatterns.FilterPattern.Criteria.*;
import StructuralPatterns.FilterPattern.CriteriaSingle;
import StructuralPatterns.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String args[]) {
        AdapterPattern();
    }

    /**
     * 适配器模式
     */
    public static void AdapterPattern() {
        AudioPlayer audioPlayer = new StructuralPatterns.AdapterPattern.AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

    /**
     * 桥接模式
     */
    public static void BridgePattern() {
        new Circle(new GreenCircle(), 1, 2, 3).draw();
        new Circle(new RedCircle(), 4, 5, 6).draw();
    }

    /**
     * 过滤器模式或标准模式(Criteria Pattern)
     */
    public static void FilterPattern() {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");

        for (Person person : male.meetCriteria(persons)) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }

        System.out.println("\nFemales: ");
        for (Person person : female.meetCriteria(persons)) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }

        System.out.println("\nSingle Males: ");
        for (Person person : single.meetCriteria(persons)) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }

        System.out.println("\nSingle Or Females: ");

        for (Person person : singleOrFemale.meetCriteria(persons)) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }

    }

    /**
     * 组合模式
     */

    public static void CompositePattern() {
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }

    /**
     * 装饰器模式
     */
    public static void DecoratorPattern() {
        StructuralPatterns.DecoratorPattern.Shape.Shape circle = new StructuralPatterns.DecoratorPattern.Shape.Circle();
        StructuralPatterns.DecoratorPattern.Shape.Shape redCircle = new RedShapeDecorator(new StructuralPatterns.DecoratorPattern.Shape.Circle());
        StructuralPatterns.DecoratorPattern.Shape.Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("circle with normal border");
        circle.draw();
        System.out.println();

        System.out.println("circle of red border");
        redCircle.draw();
        System.out.println();

        System.out.println("Rectangle of red border");
        redRectangle.draw();
        System.out.println();
    }

}