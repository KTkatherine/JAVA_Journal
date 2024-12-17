package JavaSE_7_27;

public class Homework_5_sum_of_fractions {
    public static void main(String[] args) {
        /*

        * 求分数的和
        1/1 - 1/2 + 1/3 - 1/4 +.........1/100


        **符号一加一减 放一个flag= 1，乘以flag。， 后面一个flag = 前一个负的flag
        **1/2= 0 不是等于0.5，要1.0/, sum也改为double类型

        */

        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0/i * flg;
            flg= -flg;
        }
        System.out.println(sum);//0.688172179310195

    }
}
