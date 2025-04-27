package JavaSE_7_29;

public class publicAndPrivate {
    /*private/ public 这两个关键字表示 "访问权限控制" .
    被 public 修饰的成员变量或者成员方法, 可以直接被类的调用者使用.
            被 private 修饰的成员变量或者成员方法, 不能被类的调用者使用.
            换句话说, 类的使用者根本不需要知道, 也不需要关注一个类都有哪些 private 的成员. 从而让类调用者以更低的
    成本来使用类.
            直接使用 public
    这样的代码导致类的使用者(main方法的代码)必须要了解 Person 类内部的实现, 才能够使用这个类. 学习成本较
            高
    一旦类的实现者修改了代码(例如把 name 改成 myName), 那么类的使用者就需要大规模的修改自己的代码, 维
    护成本较高.
            范例：使用 private 封装属性, 并提供 public 方法供类的调用者使用.*/


/*    static class Person {
        public String name = "张三";
        public int age = 18;
    }
    static class Test {
        public static void main(String[] args) {
            Person person = new Person();
            System.out.println("我叫" + person.name + ", 今年" + person.age + "岁");
        }
    }*/
// 执行结果
    //我叫张三, 今年18
static class Person {
    private String name = "张三";
    private int age = 18;
    public void show() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }
}
    static class Test {
        public static void main(String[] args) {
            Person person = new Person();
            person.show();
        }
    }
// 执行结果
    /*我叫张三, 今年18岁
    此时字段已经使用 private 来修饰. 类的调用者(main方法中)不能直接使用. 而需要借助 show 方法. 此时类的使
    用者就不必了解 Person 类的实现细节.
            同时如果类的实现者修改了字段的名字, 类的调用者不需要做出任何修改(类的调用者根本访问不到 name, age
            这样的字段).*/
}
