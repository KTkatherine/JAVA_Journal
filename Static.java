package JavaSE_4_13;
import java.util.Scanner;
// public 公共访问权限，主类，这个类在当前项目中都是可见的
public class Static {
    /*
    *Static: 和对象无关,可以直接通过类名称访问静态变量和静态方法（包含该类的null 引用）
    * class test{
    * public static void hello(){
    * system.out.println("hello")
    * }}
    *
    *public class MyApplication{
    * public static void main (String[] args){
    * Test test = null;
    * test.hello();//能编译通过，并正确运行
    * }}
    * 1.1修饰属性，类属性，类变量
    * 1.2修饰工具，类方法，工具方法
    * 1.3 Static修饰代码块，静态代码块
    * 1.4 修饰内部类，静态内部类
    *
    *在类中定义常量，一般都会使用全局常量：
    * static final 共同修饰
    * 常量的命名规则：
    * 所有单词全部大写，多个单词使用下划线链接
    * static final String STUDENT_SCHOOL = "清华大学'
    *
    * static 称为类属性，在方法区中储存，该类的所有对象共享此变量。
    *
    * a.在静态方法中只能调用静态方法或者静态属性，static 家族之间可以互相调用。不能直接调用成员方法和成员属性，必须通过对象来调用。
    * b.在成员方法中既可以调用成员方法，也可以调用静态方法（此时都已经产生了该类对象，一定是可以访问静态域）
    * 静态方法能否访问成员变量和成员方法？False  --静态方法没有该类对象就能访问
    * 成员方法能否访问静态变量和静态方法？True    --必须要通过对象访问。
    *
    * 共享的变量如country属性，设计为静态变量
    * 工具类的方法设计为static方法，
    * Arrays.sort(int[])
    * Arrays.copyOf()
    * 都是Arrays 提供的操作数组的方法，设计为static方法
    *
    * 面向对象一共有3大特性：封装，继承，和多态
    * 封装：保护性和易用性。private实现属性的封装只是其中一种。
    *
    * 在Java中，所谓的权限修饰符是指，修饰的属性，方法，类 可见的范围有多大
    * 一共有四大访问修饰符，可见的范围由小到大依次为
    * private < default < protected < public
    * 被public修饰的东东 在当前程序（项目）中都是可见可使用的
    * 被private修饰的属性和方法只在当前类的内部可见，出了类的{}，对外就完全隐藏了，外部不知道其存在
    *
    * 在类的外部去使用这些私有属性，需要使用类提供的getter(取值)和setter(修改值)
    *
    * */
    public static void main (String[] args){
        Bank bank = new Bank();
        //当password
        //
        bank.setPassword();
        System.out.println("new password is: ");
        System.out.println(bank.getPassword());
    }
    static class Bank{
        //设置几个属性
        private int cardNum;//可获取
        private double sal;//可取
        private String password = "123456";//可改可取
//alter + insert快速改getter setter
        //这三个变量的可见性就在这个bank类大括号内部,bank类的私有属性对于其他类不可见，例如bank.cardNum就不行

        public int getCardNum() {
            return cardNum;
        }

        public double getSal() {
            return sal;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword() {
            Scanner scanner = new Scanner(System.in);
            //验证当前密码是否正确才能修改
            int count = 0;
            while(true){
            System.out.println("Please enter your old password:");
            String oldPass = scanner.nextLine();
                count ++;
                //所有引用类对象比较使用equals方法
                if (oldPass.equals(password)){
                    System.out.println("password is correct, changing password now.");
                    System.out.println("please enter your new password:");
                    String newPass = scanner.nextLine();
                    password = newPass;
                    System.out.println("new password set");
                    break;
                }else{
                    System.out.println("password is incorrect, please try again later.");
                    if(count == 3){
                        System.out.println("Password tried multiple times, bank card locked");
                        break;
                    }
                }
        }
    }

        }
    }
/*
* Please enter your old password:
123
password is incorrect, please try again later.
Please enter your old password:
1234
password is incorrect, please try again later.
Please enter your old password:
1235
password is incorrect, please try again later.
Password tried multiple times, bank card locked
new password is:
123456
*
*
*
Please enter your old password:
123
password is incorrect, please try again later.
Please enter your old password:
123456
password is correct, changing password now.
please enter your new password:
test
new password set
new password is:
test
*
*
* */
