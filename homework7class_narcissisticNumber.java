package JavaSE_7_27;
import java.util.Scanner;
public class homework7class_narcissisticNumber {
    public static void main(String[] args) {
        /*
        Find all narcissistic between 0~999
        the narcissistic number refers to a triple-digit, the sum of each cubic digit equals to the number itself
        */
        for (int i = 0; i < 999; i++) {
            int count = 0;//计算当前i有几位数
            int tmp = i;
            while (tmp != 0){
                count++;
                tmp = tmp/10;
            }
            //count 的值是多少已经计算完成
            //计算i(tmp)的每一位
            tmp = i;
            int sum = 0;
            while (tmp != 0){
                sum += Math.pow(tmp%10,count);
                tmp /= 10;
            }
            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
