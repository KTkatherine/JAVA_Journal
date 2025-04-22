package JavaSE_7_28;

public class useFuncToFindFactorial {
    public static void main(String[] args) {
//求N的阶乘
        System.out.println(fac(5));//120
    }
 public static int fac(int n){
        if (n == 1){
            return 1;
        }
        int tmp = n*fac(n-1);
        return tmp;
 }

}
