import java.util.Scanner;

public class JavaSE_4_03 {

    /**
     int <-> char
        Interchange between int and char: Inside the computer is 0 and 1,
            char characters will be converted to int according to different encoding rules.
                <Coding is to convert different words and symbols into numbers according to certain rules.>

        char 2 byte
        int 4 byte

     int <-> string
     */
        //int--->char
    public static void main(String[] args) {
        char a = 'a';
        int b = a;
        char c = 'A';
        int d = c;
        System.out.println(b);//97
        System.out.println(d);//65

        //char--->int
        int e = 97;
        char f = (char) e;//force interchange
        System.out.println(f);//a

        //int---> String
        //1, Using string +         //2, Using valueOf
        int num = 10;
        String str1 = String.valueOf(num);
        System.out.println(str1);
        String str2 = "" + num;//10
        System.out.println(str2);//10 ---> any type "" +  will transfer other type to string

        // String ---> int    using Interger.parseint()
        String str = "123";
        int g = Integer.parseInt(str);
        System.out.println(g);//123

        //String str3 = "1a2b3"; ---> str included the non - number
        //int h = integer.parseInt(str3);
        //System.out.println(h);//java: cannot find symbol

        /**
         2.1 Arithmetic operators
         */
        //153 How to use modulo to get the ones place, the tens place and the hundreds place. (Calculating residue)
        System.out.println(153 % 10);//3
        System.out.println(153 / 10 % 10);//53
        System.out.println(153 % 100);//53
        System.out.println(153 % 1);//0
        System.out.println(153 / 100 % 10);//1
        // ---> 不想要那几位就直接除以10^n
        double h = 11.5;
        int i = 2;
        System.out.println(h % i);//1.5

        /**
         2.2 Incremental assignment（增量赋值运算）
         +=
         a += 1 <=> a = a + 1
         *=
         b *= 2 <=> b = b * 2
         */

        /**
         2.3 Increment and decrement operators
         a++ : take the value of a then increment
         ++a : increment then take the value of a
         */
        int j = 1;
        System.out.println(j++);//1
        int k = 1;
        System.out.println(++k);//2

        /**
         2.4 Both the relational == != > < <= >=and logical operators produce Boolean values.

         2.5 logical operators
         &&逻辑与 ：Both operands are true and return true, while either is false and returns false.
         ||逻辑与：Both operands are false and return false, and either is true.
         ! 取反：Operand true returns false and vice versa.

         && and || :They all belong to short-circuit operators （短路操作符）
         && One expression returns false, and the remaining expressions are not evaluated

         || One expression returns true, and the remaining expressions are not evaluated

         When multiple operand are Boolean value, & and | can also present logical elements,
         but does not meet the short-circuit operator, all conditions will judge again.
         */
        // &&
        int l = 10;
        int m = 20;
        int n = 30;
        System.out.println(l < m && m < n);//true
        System.out.println(l < m && m > n);//false

        // ||
        System.out.println(l < m || m < n);//true
        System.out.println(l < m || m > n);//ture

        // !
        System.out.println(!(m > n));//ture

        //multiple operand
        System.out.println(10 > 20 & 10 / 1 == 10);//false
        System.out.println(10 < 20 & 10 / 1 == 10);//ture
        System.out.println(10 > 20 | 10 / 1 == 10);//ture

        /**
         2.5
         & bitwise and 按位与: If both binary bits are 1, 1 is returned, otherwise 0 is returned.

         | bitwise or 按位或：Both binary bits have a 1 and return 1, and both are 0 and return 0.

         ~ Negate bitwise 按位取反： The bit is converted from 0 to 1, 1 to 0.  [Subtract 1 from the negative].

         ^bitwise exclusive-OR按位异或： Two binary bits that are the same return 0 and different return 1
         */
        //&
        System.out.println(l & m);//0

        //|
        System.out.println(l | m);//30

        //~
        int o = 10;
        int p = -20;
        System.out.println(~o);//-11
        System.out.println(~p);//19

        //^;
        System.out.println(l ^ m);//30

        /**
         2.6 shift operation
         10 << 1: binary bit shift to the left 1 position, which is the original number * 2. [10100], 10 << 2 [101000]
         10 >> 1:binary bit shift to the right 1 position, which is the original number / 2. [101]

         2.7 conditional operator
         expression1 ? expression2: expression3
         when exp1 is ture, then take the value of exp2, otherwise take the value of exp3
         */
        //conditional operator
        int max = l > m ? l : m;
        int min = l < m ? l : m;
        System.out.println(max);//20
        System.out.println(min);//10

        /**
         precedence of operator: Parentheses surround operators that need to be evaluated first
         */

        /**
         1.1 if: single branch, multiple branch, branch statements are nested (分支语句嵌套)
         if(expression1){}
         if(expression2){}
         //Expressions 1 and 2 can be satisfied at the same time

         if(expression1){}
         else if (expression2){}
         Expressions 1 and 2 are mutually exclusive, we can only take if or else if.



         writing criterion: {} is a code block

         if(expression1){
         } else if (expression2) {
         } else {
         }

         */
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }// even number

