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
    System.out.println(factor(n));//120

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
}
