public class JavaSE_4_08 {
/**
 类名称，每个首字母大写。

 */

//在计算fibo(48)计算fibo(3)被计算了多少次
static int  count = 0;

public static void main(String[] args) {
    int num = 1234;
    printNum(num);//alt + Enter ->快速修正错误(方法调用printNum)
    //1 2 3 4

    //传入一个任意的正整数，我就能按照低位到高位的顺序依次打印每一位的数字
    System.out.println();
    System.out.println("---------------");
    PrintNumReverse(num);
    //---------------
    //4 3 2 1


    //求一个num对应的斐波那契数
    System.out.println();
//    System.out.println(fibo(2));
//    System.out.println(fibo(5));
//    System.out.println(fibo(10));
    System.out.println(fibo(40));
    //1
    //5
    //55
    //102334155//计算这个数用了太长时间，同一个数计算太多次了

    System.out.println("fibo(3) has been counted for " + count + " times");
    //fibo(3) has been counted for 39088169 times
}








//传入一个正整数num，我就能按照从高位到低位打印每一个数字
    public static void printNum(int num) {
    if (num < 10){
        //此时num是个位数，直接输出
        System.out.print(num + " ");
        return;
    }
    //程序走到这里一定是个二位数，剩下的位数交给假设已知的函数，printNum 就是用来打印剩下位数的
        //num /10 剩下位数,交给子函数
        //先输出个位以外的数字，交给函数进行打印
    printNum(num / 10);
    //打印当前个位
        System.out.print(num % 10 + " ");
    }




//传入一个任意的正整数，我就能按照低位到高位的顺序依次打印每一位的数字
    public static void PrintNumReverse(int num){
     if (num < 10){
         System.out.print(num + " ");
         return;
     }
     //只知道个位，先打印
        System.out.print(num % 10 + " ");
     //剩下高位交给子函数
        PrintNumReverse(num / 10);
    }




//求一个num对应的斐波那契数
    //在计算fibo(40)计算fibo(3)被计算了多少次
    public static int fibo(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        if (num == 3) {
            //此时在调用fibo(3)
            count++;
        }
        return fibo(num - 1) + fibo(num - 2);
    }

}