        //multiple branch
        int testNum = 0;
        if (testNum > 0) {
            System.out.println("positive value");
        } else if (testNum < 0) {
            System.out.println("negative value");
        } else {
            System.out.println("value is 0");
        }

        //Branch statements are nested
        // Leap years are divided into century leap years and ordinary leap years, Century leap years are divisible by 400.
        //--->>When a year is divisible by 100, judge the century leap year to divide by 400.
        int year = 1992;

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                //this time the year is a multiple of 100, we goto judge if it is a century leap year
                System.out.println("Century leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            // this year is not a multiple of 100, we goto judge if it is an ordinary leap year
            if (year % 4 == 0) {
                System.out.println("ordinary leap year");
            } else {
                System.out.println("not leap year");
            }
            // 2000: Century leap year //1990: not leap year //1992: ordinary leap year
        }

        //Suppose you have a two-digit number.Count the number of times that a 9 appears in this number.
        // count ++ <=> count = count + 1.
        int number9 = 99;
        int count = 0;
        if (num % 10 == 9) ;
        {
            count++;
        }// the units of this number is 9.

        if (number9 / 10 == 9) {//the tens of this number is 9
            count++;
        }
        System.out.println(count);//2

        int countNum = 1;
        if (countNum++ == 2) {
            System.out.println("true1");
        }
        if (++countNum == 3) ;
        System.out.println("true2");//true2

        int countNumber = 1;
        if (countNumber++ == 1) {
            System.out.println("true1");
        }// true1

        int r = 1;
        System.out.println(r++);//1 count++是后加，即先赋值在做加法
        System.out.println(++r);//3 ++count 是先自加，即先做加法再赋值
        int s = 1;
        System.out.println(++s);//2
        System.out.println(s++);//2

        //*** The else matches the closest if
        int x = 10;
        int y = 20;
        if (x != 10) {
            if (y == 20) {
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }//No

        /***
         Switch: indicates multiple selection.
         Switch can only use to (int /char /enum /String), met the break or finished all the branch then
         it's going to stop the progress.
         */
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");//day = 1 // Monday
                break;
            case 2:
                System.out.println("Tuesday");//day = 2 // Tuesday

            case 3:
                System.out.println("Wednesday");//day = 3, remove case 2 and case 3's break. // Wednesday (& next lane) Thursday

            case 4:
                System.out.println("Thursday");//day =
                break;
            case 5:
                System.out.println("Friday");//day = 5 // Friday
                break;
            case 6:
                System.out.println("Saturday");//day =
                break;
            default:
                System.out.println("Sunday");//day =
                break;
        }

        /**
         while

         while (终止条件 loop termination condition ---> the expression is true,
         then execute the loop body code until the expression returns false){
         //loop body code
         }

         In while: break means stop current loop, continue means skip this loop and continue to the next one

         break 只能终止当前循环，
            e.g. while() {
                    while() {         《《《
                    if() {
                        break;
                    }
                }
            }

         想把外层循环也终止？
            若此时需要跳出本次循环的同时跳出外层循环。有两种方法：
         return;//终止当前方法的调用

         break label的使用


         */
        // print out 1 to 10
        int numW = 1;
        while (numW <= 10) {
            System.out.println(numW);// 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 ..........,
            // if numW = 0, this part going to print out 0 0 0 0 0 ....
            numW += 1;
        }//vertical vision: 1 2 3 4 5 6 7 8 9 10

        int numT = 1;
        while (numT <= 10) {
            numT += 1;
        }
        System.out.println(numT);// 11

        int numS = 1;
        while (numS <= 10) {
            numS += 1;
            System.out.println(numS);
        }//vertical vision: 2 3 4 5 6 7 8 9 10 11    */

        //calculate the sum from 1 to 10
        int numSum = 1;
        int rSum = 0;//存储最后的计算结果
        while (numSum <= 10) {
            rSum += numSum; // rSum = rSum + numSum
            numSum += 1;
        }
        System.out.println(rSum);//55

