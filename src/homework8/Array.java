package homework8;

import java.util.Arrays;
import java.util.Random;

/*
 len = 3:
 fill with random

 len < 3:
 fill with even random

 len > 3:
 in:  3 1 1 2 5
 out: 3 4 5 7 12
*/
public class Array {
    static void process(int[] input) {
        if (input.length == 3) {
            for (int i = 0; i < input.length; i++) {
                input[i] = new Random().nextInt(109);
            }
        } else if (input.length < 3) {
            for (int i = 0; i < input.length; i++) {
                input[i] = new Random().nextInt(109) * 2;
            }
        } else{
            int count = 0;
            for (int i = 0; i < input.length; i++) {
                count = count + input[i];
                input[i] = count;
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
    }
}
