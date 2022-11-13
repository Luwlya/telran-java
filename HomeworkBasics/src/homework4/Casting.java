package homework4;

public class Casting {
    static byte byteVar = 27;
    static int intVar = 100000;
    static short shortVar = 100;
    static long longVar = 1000000000;

    public static void main(String[] args) {
        byteVar = (byte) intVar;
        intVar = (int) byteVar;
        shortVar = (short) longVar;
        longVar = (long) shortVar;
        shortVar = (short) intVar;
        intVar = (int) longVar;
        byteVar = (byte) longVar;
        longVar = (long) byteVar;
    }

}