        //use while loop to calculate 10! (10 factorial) = 10 * 9 * 8 * 7......* 1
        int numberf = 1;
        int resultf = 1;//不能为0 , 否则最后一乘结果就为0了
        while (numberf <= 10) {
            resultf *= numberf;
            numberf ++;
        }
        System.out.println(resultf);//3628800

        //calculate: 1! + 2! + 3! + 4! + 5! = 1 + 2 + 6 + 24 + 120 = 153
        int num5f = 1;//走1这个数
        int result5f = 0;//计算每个阶乘的和,所以从0开始,从1 开始就多加了一次.
        while (num5f <= 5) {//计算当前num5f走到哪个数了
            int tmpResult5 = 1;//每次循环记录当前的阶乘值
            int tmp = 1;//内层循环
            //计算当前num5f 的阶乘值 1*2*..*计算当前num5f
            while (tmp <= num5f) {
                tmpResult5 *= tmp;
                tmp++;
            }//此时tmpr5f就存储了当前num5f的阶乘值
            result5f += tmpResult5;
            num5f++;
        }
        System.out.println(result5f);//153

        int num5 = 1;
        int r5 = 0;
        while (num5 < 5) {
            int tempnum = 1;
            int tempr = 1;//计算每个阶乘的和,所以从0开始,从1 开始就多加了一次.
            while (tempnum <= num5) {
                tempr *= tempnum;
                tempnum++;
            }
            r5 += tempr;
            num5++;
            //System.out.println(r5);// vertical vision:1 3 9 33
        }
        System.out.println(r5);//33 (=1! + 2! + 3! + 4! ) ，少了5！=120

        int numTest = 1;
        int ret = 0;
        while (numTest <= 5) {
            int tmpRet = 1;//计算每个阶乘的和,所以从0开始,从1 开始就多加了一次.
            int tmp = 1;
            while (tmp < numTest) {
                tmpRet *= tmp;
                tmp++;
            }
            ret += tmpRet;
            numTest++;
            //System.out.println(ret);//vertical vision:1 2 4 10 34
        }
        System.out.println(ret);//34
        ///*** 只改变tmmp <= nummTest的符号//1 3 9 33 & 1 2 4 10 因为<= 就从1 开始， 二 < 从0开始每项加1？？？
        //解决了：
        //the first loop ret = 1 第一次循环进去，由于1不小于1，所以ret +=1
        //the second loop ret = 2 第二次由于1<2,但是只计算1*1，计算不到1*2，所以这时候ret+=1,此时等于2了。
        //the third loop ret = 4 第三次由于1<3，但是只执行到1*2，所以此时ret+=2,此时等于4
        //the fourth loop ret = 10 第四次由于1<4，但是只执行到1*2*3，所以此时ret+=6,此时等于10
        //the fifth loop ret = 34



        int numtest = 1;// int numtest = 0; int reT = 0 //vertical vision:1 2 3 5 11
        int retT = 0;//int retT = 1 //vertical vision:2 3 5 11 11
        while (numtest < 5) {
            int tmpRT = 1;//int tmpRT = 0,打印结果：vertical vision：0 0 0 0 0
            int tmpT = 1;//int tmp = 0,打印结果：vertical vision：0 0 0 0 0
            while (tmpT < numtest) {//tmpT <=3
                tmpRT *= tmpT; //1=1*1, 2=2*1, 3= 3*2
                tmpT++;
            }
            retT += tmpRT;
            numtest++;
            //System.out.println(retT);//vertical vision:1 2 4 10 10 (0+1 1+1 3+1 9+1)
        }
        System.out.println(retT);//10

        int nummTest = 1;
        int reT = 0;
        while (nummTest <= 5) {
            int tmmpRet = 1;
            int tmmp = 1;
            while (tmmp <= nummTest) {
                tmmpRet *= tmmp;
                tmmp++;
            }
            reT += tmmpRet;
            nummTest++;
            System.out.println(reT);
        }//(vertical vision)  1 3 9 33 153 >>> 1! 1!+2! 1!+2!+3! 1!+2!+3!+4! 1!+2!+3!+4!+5!
        System.out.println(reT);//153


        //In while: break means stop current loop, continue means skip this loop and continue to the next one
        //Write the program to output the first occurrence of a multiple of 3 between 100 and 200, and the loop terminates when the first multiple of 3 is found.
        int numberM = 100;
        while (numberM <= 200){
            if (numberM % 3 == 0) {
                System.out.println(numberM);
                break;
            }
            numberM ++;
        }//102
       // System.out.println(numberM);//102

