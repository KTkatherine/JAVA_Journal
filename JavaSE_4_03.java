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
        int g =  Integer.parseInt(str);
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
         2.2 Incremental assignment
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


         */












    }
}