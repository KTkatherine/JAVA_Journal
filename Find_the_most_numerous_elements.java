package JavaSE_4_12;

public class Find_the_most_numerous_elements {
    /*
    多数元素
    * 给定一个大小为n的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于【n/2】的元素。
    * 假设数组是非空的，并且给定的数组总是存在多元素。
    例1：
    输入：[3,2,3]
    输出：3
    例 2：
    输入：[2,2,1,1,2,2]
    输出：2
    *
    homework_9
    * */
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
    //方法一：
        public static int majorityElement(int[] arr){
            //双引用。每次从数组中取出一个元素扫描一遍数组，查看这个元素出现的次数
            for (int i = 0; i < arr.length; i++) {
                //引入计数器
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }

                }
                if (count >= arr.length / 2) {
                    return arr[i];

                }

            }
            return -1;
        }
    }

