#include <iostream>
#include <fstream>
#include <thread>

#include "factory_method.h"
#include "abstract_factory.h"
#include "builder.h"
#include "prototype.h"
#include "singleton.h"
#include "adapter.h"
#include "bridge.h"
#include "composite.h"
#include "decorator.h"

// 工厂模式
// 简单工厂模式： 描述一个类拥有条件语句根据参数返回产品，我的理解是将工厂模式的工厂放在一个类，然后根据不同的参数返回产品。
namespace facotry_method
{
    void run()
    {
        Creator *creator = new ConcreteCreator1();
        Product *product = creator->FactoryMethod();
        std::cout << product->Operation() << std::endl;
        delete creator;
        delete product;

        creator = new ConcreteCreator2();
        product = creator->FactoryMethod();
        std::cout << product->Operation() << std::endl;
        delete creator;
        delete product;
    }

}

// 抽象工厂模式
namespace abstract_factory
{
    void ClientCode(AbstractFactory &f)
    {
        // 剥离掉了工厂模式创建的风格（泛化），保留产品的职责，使职责更加单一函数更加清晰
        const AbstractProductA *productA = f.CreateProductA();
        const AbstractProductB *productB = f.CreateProductB();
        std::cout << productB->UsefulFunctionB() << std::endl;
        std::cout << productB->AnotherUsefulFunctionB(*productA) << std::endl;
        delete productA;
        delete productB;
    }
    void run()
    {
        ConcreteFactory1 *f1 = new ConcreteFactory1();
        ClientCode(*f1);
        delete f1;
        ConcreteFactory2 *f2 = new ConcreteFactory2();
        ClientCode(*f2);
        delete f2;
    }
}

// 生成器模式
namespace builder
{
    void ClientCode(Director &director)
    {
        ConcreteBuilder1 *builder = new ConcreteBuilder1();
        director.SetBuilder(builder);
        std::cout << "Standard basic product:\n";
        director.BuildMinimalViableProduct();
        Product1 *p = builder->GetProduct();
        p->ListParts();
        delete p;

        std::cout << "Standard full featured product:\n";
        director.BuildFullFeaturedProduct();

        p = builder->GetProduct();
        p->ListParts();
        delete p;

        // Remember, the Builder pattern can be used without a Director class.
        std::cout << "Custom product:\n";
        builder->ProducePartA();
        builder->ProducePartC();
        p = builder->GetProduct();
        p->ListParts();
        delete p;

        delete builder;
    }
    void run()
    {
        Director *director = new Director();
        ClientCode(*director);
        delete director;
    }
}

// 原型模式
namespace prototype
{
    void Client(PrototypeFactory &prototype_factory)
    {
        std::cout << "let's create  Prototype 1" << std::endl;
        Prototype *prototype = prototype_factory.CreatePrototype(Type::PROTOTYPE_1);
        prototype->Method(90);
        delete prototype;

        std::cout << "let's create  Prototype 2" << std::endl;

        prototype = prototype_factory.CreatePrototype(Type::PROTOTYPE_2);
        prototype->Method(10);
        delete prototype;
    }

    void run()
    {
        PrototypeFactory *prototype_factory = new PrototypeFactory();
        Client(*prototype_factory);

        delete prototype_factory;
    }
}

// 单例模式

namespace singleton
{
    void ThreadFoo()
    {
        // Following code emulates slow initialization.
        std::this_thread::sleep_for(std::chrono::milliseconds(1000));
        Singleton *singleton = Singleton::GetInstance("FOO");
        std::cout << singleton->value() << "\n";
    }

    void ThreadBar()
    {
        // Following code emulates slow initialization.
        std::this_thread::sleep_for(std::chrono::milliseconds(1000));
        Singleton *singleton = Singleton::GetInstance("BAR");
        std::cout << singleton->value() << "\n";
    }
    void run()
    {
        std::cout << "If you see the same value, then singleton was reused (yay!\n"
                  << "If you see different values, then 2 singletons were created (booo!!)\n\n"
                  << "RESULT:\n";
        std::thread t1(ThreadFoo);
        std::thread t2(ThreadBar);
        t1.join();
        t2.join();
    }
}

// 适配器模式
namespace adapter
{
    void ClientCode(const Target *target)
    {
        std::cout << target->Request() << std::endl;
    }

    void run()
    {
        std::cout << "Client: I can work just fine with the Target objects:\n";
        Target *target = new Target;
        ClientCode(target);
        std::cout << "\n\n";
        Adaptee *adaptee = new Adaptee;
        std::cout << "Client: The Adaptee class has a weird interface. See, I don't understand it:\n";
        std::cout << "Adaptee: " << adaptee->SpecificRequest();
        std::cout << "\n\n";
        std::cout << "Client: But I can work with it via the Adapter:\n";
        Adapter *adapter = new Adapter(adaptee);
        ClientCode(adapter);
        std::cout << "\n";

        delete target;
        delete adaptee;
        delete adapter;
    }
}
// 桥接模式
namespace bridge
{
    void ClientCode(const Abstraction &abstraction)
    {
        // ...
        std::cout << abstraction.Operation();
        // ...
    }

    void run()
    {
        Implementation *implementation = new ConcreteImplementationA;
        Abstraction *abstraction = new Abstraction(implementation);
        ClientCode(*abstraction);
        std::cout << std::endl;
        delete implementation;
        delete abstraction;

        implementation = new ConcreteImplementationB;
        abstraction = new ExtendedAbstraction(implementation);
        ClientCode(*abstraction);

        delete implementation;
        delete abstraction;
    }
}

