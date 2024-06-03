package JavaSE_4_12;

public class Homework_8_xor_operation_Find_element {

    //异或运算：异或运算的本质就是相同返回0，不同返回1.
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
        int ret = 0;
        for(int i : nums){
            ret ^= i;

        }
        return ret;
    }
}
