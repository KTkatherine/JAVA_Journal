import java.util.Arrays;

public class JavaSE_4_10 {
    // 如何把一个数组对象转为字符串对象
    public static void main(String[] args) {
        int[] data = {1,3,5};
        //JDK内置的工具类
        String str = Arrays.toString(data);

        String str2 = arr2String(data);
        String str3 = arr3String(data);
        System.out.println(str);//[1, 3, 5]
        System.out.println(str2);//[1,3,5,]
        System.out.println(str3);//[1, 3, 5]
    }

    //自己实现仿照JDK的数组转字符串方法
    public static String arr2String(int[] num){
        String ret = "[";
        for (int i = 0; i < num.length; i++) {
            ret += num[i];
            ret += ",";
        }
        ret += "]";
        return ret;
    }

    //希望最后一个元素之后不加逗号
    public static String arr3String(int[] num){
        String ret = "[";
        for (int i = 0; i < num.length; i++) {
            ret += num[i];
            //思考：什么时候加逗号？ -- 当i没有走到最后一个索引，我们都添加，表示后面还有元素
            if(i != num.length - 1)
            ret += ", ";
        }
        ret += "]";
        return ret;

    }
}
