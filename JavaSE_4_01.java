public class JavaSE_4_01 {
    /**
    Javac and Java
        The javac tool reads class and interface definitions,
        written in the Java programming language, and compiles them into bytecode class files.
        It can also process annotations in Java source files and classes.

        ~(file name).java is source file
        Actually executing the source code on the computer:
            1. javac ~.java (~.Java is complied as ~.class, oriented to the JVM（Java Virtual Machine）)
            2. java ~ implementation (The jvm loads the compiled class file into memory,
            translates the bytecode into machine code (010101, instruction), and runs it)

     int is 4 byte = 32 bit (max and min value: +-2^32, 2^0)
     1 byte = 8 bit (Bit8 = (place value)128, Bit7 = 64, Bit6 = 32, Bit5 = 16, Bit4 = 8, Bit3 = 4, Bit2 =2, Bit1 = 1)
            1 bit (binary digit) A bit is always in one of two physical states,similar to an on/off light switch.
                The state is represented by a single binary value, usually a 0 or 1.
                A single byte can support up to 256 unique characters, starting with the 00000000 byte and ending with the 11111111 byte.
                The various combinations of bit patterns provide a range of 0 to 255, which means that each byte can support up to 256 unique bit patterns.

     8 basic type (It's all in lowercase):
        byte < short < int < long (8 byte: 2^63, 2^0)

        float 4 byte < double 8 byte

        char 2 byte

        short 2 byte

        boolean only has two value, true or false

     String: character string variable, it's a reference data type not basic type

     ESC(escape character):\    (Tells the compiler that the following characters should not be processed)
                \n new line
                \t horizontal tab
                \' single quote(quotation)
                \\ backslash

     + :String concatenation for any data type

     Naming variables； Variables are all lowercase if there is only one word,
                and Capitalize the first letter if there are more than one word: int age = 10; studentName = KT

     final: A variable's data value modified by final cannot be changed, nor can its type be promoted.
     
     */

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        // Print the value of Integer.MAX_VALUE
        System.out.println(a); // 2147483647
        //integer max value + 1 will exceed the int value */
        long q = a + 1;
        System.out.println(q);//-2147483648 --->>int = a+1 will overflow and use long to receive it.

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);//2147483647
        System.out.println("Integer.MIX_VALUE = " + Integer.MIN_VALUE);//-2147483648

        System.out.println(1/2); //0
        System.out.println(1.0/2.0);//0.5

        double c = 1.1;
        double b = 1.1;
        System.out.println(c * b);//1.2100000000000002

        boolean t = true;
        boolean f = false;
        //System.out.println(t == 1);//java: incomparable types: boolean and int
        //System.out.println(f == 0);

        String name = "my name is: \'KT\'";//my name is: 'KT'
        System.out.println(name);

        String test = "\t I have horizontal tab";
        System.out.println(test);//	 I have horizontal tab

        //+ :String concatenation
        int g = 10;
        int h = 20;
        System.out.println(g + h);//30
        System.out.println("g = " + g + ", h = " + h);//g = 10, h = 20
        String result = "The result is:" + g + h;
        System.out.println(result);//The result is:1020

        //print \"Hello\"
        System.out.println("\\\"Hello\\\"");//\"Hello\"

        //final
        final byte j = 10;
        final byte k = 20;
        byte m = 30;
        byte n = 40;
        byte test1 = j + k;
        //byte test2 = m + n;
        //byte test3 = j + m;
        int o = 50;
        int p = 60;
        int int1 = o + p;
        System.out.println(test1);//30--->>byte
        System.out.println(int1);;//110--->>int

    }
}
