package JavaSE_4_12;

import java.util.Arrays;

public class Find_the_most_numerous_elements_3 {
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

    //方法二：摩尔投票算法:(众数问题)
    // 默认候选人就是第一个元素，
    // 一堆元素中，如果至多选择一个最多的元素，则它的票数>n/2
    //一堆元素中，如果至多选择两个最多的元素，则它的票数n>3n/
    //一堆元素中，如果至多选择m个最多的元素，则它的票数>n/(m+1)
    //的票+1（m），不得票-1(n)，最后选m-n> = 1
    public static int majorityElement(int[] arr) {
        int candidate = arr[0];
        int count = 1;
        for (
                int i = 1;
                i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) ;
                //更换候选人
                candidate = arr[i];
                count = 1;
            }
        }
        return candidate;
    }
}
