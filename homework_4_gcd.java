package JavaSE_7_27;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class homework_4_gcd {
//最大公约数：greatest common divisor
    //辗转相除法


    public static void main(String[] args) {
            int a = 24;
            int b = 18;
            int c = a % b;
            while (c != 0){
                a = b;
                b = c;
                c = a % b;
            }
        System.out.println(b);//6
    }
/*

*
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a % b;
            while (c != 0){
                a = b;
                b = c;
                c = a % b;
            }
        System.out.println(b);


*/

}
