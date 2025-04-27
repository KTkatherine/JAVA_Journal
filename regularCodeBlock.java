package JavaSE_7_29;

public class regularCodeBlock {
    public static class Main{
        public static void main(String[] args) {
            { //直接使用{}定义，普通方法块
                int x = 10 ;
                System.out.println("x1 = " +x);
            }
            int x = 100 ;
            System.out.println("x2 = " +x);
        }
    }
// 执行结果
    //x1 = 10
    //x2 = 100
}
