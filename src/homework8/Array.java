package homework8;

import java.util.Arrays;
import java.util.Random;

public class Array {

    private static Random random = new Random();

    static void process(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input.length == 3) {
                input[i] = random.nextInt(109);
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
            input[i] = random.nextInt(109);
        }
    }

    static void fillTwoOverTwo(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (i % 4 < 2) {
                input[i] = random.nextInt(109);
            }
        }
    }
    static void fillInMore(int[] input) {
        int cycleLength = 1;
        int step = 0;
        for (int i = 0; i < input.length; i++) {
            if (step < cycleLength){
                input[i] = random.nextInt(109);
                step++;
            } else {
                step = 0;
                i+= cycleLength - 1;
                cycleLength++;
            }
        }
    }

    static void fillInEven(int[] input){
        int index = 0;
        while (index < input.length){
            input[index] = random.nextInt(109) * 2;
            index++;
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
        int[] array5 = new int[31];
        fillInMore(array5);
        System.out.println(Arrays.toString(array5));
        int[] array6 = new int[15];
        fillInEven(array6);
        System.out.println(Arrays.toString(array6));
    }
}
