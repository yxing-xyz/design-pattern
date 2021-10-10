/*
是什么:
状态模式是一种行为设计模式， 让你能在一个对象的内部状态变化时改变其行为， 使其看上去就像改变了自身所属的类一样。

为什么:
状态模式与有限状态机的概念紧密相关。
其主要思想是程序在任意时刻仅可处于几种有限的状态中。 在任何一个特定状态中， 程序的行为都不相同， 且可瞬间从一个状态切换到另一个状态。 不过， 根据当前状态， 程序可能会切换到另外一种状态， 也可能会保持当前状态不变。 这些数量有限且预先定义的状态切换规则被称为转移。

你还可将该方法应用在对象上。 假如你有一个 文档Document类。 文档可能会处于 草稿Draft 、 ​ 审阅中Moderation和 已发布Published三种状态中的一种。 文档的 publish发布方法在不同状态下的行为略有不同：
1. 处于 草稿状态时， 它会将文档转移到审阅中状态。
2. 处于 审阅中状态时， 如果当前用户是管理员， 它会公开发布文档。
3. 处于 已发布状态时， 它不会进行任何操作。
状态机通常由众多条件运算符 （ if或 switch ） 实现， 可根据对象的当前状态选择相应的行为。 ​ “状态” 通常只是对象中的一组成员变量值。 即使你之前从未听说过有限状态机， 你也很可能已经实现过状态模式。 
当我们逐步在 文档类中添加更多状态和依赖于状态的行为后， 基于条件语句的状态机就会暴露其最大的弱点。 为了能根据当前状态选择完成相应行为的方法， 绝大部分方法中会包含复杂的条件语句。 修改其转换逻辑可能会涉及到修改所有方法中的状态条件语句， 导致代码的维护工作非常艰难。
这个问题会随着项目进行变得越发严重。 我们很难在设计阶段预测到所有可能的状态和转换。 随着时间推移， 最初仅包含有限条件语句的简洁状态机可能会变成臃肿的一团乱麻。

怎么做:
1. 确定哪些类是上下文。 它可能是包含依赖于状态的代码的已有类； 如果特定于状态的代码分散在多个类中， 那么它可能是一个新的类。
2. 声明状态接口。 虽然你可能会需要完全复制上下文中声明的所有方法， 但最好是仅把关注点放在那些可能包含特定于状态的行为的方法上。
3. 为每个实际状态创建一个继承于状态接口的类。 然后检查上下文中的方法并将与特定状态相关的所有代码抽取到新建的类中。
在将代码移动到状态类的过程中， 你可能会发现它依赖于上下文中的一些私有成员。 你可以采用以下几种变通方式：
将这些成员变量或方法设为公有。
将需要抽取的上下文行为更改为上下文中的公有方法， 然后在状态类中调用。 这种方式简陋却便捷， 你可以稍后再对其进行修补。
将状态类嵌套在上下文类中。 这种方式需要你所使用的编程语言支持嵌套类。
4. 在上下文类中添加一个状态接口类型的引用成员变量， 以及一个用于修改该成员变量值的公有设置器。
5. 再次检查上下文中的方法， 将空的条件语句替换为相应的状态对象方法。
6. 为切换上下文状态， 你需要创建某个状态类实例并将其传递给上下文。 你可以在上下文、 各种状态或客户端中完成这项工作。 无论在何处完成这项工作， 该类都将依赖于其所实例化的具体类。

*/

#ifndef DESIGN_PATTERNS_STATE_H
#define DESIGN_PATTERNS_STATE_H
namespace state
{
    class Context;
    class State
    {
    protected:
        Context *context_;

    public:
        virtual ~State();
        void set_context(Context *context);
        virtual void Handle1() = 0;
        virtual void Handle2() = 0;
    };

    class Context
    {
    private:
        State *state_;

    public:
        Context(State *state);
        ~Context();
        void TransitionTo(State *state);
        void Request1();
        void Request2();
    };

    class ConcreteStateA : public State
    {
    public:
        void Handle1() override;
        void Handle2() override;
    };

    class ConcreteStateB : public State
    {
    public:
        void Handle1() override;
        void Handle2() override;
    };
    void ClientCode();
    void run();
}

#endif //DESIGN_PATTERNS_STATE_H
