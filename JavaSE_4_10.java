import java.util.Arrays;

public class JavaSE_4_10 {
    // 如何把一个数组对象转为字符串对象
    public static void main(String[] args) {
/*        int[] data = {1,3,5};
        //JDK内置的工具类
        String str = Arrays.toString(data);

        String str2 = arr2String(data);
        String str3 = arr3String(data);
        System.out.println(str);//[1, 3, 5]
        System.out.println(str2);//[1,3,5,]
        System.out.println(str3);//[1, 3, 5]*/

//数组拷贝
        int[] data = new int[] {1,2,3,4,5,6};
        //JDK 工具类拷贝的用法：
        /*int[] data1 = Arrays.copyOf(data,data.length); // data 是原数组名称， 后面的data.length是要拷贝的数组的长度
        // data 是原数组名称， 后面的data.length是要拷贝的数组的长度

            //1.若新数组长度<原数组长度 部份拷贝： 从元素的第一个元素开始复制值，直到元素个数达到新数组的长度停止。*/
            //2.若新数组长度 = 原数组长度 全拷贝
            //3.若新数组长度> 原数组长度，全拷贝，剩余的元素用该数据类型的默认值来补

        /*int[] data1 = Arrays.copyOf(data, 3);
        System.out.println(arr2String(data1));//[1,2,3,]*/

                //e.g.3.若新数组长度> 原数组长度，全拷贝，剩余的元素用该数据类型的默认值来补
        int[] data1 = Arrays.copyOf(data, 10);
        System.out.println(arr2String(data1));//用0补齐，因为整型的默认值就是0.//[1,2,3,4,5,6,0,0,0,0,]


//数组的区间拷贝，从开始位置拷贝到结束位置，左闭右开
        int[] data2 = Arrays.copyOfRange(data,1,4);
        System.out.println(arr2String(data2));//[2,3,4,]

        int[] dataMax = {1,7,6,4,2,3,9,11,15,20,87,12};
        System.out.println(max(dataMax));

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



// 给定一个整数数组，找出这个数的最大值？“打擂”
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {//从第二个数开始比
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
