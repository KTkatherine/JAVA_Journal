package JavaSE_4_12;

public class Homework_7 {
    //2022_04_10_5 数组的定义与使用—作业
    /*
    *给定一个整数数组 nums 和一个整数目标值 target,请你在该数组中找出和为目标值target的那两个数，并返回他们的下标。
    * 你可以假设每种输入只会对应一个答案，但是， 数组中同一个元素在答案里不能重复出现。
    * 你可以按任意顺序返回答案。
    *示例1：
    * 输入：nums = [2,7,11,15], target = 9
    * 输出：[0,1]
    * 解释：因为nums[0] + nums[1] == 9, 返回[0,1]
    * 输入：nums = [2,2,3,1], target = 4 .返回不能是[0,0]数组中同一个元素在答案里不能重复出现

    * */
    //双引用
    //引入两个变量i和j， i 从头开始遍历，j从后向前扫描直到走到i 之前（同一个元素 不能出现多次）

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target = 9;
        int[] ret = twoSum(nums1,target);
        System.out.println(arr2String(ret));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if(nums[i] + nums[j] == target){
                    //找到答案
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }

        }
        return ret;//每个路径都要有出口
    }

    public static String arr2String(int[] num) {
        String ret = "[";
        for (int i = 0; i < num.length; i++) {
            ret += num[i];
            ret += ",";
        }
        ret += "]";
        return ret;
    }

}
