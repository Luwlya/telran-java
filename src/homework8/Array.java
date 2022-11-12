package homework8;

import java.util.Arrays;
import java.util.Random;

public class Array {
    static void process(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input.length == 3) {
                input[i] = new Random().nextInt(109);
            } else if (input.length < 3) {
                input[i] = new Random().nextInt(109) * 2;
            } else {
                count = count + input[i];
                input[i] = count;
            }
        }
        showArray(input);
    }

    static void showArray(int[] input) {
        System.out.print("[");
        for (int element : input) {
            System.out.print(element +", ");
        }
        System.out.println("]");
    }

    static void fillInReverse(int[] input) {
        for (int i = input.length - 1; i >= 0; i--) {
            input[i] = new Random().nextInt(109);
        }
    }

    static void fillTwoOverTwo(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (i % 4 < 2) {
                input[i] = new Random().nextInt(109);
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {23, 45, 67};
        int[] array2 = {90, 68};
        int[] array3 = {1, 2, 4, 7};
        process(array1);
        process(array2);
        process(array3);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        showArray(array1);
        fillInReverse(array1);
        showArray(array1);
        int[] array4 = new int[21];
        fillTwoOverTwo(array4);
        System.out.println(Arrays.toString(array4));
    }
}
