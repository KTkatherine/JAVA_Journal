import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import static netscape.security.Privilege.add;

public class JavaSE_4_06 {
    /**
     <<<= 没有无符号左翼运算符

     float单精度浮点数，4字节。小数点6位之内的有效数字。

     double 双精度浮点数，8字节。小数点12位之内的有效数字。

     switch(int/char/String/enum)      short 和byte在储存时都会转为int

* Method
     * 方法定义时的参数为形参，方法调用时的参数为实参。
     ：
     计算值

     public static 方法返回值 方法名称 （方法参数。。。【0.。。N】）{
     //方法体代码
     【return 语句】；//使用return 表示提前结束方法的调用。
     }

    //Java中把两个局部变量的值做修改 只能通过数组或者引用 不能直接获得其局部变量X or Y 的地址，这也是java比C安全的原因之一。


* please  explain the difference between overload（方法重载） and override （方法重写）
     overload：发生“在同一个类中”，定义了若干个方法名称相同，参数列表不同（参数的类型或者个数）的一组方法，与返回值无关！
                这样一组方法称为重载方法
     Overloading and overriding are complementary things,
        overloading means the same method name but different parameters,
            and overriding means the same method name in a subclass with the same parameters.

     e.g.// 名称一样，参数类型不同，个数不同
     public static int add(int a,int b) {
     int ret = a + b;
     return ret;
     }

     public static double add(double a,double b) {//参数类型不同
     return a + b;
     }

     public static int add(int a,int b, int c){//个数不同
     return a + b +c;
     }

     Java中System.out.println(任意参数类型都可以)
     实际上就是因为System这个类中定义了N个重载方法，用户直接用就可以了

     e.g.
     public static int add(int a,int b) {
     int ret = a + b;
     return ret;
     }

     public static double add(int a,int b) {
     return a + b;
     }

     */
    public static void main(String[] args) {
        short a = 128;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);//经过强制类型转换后a的值128， b的值-128

        double x = 2.0;
        int y = 4;
        x /= ++y;
        System.out.println(x);//0.4 //对于y， 先++再取值 = 5.0， x = 2.0/5.0=0.4

        /**
         定义一个方法，实现两个int的相加
         //public static void main(String[] args) { //方法定义时，返回值可以没有，则返回值类型写成void
         */
        int X = 10;
        int Y = 20;
        int sum = add(X,Y);
        System.out.println(sum);//30
        // add 方法接收两个整型参数，返回c + d 的和；

        //add方法
        int e = 30;
        int f = 70;
        int summ = add(e, f);
        System.out.println(summ);//100

        //calculate factorial value
        int suum = 0;
        for (int j = 1; j <= 5 ; j++) {
            int tempRet = factor(j);//得到的每一个阶乘值就暂存在了tempRet中
            suum += tempRet;
        }
        System.out.println(suum);
        //Calculate the Factorial value of 1
        //Calculate the Factorial value of 2
        //Calculate the Factorial value of 3
        //Calculate the Factorial value of 4
        //Calculate the Factorial value of 5
        //153

        //Java中把两个局部变量的值做修改 只能通过数组或者引用 不能直接获得其局部变量X or Y 的地址，这也是java比C安全的原因之一。
        int[] arr = {10,20};
        swapArr(arr);
        System.out.println("arr[0] = " + arr[0] + ",arr[1] = " + arr[1]);//arr[0] = 20,arr[1] = 10


        //return
        printNumber (100);//3

        System.out.println(addDouble(10.5,11.6));//22.1
        }


    //add方法
    public static int add(int c,int d) {
        int ret = c + d;
        return ret;
    }

    //接收一个整数num，求出其阶乘值并返回
    public static int factor(int num) {
        System.out.println("Calculate the Factorial value of " + num);
        int ret = 1;
        for (int i = 1; i <= num ; i++) {
            ret *= i;
        }
        return ret;
    }

    //swap
    public static void swapArr(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    //return
    //传入一个number,输出第一个从1.。。。。number的3的倍数
    public static void printNumber (int number) {
        for (int z = 1 ; z <= number ; z++) {
            if (z % 3 == 0){//3的倍数
                System.out.println(z);
                return;//直接终止了本次方法的调用
            }

        }
    }

    //double
    //两个参数相加，所有参数相同功能的方法我们要定义为相同名称
    //最大程度的减少用户使用成本
    public static double addDouble(double a, double b){
        return a + b;
    }



    }

