package JavaSE_7_29;

public class setterAndGetter {
    static class Person {
        private String name;//实例成员变量
        private int age;
        public void setName(String name){
//name = name;//不能这样写
            this.name = name;//this引用，表示调用该方法的对象
        }
        public String getName(){
            return name;
        }
        public void show(){
            System.out.println("name: "+name+" age: "+age);
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("caocao");
        String name = person.getName();
        System.out.println(name);
        person.show();
    }
// 运行结果
  /*  caocao
    name: caocao age: 0
    注意事项
    getName 即为 getter 方法, 表示获取这个成员的值.
    setName 即为 setter 方法, 表示设置这个成员的值.
    当set方法的形参名字和类中的成员属性的名字一样的时候，如果不使用this, 相当于自赋值. this 表示当前实例
的引用.
不是所有的字段都一定要提供 setter / getter 方法, 而是要根据实际情况决定提供哪种方法.
在 IDEA 中可以使用 alt + insert (或者 alt + F12) 快速生成 setter / getter 方法. 在 VSCode 中可以使用鼠标右键
菜单 -> 源代码操作 中自动生成 setter / getter 方法.*/
}
