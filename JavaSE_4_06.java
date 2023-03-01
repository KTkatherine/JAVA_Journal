public class JavaSE_4_06 {
    /**
     <<<= 没有无符号左翼运算符

     float单精度浮点数，4字节。小数点6位之内的有效数字。

     double 双精度浮点数，8字节。小数点12位之内的有效数字。



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















    }
}
