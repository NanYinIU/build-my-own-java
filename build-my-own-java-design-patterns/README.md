# design-patterns

关于常用设计模式的总结，首先需要了解设计模式需要遵循的六个基本原则：

## 设计模式遵循的原则有六个

- **开闭原则（Open Close Principle）**

    对扩展开放，对修改关闭。

- **里氏代换原则（Liskov Substitution Principle）**

    只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。

- **依赖倒转原则（Dependence Inversion Principle）**

    这个是开闭原则的基础，对接口编程，依赖于抽象而不依赖于具体。

- **接口隔离原则（Interface Segregation Principle）**

    使用多个隔离的接口来降低耦合度。

- **迪米特法则（最少知道原则）（Demeter Principle）**

    一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。

- **合成复用原则（Composite Reuse Principle）**

    原则是尽量使用合成/聚合的方式，而不是使用继承。继承实际上破坏了类的封装性，超类的方法可能会被子类修改。
    

设计模式大致分为三大类： 1.创建型模式 2.结构型模式 3. 行为型模式

## 创建型模式

1. [工厂模式](https://nanyiniu.space/2019/05/29/2019-05-29-设计模式之工厂模式/)

2. [单例模式](https://nanyiniu.space/2019/05/30/2019-05-30-设计模式之单例模式/)

3. [建造者模式](https://nanyiniu.space/2019/06/01/2019-06-01-设计模式之建造者模式/)

4. [原型模式](https://nanyiniu.space/2019/06/02/2019-06-02-设计模式之原型模式/)


## 结构型模式

1. [适配器模式](https://nanyiniu.space/2019/06/02/2019-06-02-设计模式之适配器模式/)

2. [装饰者模式](https://nanyiniu.space/2019/06/10/2019-06-10-设计模式之装饰者模式/)

3. [代理模式](https://nanyiniu.space/2019/06/14/2019-06-14-设计模式之代理模式/)

4. [外观模式](https://nanyiniu.space/2019/06/12/2019-06-12-设计模式之外观模式/)

5. [桥接模式](https://nanyiniu.space/2019/06/03/2019-06-03-设计模式之桥接模式/)

6. [组合模式](https://nanyiniu.space/2019/06/01/2019-06-03-设计模式之组合模式/)

7. [享元模式](https://nanyiniu.space/2019/06/13/2019-06-13-设计模式之享元模式/)

## 行为型模式

1. [责任链模式](https://nanyiniu.space/2019/05/27/2019-05-27-设计模式之责任链模式/)

2. [策略模式](https://nanyiniu.space/2019/05/27/2019-05-28-设计模式之策略模式/)

3. [访问者模式](https://nanyiniu.space/2019/06/15/2019-06-15-设计模式之访问者模式/)

4. [模版模式](https://nanyiniu.space/2019/06/17/2019-06-17-设计模式之模版模式/)

5. [观察者模式](https://nanyiniu.space/2019/06/19/2019-06-24-设计模式之观察者模式/)

6. [状态模式](https://nanyiniu.space/2019/06/19/2019-06-19-设计模式之状态模式/)

7. [备忘录模式](https://nanyiniu.space/2019/06/25/2019-06-25-设计模式之备忘录模式/)

8. [迭代器模式](https://nanyiniu.space/2019/06/27/2019-06-27-设计模式之迭代器模式/)

9. [命令模式](https://nanyiniu.space/2019/06/28/2019-06-28-设计模式之命令模式/)


开篇内容REF:[Java设计模式分类与原则](https://nanyiniu.space/2018/04/17/2018-04-17-Java设计模式分类和原则/)