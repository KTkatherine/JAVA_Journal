package JavaSE_7_27;

import java.util.Scanner;
public class JavaSE_7_27 {
    /*
    7_25 Homework
    *1. switch (){}结构中，括号中不可使用的数据类型不能是： long, float, double, boolean

    * */
    //2.1 1-100之间，多少个数字包含9
        //99 就只算是一个数字

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//100
        int count = 0;
        for (int i = 0; i <= n ; i++) {
            if (i/10 == 9){
                count++;//99 90
            }else if(i % 10 == 9){//选择分支式语句，一个执行，另一个就不执行
                count++;//99 9
            }
        }
        System.out.println(count);// put-in 100, //19


    }


    //2.0 1-100之间，9出现的的次数
        //个位：9%10=9
        //十位：96/10=9
    public static void main0(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//100
        int count = 0;
        for (int i = 0; i <= n ; i++) {
            if (i/10 == 9){
                count++;
            }
            if(i % 10 == 9){
                count++;
            }
        }
        System.out.println(count);// put-in 100, //20


    }


}
