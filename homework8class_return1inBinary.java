package JavaSE_7_27;

public class homework8class_return1inBinary {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        while(n != 0){
            count++;
            n = n&(n-1);
            //System.out.println(n);
        }
        System.out.println(count);
    }
}
