package JavaSE_7_28;

public class UseFunctionToFindMax {
    public static int max2(int a, int b){
        return a > b ? a : b;
    }

    public static int max3(int a, int b, int c){
        return max2(max2(a,b),c);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 1;
        System.out.println(max3(a,b,c));//5
    }
}
