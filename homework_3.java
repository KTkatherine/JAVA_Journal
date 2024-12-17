package JavaSE_7_27;
import java.util.Scanner;

public class homework_3 {
    //3.给定一个数字，判定一个数字是否为素数
    // 素数只能除以1和它本身也就是从2~n-1一个都不能整除
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int k = 1; k <= n; k++) {//k是变量
            int i = 2;
            for (; i < k; i++) {
                if (k % i == 0) {//证明i不是素数
                    //System.out.println(i + "不是素数");
                    break;
                }
            }
            if (i == k) {
                System.out.println(k + "是素数");
            }
        }

    }
}
/*

* 优化时间
n = a*b
16 = 2*8    <=n/2
16=1*16
16=4*4      <=根号n

(1)
        for (int k = 1; k <= n; k++) {//k是变量
            int i = 2;
            for (; i <= k/2; i++) {
                if (k % i == 0) {//证明i不是素数
                    //System.out.println(i + "不是素数");
                    break;
                }
            }
            if (i == k/2) {
                System.out.println(k + "是素数");

(2)
       for (int k = 1; k <= n; k++) {//k是变量
            int i = 2;
            for (; i <= Math.sqrt(k); i++) {
                if (k % i == 0) {//证明i不是素数
                    //System.out.println(i + "不是素数");
                    break;
                }
            }
            if (i > Math.sqrt(k)) {
                System.out.println(k + "是素数");



*/