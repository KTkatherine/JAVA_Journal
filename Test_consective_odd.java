package JavaSE_4_12;

public class Test_consective_odd {
    //homework_10
    //给你一个整数数组arr, 请你判断数组中是否存在连续三个都是奇数的情况如果存在请返回true,否则返回false
    public static void main(String[] args) {
        int[] nums1 = {1,2,34,3,4,5,7,23,12};
        int[] nums2 = {2,6,4,1,};
        System.out.println(isConsecutiveOdd(nums1));
        System.out.println(isConsecutiveOdd(nums2));
        /*
true
false
        */
    }

    public static boolean isConsecutiveOdd(int[] arr) {
        //表示连续出现的奇数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count ++;
                if (count == 3) {
                    //此时出现了连续的三个奇数
                    return true;
                } else {
                    //此时碰到了偶数
                    count = 0;
                }
            }

        }
        return false;
    }
}

/*
    public static boolean isConsecutiveOdd(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if(arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0){
            return true;
            }

        }
    return false;


    }
}*/
