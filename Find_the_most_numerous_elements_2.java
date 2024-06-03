package JavaSE_4_12;

import java.util.Arrays;

public class Find_the_most_numerous_elements_2 {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 2, 2};
        System.out.println(majorityElement(nums1));
        System.out.println(majorityElement(nums2));
        /*
        3
        2
        */
    }
    //方法二：排序
    public static int majorityElement(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length >> 1]; // 等于中间位
    }

}
