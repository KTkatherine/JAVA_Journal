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
     【return 语句】；
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

        // swap the values of two numbers
        swap(X,Y);
        System.out.println("X = " + X + ", Y = " + Y);

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

    // swap the values of two numbers
    public static void swap(int g,int h){
        int temporary = m;
        m = n;
        n = temporary;//内部就把mn的值换了

    }






    }

