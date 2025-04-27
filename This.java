package JavaSE_7_29;

public class This {


   // this表示当前对象引用(注意不是当前对象). 可以借助 this 来访问对象的字段和方法.
   static class Person {
        private String name;//实例成员变量
        private int age;
        private String sex;
        //默认构造函数 构造对象
        public Person() {
//this调用构造函数
            this("bit", 12, "man");//必须放在第一行进行显示
        }
        //这两个构造函数之间的关系为重载。
        public Person(String name,int age,String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public void show() {
            System.out.println("name: "+name+" age: "+age+" sex: "+sex);
        }
    }
    public static class Main{
        public static void main(String[] args) {
            Person person = new Person();//调用不带参数的构造函数
            person.show();
        }

    }
// 执行结果
  /*  name: bit age: 12 sex: man
    我们会发现在构造函数的内部，我们可以使用this关键字，构造函数是用来构造对象的，对象还没有构造好，
    我们就使用了this，那this还代表当前对象吗？当然不是，this代表的是当前对象的引用。*/
}