// 组合模式
namespace composite
{
    void ClientCode(const Component *component)
    {
        std::cout << "RESULT: " << component->Operation();
    }
    void ClientCode2(Component *component1, Component *component2)
    {
        // ...
        if (component1->IsComposite())
        {
            component1->Add(component2);
        }
        std::cout << "RESULT: " << component1->Operation();
        // ...
    }
    void run()
    {
        Component *simple = new Leaf;
        std::cout << "Client: I've got a simple component:\n";
        ClientCode(simple);
        std::cout << "\n\n";
        /**
         * ...as well as the complex composites.
         */

        Component *tree = new Composite;
        Component *branch1 = new Composite;

        Component *leaf_1 = new Leaf;

        Component *leaf_2 = new Leaf;
        Component *leaf_3 = new Leaf;
        branch1->Add(leaf_1);
        branch1->Add(leaf_2);
        Component *branch2 = new Composite;
        branch2->Add(leaf_3);
        tree->Add(branch1);
        tree->Add(branch2);
        std::cout << "Client: Now I've got a composite tree:\n";
        ClientCode(tree);
        std::cout << "\n\n";

        std::cout << "Client: I don't need to check the components classes even when managing the tree:\n";
        ClientCode2(tree, simple);
        std::cout << "\n";

        delete simple;
        delete tree;
        delete branch1;
        delete branch2;
        delete leaf_1;
        delete leaf_2;
        delete leaf_3;
    }
}

// 装饰器模式
namespace decorator {
    void ClientCode(Component* component) {
        // ...
        std::cout << "RESULT: " << component->Operation();
        // ...
    }
    void run() {
        Component* simple = new ConcreteComponent;
        std::cout << "Client: I've got a simple component:\n";
        ClientCode(simple);
        std::cout << "\n\n";
        /**
         * ...as well as decorated ones.
         *
         * Note how decorators can wrap not only simple components but the other
         * decorators as well.
         */
        Component* decorator1 = new ConcreteDecoratorA(simple);
        Component* decorator2 = new ConcreteDecoratorB(decorator1);
        std::cout << "Client: Now I've got a decorated component:\n";
        ClientCode(decorator2);
        std::cout << "\n";

        delete simple;
        delete decorator1;
        delete decorator2;
    }
}

int main(int argc, char *argv[])
{
    // facotry_method::run();
    // abstract_factory::run();
    // builder::run();
    // prototype::run();
    // singleton::run();
    // adapter::run();
    // bridge::run();
    // composite::run();
    decorator::run();
}

/* 类图关系:

   泛化 = 实现 > 组合 > 聚合 > 关联 > 依赖

   1. 泛化(Generalization):
   形状: 带三角箭头的实线，箭头指向父类
   是一种继承关系,它指定了子类如何特化父类的所有特征和行为例如：老虎是动物的一种.

   2. 实现(Realization):
   形状: 带三角箭头的虚线，箭头指向接口
   是一种类与接口的关系，表示类是接口所有特征和行为的实现

   3. 关联(Association):
   形状: 带普通箭头的实心线，指向被拥有者
   是一种拥有的关系,它使一个类知道另一个类的属性和方法；如：老师与学生，丈夫与妻子关联可以是双向的，也可以是单向的。双向的关联可以有两个箭头或者没有箭头，单向的关联有一个箭头。
   代码: 丈夫和妻子成员变量互相拥有对方

   4. 聚合(Aggregation):
   形状: 带空心菱形的实心线，菱形指向整体
   是整体与部分的关系.如车和轮胎是整体和部分的关系.聚合关系是关联关系的一种，是强的关联关系；关联和聚合在语法上无法区分，必须考察具体的逻辑关系。
   代码: 车的成员变量List<轮胎>

   5. 组合(Composition):
   形状: 带实心菱形的实线，菱形指向整体
   是整体与部分的关系.没有公司就不存在部门,组合关系是关联关系的一种，是比聚合关系还要强的关系，它要求普通的聚合关系中代表整体的对象负责代表部分的对象的生命周期
   代码: 鸟的成员变量翅膀

   6. 依赖(Dependency)
   形状: 带箭头的虚线，指向被使用者
   是一种使用的关系,所以要尽量不使用双向的互相依赖。
   代码: 局部变量、方法的参数或者对静态方法的调用

*/

/* SOLID
单一职责原则The Single-Responsibility Principle (SRP): 一个类仅有一个引起它变化的原因。虽然这一原则明确是在说类的设计，但是实际中在一个模块或者一个方法上同样适用.
开放封闭原则The Open/Closed Principle (OCP): 开放闭合原则同样适用于类、模块和方法等，它强调对扩展开放，对修改闭合。看起来说了两点实际上就是一点：为了适应新的需求，尽量不要修改原始代码，而是扩展原有的代码。
里氏替换原则The Liskov Substitution Principle (LSP):子类型必须能够替换它的基类型。OCP的实现机制是抽象和多态，而它们的关键是继承。LSP所强调的就是继承的实现规则。
接口隔离原则The Interface Segregation Principle (ISP):客户端不应该被迫依赖于它不会用到的方法。
依赖导致原则he Dependency-Inversion Principle (DIP): 高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖于抽象。
 */
