package JavaSE_7_28;

import java.util.Arrays;

public class JavaSE_7_28 {
    public static void main(String[] args) {
        int[] array = {100,12,31,14,15};
        System.out.println(toString(array));
        Arrays.sort(array,0,2);
        System.out.println(toString(array));


    }

    public static void toString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;

    }





    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array.length);//4

        //创建数组时，指定数组中元素的个数
        //int[] array1 = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);// 1 2 3 4//******for在循环遍历的时候是有下标的
        }
        System.out.println();

        //增强for 循环，for - each
        for (int x: array
             ) {
            System.out.println(x + " ");//1 2 3 4//******for在循环遍历的时候是有下标的

        }
        System.out.println();

    }

}
