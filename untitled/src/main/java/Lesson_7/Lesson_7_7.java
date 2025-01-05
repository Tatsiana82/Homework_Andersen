package Lesson_7;

import java.util.Arrays;

public class Lesson_7_7 {
    public static void main(String[] args) {

        System.out.println("\nTask 7: ");
        System.out.println(Arrays.toString(
                changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
    }

    //Task_7
    static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }
}