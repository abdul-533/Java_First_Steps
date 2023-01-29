public class _04_JavaDataTypes {
    public static void main(String[] args) {
        int number; // allocates an int in memory, only integer can be discarded
                    //default INT on integers

        // integers
        byte byteValue = 7; // -127 127
        short shortValue = 1645; // -32000 32000
        int intValue = 250000; // virgin by default
        long longValue = 232323232323232L;

        // decimal numbers
        //default is DOUBLE for decimal numbers
        double doubleValue = 3.1445454545556; // there are 16 digit after the period
        float floatValue = 3.144343F; // 7 digits after the period are sensitive

        // character and characters
        char Letter = 'A'; // can take one character
        String name = "Abdul"; // can store words or sentences

        System.out.println("ByteValue = " + byteValue);
        System.out.println("ShortValue = " + shortValue);
        System.out.println("IntValue = " + intValue);
        System.out.println("LongDValue = " + longValue);
        System.out.println("DoubleValue = " + doubleValue);
        System.out.println("FloataAlue = " + floatValue);
        System.out.println("Name = " + name);
        System.out.println("Letter = " +Letter);


        //Data Types Min-Max (registered)

        System.out.println("****************Data Types Min-Max ***************************8");


        System.out.println("Byte.MIN_VALUE+" +Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MAX_VALUE=" +Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);




    }
}
