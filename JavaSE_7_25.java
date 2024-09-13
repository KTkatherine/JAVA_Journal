package JavaSE_7_25;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class JavaSE_7_25 {

    public static void main(String[] args) {
        //1! + 2! + 3! + 4! + 5!
        int i = 1;
    }

    public static void main6(String[] args) {
        //1-100既能被3整除又能被5整除的数据
        int i = 1;
        while (i <= 100){
            if (i % 15 != 0){
                i ++;
                continue;
            }
            System.out.println(i);
/*          15
            30
            45
            60
            75
            90*/
            i++;
        }
    }

    public static void main5(String[] args) {
        int i = 1;
        while (i <= 10){
            if (i % 3 == 0){
                System.out.println(i);
                continue;// 3 会一直打印
            }
            i ++;
        }
    }


    public static void main4(String[] args) {
        //1! + 2! + 3! + 4! + 5!
        int i = 1;
        int sumFactorial = 0;
        while (i <= 5){
            int n = 1;
            int ret =1;
            while (n <= i){
                ret *= n;
                n++;
            }
            sumFactorial += ret;
            i++;

        }
        System.out.println(sumFactorial);//153
    }


    public static void main3(String[] args) {
        //1-100 奇数的和
        int  sumOdd = 0;
        int a = 1;
        while (a <= 100){
            sumOdd += a;
            a += 2;
        }
        System.out.println(sumOdd);//2500

        //1-100 偶数的和
        int sumEve = 0;
        int b = 2;
        while (b <= 100){
            sumEve += b;
            b += 2;
        }
        System.out.println(sumEve);//2550
    }




    public static void main2(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 100){
            sum += a;
            a++;
        }
        System.out.println(sum);//5050
    }


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year % 100 == 0){
            if(year % 400 ==0){
                System.out.println("Century leap year");
            }else{
                System.out.println("not a leap year");
            };
        }else{
            if (year % 4 == 0){
                System.out.println("it's a normal leap year");
            }else{
                System.out.println("it is not a leap year");
            };
        };
    }

//2022
//it is not a leap year

//2024
//it's a normal leap year

//2000
// Century leap year

    /*
    switch
    public static void main(String[] args) {
    int a = 10;
    switch (a){
    case 1:
    break;
    case 2:
    break
    default:
    break;
    }

    int a = 1;循环的初始条件
    while (a <= 10){ 循环的判断条件
        system.out.println(a);
        a++; 循环的步进
    }






      * */



}