        //Write the program to output all multiples of 3 between 100 and 200
        int num3 = 100;
        while (num3 <= 200) {
            if (num3 % 3 != 0) {
                num3++;
                continue;
            }
            System.out.println("num3 is multiple of 3 " + num3);
            num3++;
        }//
 /*     num3 is multiple of 3 102
        num3 is multiple of 3 105
        num3 is multiple of 3 108
        num3 is multiple of 3 111
        num3 is multiple of 3 114
        num3 is multiple of 3 117
        num3 is multiple of 3 120
        num3 is multiple of 3 123
        num3 is multiple of 3 126
        num3 is multiple of 3 129
        num3 is multiple of 3 132
        num3 is multiple of 3 135
        num3 is multiple of 3 138
        num3 is multiple of 3 141
        num3 is multiple of 3 144
        num3 is multiple of 3 147
        num3 is multiple of 3 150
        num3 is multiple of 3 153
        num3 is multiple of 3 156
        num3 is multiple of 3 159
        num3 is multiple of 3 162
        num3 is multiple of 3 165
        num3 is multiple of 3 168
        num3 is multiple of 3 171
        num3 is multiple of 3 174
        num3 is multiple of 3 177
        num3 is multiple of 3 180
        num3 is multiple of 3 183
        num3 is multiple of 3 186
        num3 is multiple of 3 189
        num3 is multiple of 3 192
        num3 is multiple of 3 195
        num3 is multiple of 3 198*/

        //break label的使用
        int numBL = 100;
        alabel : while (numBL <= 200) {
            int aSet = 1;
            while (aSet <= 10) {
                if (aSet % 3 == 0) {
                    //直接推出两次循环
                    System.out.println(aSet);//3
                    break alabel;
                }
                aSet++;
            }
        }
        System.out.println("The loop terminates both times");//The loop terminates both times

        /**
         
         for(初始化条件1；循环终止条件2；更新循环变量3){
         //循环体代码4
         }
         运行时：1243243243......
         123 All three conditions are optional and can be empty

         * */
        // print all the numbers from 0 - 10
        for (int qn = 0; qn <= 10; qn++) {
            System.out.println(qn);
        }//vertical vision:0 1 2 3 4 5 6 7 8 9 10

        //123 All three conditions are optional and can be empty
        int in = 1;
        for (;;) {
            if (in > 10) { // 终止条件
                break;
            }
            System.out.println(in);
            in++;
        }//vertical vision:0 1 2 3 4 5 6 7 8 9 10// in = 0 --->vertical vision:0 1 2 3 4 5 6 7 8 9 10

        // use for to calculate 5 factorial
        int numF = 0;//最外层循环表示数字从1走到5.
        for (int Fi = 1; Fi <= 5; Fi++) {
            int tempnumF = 1;//记录Fi 的阶乘值
            for (int Fj = 1; Fj <= Fi ; Fj++) {//内层循环计算当前i 的阶乘值
                tempnumF *= Fj;
            }
            numF += tempnumF;
        }
        System.out.println(numF);//153

        /**
         * System Output:
            System.out.println(msg);//输出一个字符串，带换行
            System.out.print(msg);//输出一个字符串，不带换行
            System.out.printf(format, msg);//格式化输出 (格式化字符串) ---》 有个表的。
         */
        for (int q = 1; q < 11; q++) {
            System.out.print(q + " ");//1 2 3 4 5 6 7 8 9 10
        }


       // format string
        int numQ = 100;
        System.out.printf("numQ = %d",numQ);//numQ = 100
        // if in put "numQ = %b",numQ //numQ = true

         /**
          System Input: scanner
            scanner ** = new Scanner(system.in)
          */
        Scanner scannerTest = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scannerTest.nextLine();//从键盘获取字符串输入

        System.out.println("Please enter your age");
        int age = scannerTest.nextInt();//从键盘获取一个整型

        System.out.println("please enter your salary:");
        double salary = scannerTest.nextDouble();//从键盘获取一个小数

        System.out.println("The information you entered is as follows:");

        System.out.println("name is:" + name + ", age is:" + age + ",salary is:" + salary);
//        Please enter your name:
//        katherine
//        Please enter your age
//        33
//        please enter your salary:
//        200000
//        The information you entered is as follows:
//        name is:katherine, age is:33,salary is:200000.0

        //please enter your salary:
        //100000000
        //The information you entered is as follows:
        //name is:kate, age is:22,salary is:1.0E8

        // 从键盘循环读入数字(Loop in numbers from the keyboard)
        int result = 0;
        while (scannerTest.hasNextInt()){//从键盘读取的是整数才继续循环
            int iNum = scannerTest.nextInt();
            result += iNum;
        }
        System.out.println(result);
//        1
//        3
//        5
//        7
//        adads 不是一个整数hasNextInt() ---> false
//        16














































    }
}