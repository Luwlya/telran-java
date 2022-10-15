package homework6;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int[] arrayInt = new int[22];
        for (int a = 0; a < arrayInt.length; a++) {
            arrayInt[a] = a;
        }

        System.out.println(Arrays.toString(arrayInt));

        for (int b:arrayInt) {
            System.out.println(b);
        }

        int c = 0;
        while (c < arrayInt.length){
            System.out.println(arrayInt[c]);
            c++;
        }

        char[] arrayChar = new char[5];
        fillRandomChar(arrayChar);
        System.out.println(Arrays.toString(arrayChar));
    }

    static void fillRandomChar(char[] arrayChar){
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = (char) new Random().nextInt();
        }
    }
}
