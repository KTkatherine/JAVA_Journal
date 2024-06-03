package JavaSE_4_12;

public class Homework_8 {
    /*
    给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现一次的元素。
    例1：
    输入：[2,2,1]
    输出：1
    例 2：
    输入：[4,1,2,1,2]
    输出：4
    */
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        System.out.println(singleNum(nums1));
        System.out.println(singleNum(nums2));
        /*
        1
        4
        */
    }
    public static int singleNum(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            //int count = 0,临时变量的计数值
            //内层循环表示 当前的nums[i] 在数组中出现了几次
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
            if (count == 1){
                //当前nums[i]在数组中只出现了一次
                return nums[i];
            }
        }
        return -1;
    }

}
