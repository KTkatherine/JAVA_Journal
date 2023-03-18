public class JavaSE_4_07 {
/**
    * Recursion
        * Two processes:
        递过程：函数不断调用自身，直到走到函数的终止条件，第一阶段结束

        归过程：函数不断返回的过程

    什么场景可以调用方法递归：
            a,一个原问题可以拆分为若干个小问题
            b，拆分后的子问题和原问题除了数据规模不同，解决思路完全相同
            c,必须存在递归的终止条件（不会无限拆分下去，一定能走到根儿）--拆分的思路就是解决问题的思路

 Recursive: The function keeps calling itself until it reaches the function's termination condition,
            the end of the first phase

 Return procedure: The process by which a function keeps returning


 When you can call method recursion:

 a, an original problem can be split into a number of smaller problems

 b, The split subproblem is the same as the original problem except for the size of the data

 c, there must be a recursive termination condition (don't split indefinitely, must go to the root) -
    the idea of splitting is the idea of solving the problem

e.g.求一个整数num的阶乘（这个就是求一个数num的阶乘问题）
public static int factor(int num) {

 }
原问题5!= 5*4*3*2*1
 子问题= 5*4！ 子问题=5*4*3!
        原问题和子问题的解决思路一样，只是数据大小不同
            一直拆分直到1终止


 如何写出递归代码？
 在写函数函数时，要注意这个方法（函数）到底有什么功能。就假设这个方法已经写好了，你就只用调用即可。
 写出递归代码= 终止条件 + 不借助任何方法就能实现的步骤 + 剩下的问题利用这个方法来解决
e.g.
 //传入一个整数num就能求出这个num的阶乘值
     public static int factor(int num){
    //终止条件
    if(num == 1) return 1;

    //我只直到num自己本身的值是多少，（Num-1）交给别的函数帮我处理
    return num * factor(num - 1)
    }
 */


public static void main(String[] args) {
    int n = 5;
    //求一个整数num的阶乘
    System.out.println(factor(n));//120

    //定义一个方法，求出1+2+3+...+num的和是多少
    System.out.println(sum(n));//15

    //写出一个方法，这个方法输入一个非负整数，返回组成这个数的数字之和。
    System.out.println(add(1729));//19
    System.out.println(add(12345));//15
    System.out.println(add(45));//9

//Enter any positive integer and find the corresponding Fibonacci number
    System.out.println(fibo(8));//21


}


/*    //e.g.求一个整数num的阶乘（这个就是求一个数num的阶乘问题）
public static int factor (int num){
    //终止条件
    if (num == 1) {
        //无需借助外部力量，我就知道 num = 1 阶乘就是1
        return 1;
    }
    //num >= 2
    //当前我直只知道num的值是多少，剩下的num -1 我不知道，交给别的函数处理
    //调用factor(num -1)帮我求出(num -1) !
    //最后一步只用拼接答案
    return num * factor(num - 1);
}*/

    public static int factor (int num){
        System.out.println("function starts, num = " + num);
        if (num == 1) {
            System.out.println("function ends, num = 1, ret = 1");
            return 1;
        }
        int ret = num * factor(num - 1);
        System.out.println("function ends, num = " + num + ",ret = " + ret);
        return ret;
    }
    //function starts, num = 5
    //function starts, num = 4
    //function starts, num = 3
    //function starts, num = 2
    //function starts, num = 1
    //function ends, num = 1, ret = 1
    //function ends, num = 2,ret = 2
    //function ends, num = 3,ret = 6
    //function ends, num = 4,ret = 24
    //function ends, num = 5,ret = 120

    //定义一个方法，求出1+2+3+...+num的和是多少
//传入任意一个num的值，我就可以求出1+2+3...+num的和
public static int sum(int num){
    if (num == 1){
        return 1;
    }
    // num >= 2
    //我只知道形参num的值是多少
    return num + sum(num - 1);
}

//写出一个方法，这个方法输入一个非负整数，返回组成这个数的数字之和。
    //1729 = 1 + 7 + 2 + 9 = 19
        //拆分=>把一个四位数拆分为1 + 剩下三位数的和 => 当前三位数7 + 两位数的和 => 当前十位数2 + 个位数的和
    //个位数是不用借助任何函数我就能知道答案的值（终止条件）num % 10
public static int add( int num){
    if (num < 10){
        return num;
    }
    //num至少是个十位数，我只能知道个位数是几。
    // num % 10个位的数字（保留个位）  num / 10 除了个位以外的其他数字(丢掉个位数字)
    return num % 10 + add(num/10);//9 + add(num / 10); // 2 + add(17) // 7 + add(1) // num 1

}

//Enter any positive integer and find the corresponding Fibonacci number
//num = 1,1
//num = 2,1
//num = 3,2
//num = 4,3
//num = 5,5
//num = 6,8
//num = 7,13
//num = 8,21
//num = 9,34
public static int fibo(int num){
        if (num == 1 || num == 2){
            return 1;
        }
        //斐波那契数= 前一个数的斐波那契数 + 前二个数的斐波那契数
        //fibo (num) = fibo(num - 1) + fibo(num - 2)
        return fibo(num - 1) + fibo(num - 2);
}

//按顺序输出一个正整数的每一位(只是输出)
//output each digit of a positive integer in order
//num = 1234, 输出就是1 2 3 4

    //***思路：
    //先找到最高位，按照顺序输出
    //if (num > 9){
    // 不断找最高位
    // print (num/10);//不断把当前num 个位数丢掉,去找高位
    // }
    //此时已经走到高位
    //print(num%10);

    public static void printNum(int num){
        if (num > 9);
        //还有高位，不能简单输出
        System.out.println(num + " ");
        return;
    }




}
