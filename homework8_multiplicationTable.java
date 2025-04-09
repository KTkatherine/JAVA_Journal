package JavaSE_7_27;
import java.util.Scanner;
public class homework8_multiplicationTable {
    public static void main(String[] args) {
        /* 输出乘法口诀表
        * 输出n*n 乘法口诀表，n 由用户输入
       */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                //System.out.print("\t"+ i + "*" + j + " = " + i*j + " ");
                System.out.print("\t"+ j + "*" + i + " = " + j*i + " ");
            }
            System.out.println();
            }
        }
    }

