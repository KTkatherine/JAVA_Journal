package JavaSE_7_29;

public class staticCodeBlock {
    //静态代码块
    //使用static定义的代码块。一般用于初始化静态成员属性。
    static class Person{

        private String name;//实例成员变量
        private int age;
        private String sex;
        private static int count = 0;//静态成员变量 由类共享数据 方法区
        public Person(){
            System.out.println("I am Person init()!");
        }
        //实例代码块
        {
            this.name = "bit";
            this.age = 12;
            this.sex = "man";
            System.out.println("I am instance init()!");
        }
        //静态代码块
        static {
            count = 10;//只能访问静态数据成员
            System.out.println("I am static init()!");
        }
        public void show(){
            System.out.println("name: "+name+" age: "+age+" sex: "+sex);
        }
    }
    public static class Main {
        public static void main(String[] args) {
            Person p1 = new Person();
            Person p2 = new Person();//静态代码块是否还会被执行？
        }
    }
    /*注意事项
    静态代码块不管生成多少个对象，其只会执行一次，且是最先执行的。
    静态代码块执行完毕后, 实例代码块（构造块）执行，再然后是构造函数执行。
    output
   :
   I am static init()!
I am instance init()!
I am Person init()!
I am instance init()!
I am Person init()!

    */
}
