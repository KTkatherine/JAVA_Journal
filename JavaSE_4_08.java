public class JavaSE_4_08 {
/**
 类名称，每个首字母大写。

 */
public static void main(String[] args) {
    int num = 1234;
    printNum(num);//alt + Enter ->快速修正错误(方法调用printNum)
}








//传入一个正整数num，我就能按照从高位到低位打印每一个数字
    public static void printNum(int num) {
    if (num < 10){
        //此时num是个位数，直接输出
        System.out.println(num + " ");
        return;
    }
    //程序走到这里一定是个二位数，剩下的位数交给假设已知的函数，printNum 就是用来打印剩下位数的
        //num /10 剩下位数,交给子函数
        //先输出个位以外的数字，交给函数进行打印
    printNum(num / 10);
    //打印当前个位
        System.out.println(num % 10 + " ");
    }


}
