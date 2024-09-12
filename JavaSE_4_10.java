import java.util.Arrays;

public class JavaSE_4_10 {
    // 如何把一个数组对象转为字符串对象
    static int count = 0;//记录查找的次数
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
        int[] data = new int[]{1, 2, 3, 4, 5, 6};
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
        int[] data2 = Arrays.copyOfRange(data, 1, 4);
        System.out.println(arr2String(data2));//[2,3,4,]


// 给定一个整数数组，找出这个数的最大值？“打擂”
        int[] dataMax = {1, 7, 6, 4, 2, 3, 9, 11, 15, 20, 87, 12};
        System.out.println(max(dataMax));//87

        System.out.println(data.length);//6


// 求一个数组的平均值 = 数组和数组长度
        System.out.println(avg(dataMax));//14.75


//查找一个数组中是否包含指定元素，若存在，返回第一个存在该元素的索引，若不存在返回-1
        System.out.println(find(dataMax, 15));//8
        System.out.println(find(dataMax, 100));//-1


//二分查找，必须在有序的数组中进行查找（升序或者降序）：
        int[] daTa = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(daTa,2));
        //found the element
        //1
        System.out.println(binarySearch(daTa,6));
        //found the element
        //5
        System.out.println(binarySearch(daTa,7));
        //found the element
        //6
        System.out.println(binarySearch(daTa,10));
        //-1

        //感受二分查找的速度

        int[] Data = new int[100000];
        //给10w的整型数组赋值
        for (int i = 0; i < Data.length; i++) {
            Data[i] = i + 1;
        }
        System.out.println(find(Data, 99999));//99998 (倒数第二个的索引),顺序查找需要比较99999次
        System.out.println(binarySearch(Data,99999));//99998
        System.out.println("二分查找一共比较了" + count + "次");//二分查找一共比较了26次. 二分查找查查找的次数n = log2N ==> n/2/2/2/2/2..== 1 对数算法


        int[] testData = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(isSortedArray(testData));

    }

    //自己实现仿照JDK的数组转字符串方法
    public static String arr2String(int[] num) {
        String ret = "[";
        for (int i = 0; i < num.length; i++) {
            ret += num[i];
            ret += ",";
        }
        ret += "]";
        return ret;
    }

    //希望最后一个元素之后不加逗号
    public static String arr3String(int[] num) {
        String ret = "[";
        for (int i = 0; i < num.length; i++) {
            ret += num[i];
            //思考：什么时候加逗号？ -- 当i没有走到最后一个索引，我们都添加，表示后面还有元素
            if (i != num.length - 1)
                ret += ", ";
        }
        ret += "]";
        return ret;

    }


    // 给定一个整数数组，找出这个数的最大值？“打擂”
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {//从第二个数开始比
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    // 求一个数组的平均值 = 数组和数组长度
    public static double avg(int[] data) {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum / (double) data.length;// * 1.0 也可以
    }


    //查找
    //查找一个数组中是否包含指定元素，若存在，返回第一个存在该元素的索引，若不存在返回-1
    public static int find(int[] arr, int toFind) {// （数组， 指定元素）

        //遍历
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }



//二分查找，必须在有序的数组中进行查找（升序或者降序）：
    //不断的比较待查找元素和中间元素的大小关系，不断缩小元素索引
    // 寻找元素toFind小于arr[mid],元素小于arr[mid...right], 在right = mid - 1中查找
    // 寻找元素toFind等于arr[mid]toFind == arr[mid]
    // 寻找元素toFind大于arr[mid]，在left = mid + 1中查找

    //找到元素返回索引，没找到返回-1
    //left = right说明还有一元素没有判断
    //循环终止条件一定是left > right,区间中一个元素都没有才终止循环
    public static int binarySearch(int[] arr, int toFind) {
        //定义区间的开始和结束位置
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            count ++;
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
                right = mid - 1;
            }else if (toFind > arr[mid]){
                left = mid + 1;
            }else{
                //arr[mid] = toFind
                System.out.println("found the element");
                return mid;
            }
        }
        //整个区间没有待查找元素就返回-1
        return -1;
    }

    //递归写法
    //在arr[left.. right]区间中找元素toFind的索引，没找到返回-1
    public static int binarySearchRecursion(int[] arr, int toFind, int left, int right) {
        if (left > right) {
            //这就是个空区间，一个元素都没有，根本不用找了
            return -1;
        }
        //中间还有元素，只能知道中间元素
        int mid = (left + right) / 2;
        if (arr[mid] == toFind) {
            return mid;
        } else if (toFind < arr[mid]) {
            return binarySearchRecursion(arr, toFind, left, mid - 1);
        }
        //toFind > arr[mid] 右侧区间查找
        return binarySearchRecursion(arr, toFind, mid + 1, right);

    }




//判断一个数组是否是有序数组，默认升序（前一个元素<= 后一个元素）==》 找反列
        //e.g.123456879 >> false
        public static boolean isSortedArray(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {//arr.length 索引是到最后一个数，但其仍然需要比较,会出现报错Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
                // 所以要取到倒数第二个数arr.length - 1
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
                System.out.println("Array is an ordered array");
                return true;
            }





    }









