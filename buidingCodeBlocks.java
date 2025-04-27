package JavaSE_7_29;

public class buidingCodeBlocks {
    //构造块：定义在类中的代码块(不加修饰符)。也叫：实例代码块。构造代码块一般用于初始化实例成员变量。
    static class Person {
        private String name;//实例成员变量
        private int age;
        private String sex;

        public Person() {
            System.out.println("I am Person init()!");
        }

        //实例代码块
        {
            this.name = "bit";
            this.age = 12;
            this.sex = "man";
            System.out.println("I am instance init()!");
        }

        public void show() {
            System.out.println("name: " + name + " age: " + age + " sex: " + sex);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Person p1 = new Person();
            p1.show();
        }
    }
}
 /*   // 运行结果
    I am instance init()!
    I am Person init()!
    name: bit age: 12 sex: man
    注意事项: 实例代码块优先于构造函数执行。*/

