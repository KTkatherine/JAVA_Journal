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
            if (year % 400 == 0){
            //this time the year is a multiple of 100, we goto judge if it is a century leap year
                System.out.println("Century leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }else {
            // this year is not a multiple of 100, we goto judge if it is an ordinary leap year
            if (year % 4 == 0) {
                System.out.println("ordinary leap year");
                } else {
                System.out.println("not leap year");
            }
            // 2000: Century leap year //1990: not leap year //1992: ordinary leap year
        }

        //Suppose you have a two-digit number.Count the number of times that a 9 appears in this number.
        // count ++ = count + 1.
        int number9 = 99;
        int count = 0;
        if (num % 10 == 9);{
            count ++;
        }// the units of this number is 9.

        if (number9 / 10 == 9) {//the tens of this number is 9
            count ++;
        }
        System.out.println(count);//2

        int countNum = 1;
                if (countNum  ++== 2 ){
                    System.out.println("true");
                }














    }
}