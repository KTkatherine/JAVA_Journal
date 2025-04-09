package JavaSE_7_27;
import java.util.Scanner;
public class homework7_enterPassword {
    public static void main(String[] args) {
        /*7.编写代码模拟三次密码输入场景，最多能输入三次密码，密码正确提示“登录成功”，密码错误，可重新输入，最多可输入三次，
        三次均错，则提示退出程序。
      */
        Scanner in = new Scanner(System.in);
        int count = 3;
        while (count != 0){
            System.out.println("please enter your password, you have "+ count + " chance");
            String password = in.nextLine();
            if(password.equals("123")){
                System.out.println("Log in is successful");
                break;
            }else {
                System.out.println("password is incorrect");
                count--;
            }

        }
    }
}
