package JavaSE_7_28;

public class JavaSE_7_28 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array.length);//4

        //创建数组时，指定数组中元素的个数
        //int[] array1 = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);// 1 2 3 4
        }

    }

}
