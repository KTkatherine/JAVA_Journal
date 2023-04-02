public class JavaSE_4_08 {
/**
 *类名称，每个首字母大写。

 *递归的优化一般有两种思路：
    记忆化搜索、减枝（已经被计算过的数字就不再计算，直接取值--利用map集合）

    dp 动态规划 （自底向上解决问题）

 *数组：本质上就是我们能“批量”创建相同类型的变量.
            引用数据类型

 *** 语法 ***
        数组的创建与初始化：
                1.数组的动态初始化
                 数据类型【】数组名称 = new 数组类型【】{初始化数据} ---》大括号里面的数据可选
                 e.g.初始化数组是，每个元素同时赋值
                 int[] arr = new int[] {1,3,5,7,9};

                 //还有一种写法
                 数据类型【】数组名称 = new数据类型【num】---》数组是：当期数组的最大元素个数
                 e.g.
                 int[] arr = new int[5]; //这个时候，若没有用大括号来初始化每个元素的值，每个元素都是该数据类型的默认值
                 【5】相当于创建了5个都是0的元素，0，0，0，0，0


                2.数组的静态初始化 只是编译器创建的语法糖, 标准写法是上面两种---》语法糖是值存在编译期之前的语法，编译器为了方便程序员简化写法
                 数据类型【】数组名称 = {初始化数据}; //语法糖，javac编译之后，就是动态初始化
                 e.g.
                 int[] arr = {1,3,5,7,9};


        数组的使用：
                1.获取一个数组的长度(这个数组最多保存的元素个数)，使用数组名称。length
                 int[arr new int[5];//长度就是5
                 arr.length

        如何访问数组的元素：
                 使用数组名称【要访问的元素相较于第一个元素的偏移量】---》 索引就是偏移量，相较于数组的第一个元素的单位长度
                 使用数组名称【元素的索引】
                 int[] arr1 = new int[] {1,3,5,7,9}
                    取的第一个元素arr1[0]  最后一个元素的索引arr1.length-1

                    如果访问元素组里不存在的元素，系统会出现 ArrayIndexOutOfBoundsException（数组越界异常）,访问了一个非法索引，这个索引在当前数组中根本就不存在
                e.g.arr1[5]

 * 数组和方法之间的关系
    1.数组作为方法参数
                创建一个方法，接收任意的整形数组并打印
                public static void printArr(int[] num) {}

    2.关于引用数据类型的理解
                栈-先进先出LIFO结构，方法中的局部变量和形参都在栈中储存。当方法调用结束除栈时，临时变量都会被销毁

 */

//在计算fibo(48)计算fibo(3)被计算了多少次
static int  count = 0;

public static void main(String[] args) {
    int num = 1234;
    printNum(num);//alt + Enter ->快速修正错误(方法调用printNum)
    //1 2 3 4




    //传入一个任意的正整数，我就能按照低位到高位的顺序依次打印每一位的数字
    System.out.println();
    System.out.println("---------------");
    PrintNumReverse(num);
    //---------------
    //4 3 2 1





    //求一个num对应的斐波那契数
    System.out.println();
//    System.out.println(fibo(2));
//    System.out.println(fibo(5));
//    System.out.println(fibo(10));
    System.out.println(fibo(40));
    //1
    //5
    //55
    //102334155//计算这个数用了太长时间，同一个数计算太多次了





    //    dp 动态规划 （自底向上解决问题）
    System.out.println(fiboDP(40));//102334155 这次就能快很多

    System.out.println("fibo(3) has been counted for " + count + " times");
    //fibo(3) has been counted for 39088169 times






   //数组的创建与初始化
//int[] arr1 = new int[] {1,3,5,7,9};
//int[] arr2 = {1,3,5,7,9};
//通过控制台可以形成一个二进制文件
//int[] var10000 = new int[]{1,3,5,7,9}
//var10000 = new int[]{1,3,5,7,9}

    //arr.length
    int[] arr1 = new int[] {1,3,5,7,9};
    int[] arr2 = new int[5];
    System.out.println(arr1.length);//5
    System.out.println(arr2.length);//5




    //如何访问数组的元素：
    System.out.println(arr1[0]);//1
    System.out.println(arr1[4]);//9




    //访问arr1的每个元素
    for (int i = 0; i < arr1.length; i++) { //此处的i表示，数组中每个元素的 索引下标
                                                //确实拿到了每个数组的元素
        System.out.print(arr1[i] + ",");//1,3,5,7,9,
    }

        //另外一种方式，JDK1.5引入的for each 循环，增强型for循环
    System.out.println();
    for (int i : arr1){ //此处的i表示，从数组的第一个元素开始取值，第一次把第一个元素的值复制一份给i,第二次循环把第二个元素的值复制一份给i,
                                //以此类推，直到整个数组都遍历结束
                                        //只能读取数组的元素值，无法修改！i是原数组每个元素的拷贝，并不是实实在在的数组元素
        System.out.print(i + ",");//1,3,5,7,9,
    }

    System.out.println();
    for (int i = 0; i < arr1.length; i++) {
        if (i == 2) {
            arr1[i] = 55;
        }
        System.out.print(arr1[i] + ",");//1,3,55,7,9,
    }

/*    for (int i : arr1) {
        if(i == 2){
            i = 55;//没用的不会改变值
        }
    }
    System.out.println(i + ",");*/


//打印数组中的每一个数
    System.out.println();
    int[] arr = {1,3,5};
    int[] Arr1 = {2,4,6,8};
    printArr(arr);
    printArr(Arr1); //arr arr是实参：在调用方法的时候，给方法中传递的参数
   // 1 3 5 2 4 6 8





////2.关于引用数据类型的理解
int x = 10;
int y = 20;
swap(x,y);
    System.out.println("x = " + x + ", y = " + y);//x = 10, y = 20



}




//传入一个正整数num，我就能按照从高位到低位打印每一个数字
    public static void printNum(int num) {
    if (num < 10){
        //此时num是个位数，直接输出
        System.out.print(num + " ");
        return;
    }
    //程序走到这里一定是个二位数，剩下的位数交给假设已知的函数，printNum 就是用来打印剩下位数的
        //num /10 剩下位数,交给子函数
        //先输出个位以外的数字，交给函数进行打印
    printNum(num / 10);
    //打印当前个位
        System.out.print(num % 10 + " ");
    }




//传入一个任意的正整数，我就能按照低位到高位的顺序依次打印每一位的数字
    public static void PrintNumReverse(int num){
     if (num < 10){
         System.out.print(num + " ");
         return;
     }
     //只知道个位，先打印
        System.out.print(num % 10 + " ");
     //剩下高位交给子函数
        PrintNumReverse(num / 10);
    }




//求一个num对应的斐波那契数
    //在计算fibo(40)计算fibo(3)被计算了多少次
    public static int fibo(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        if (num == 3) {
            //此时在调用fibo(3)
            count++;
        }
        return fibo(num - 1) + fibo(num - 2);
    }




//    dp 动态规划 （自底向上解决问题）先求出1和2 3和4
    public static int fiboDP(int num) {
        int last1 = 1;//倒数第一个数
        int last2 = 1;//倒数第二个数
        int cur = 0;//当前要计算的斐波那契数
        for (int i = 3; i <= num; i++) {
            //fibo(3) = fibo(2) + fibo(1)
            //fibo(4) = fibo(3) + fibo(2)
            //fibo(5) = fibo(4) + fibo(3)
            cur = last2 + last1;
            last2 = last1;//在下一次循环的时候倒数第二个数等于倒数第一个数fibo(3),倒数第二个数要等与当前的倒数第一个数
            last1 = cur;
        }
        return cur;
    }




//打印数组中的每一个数
        public static void printArr(int[] num) {//int[] num是形参：在方法定义时的参数
            for(int i : num) {//数组中的每一个数
                System.out.print(i + " ");
            }
        }



//2.关于引用数据类型的理解
    public static void swap(int x, int y){
    int temp = x;
    x = y;
    y = temp;
    }

    public  static void swapArr(int[] arr){
    
    }

    }


