public class JavaSE_4_07 {
/**
    * Recursion
        * Two processes:
        递过程：函数不断调用自身，直到走到函数的终止条件，第一阶段结束

        归过程：函数不断返回的过程

    什么场景可以调用方法递归：
            a,一个原问题可以拆分为若干个小问题
            b，拆分后的子问题和原问题除了数据规模不同，解决思路完全相同
            c,必须存在递归的终止条件（不会无限拆分下去，一定能走到根儿）

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
    



}


    //e.g.求一个整数num的阶乘（这个就是求一个数num的阶乘问题）
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
    return num * factor(num -1);
}


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
    // num % 10个位的数字  num / 10 除了个位以外的其他数字
    return num % 10 + add(num/10);

}









}
