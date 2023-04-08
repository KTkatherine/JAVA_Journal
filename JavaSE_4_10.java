import java.util.Arrays;

public class JavaSE_4_10 {
    // 如何把一个数组对象转为字符串对象
    public static void main(String[] args) {
        int[] data = {1,3,5};
        //JDK内置的工具类
        String str = Arrays.toString(data);
        System.out.println(str);
    }
}
