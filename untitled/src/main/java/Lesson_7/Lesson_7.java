package Lesson_7;
import java.util.Arrays;
public class Lesson_7 {
    public static void main(String[] args) {
        System.out.println("\nTask 1: ");
        checkSum(3, 2);

        System.out.println("\nTask 2: ");
        positiveAndNegative(-1);

        System.out.println("\nTask 3: ");
        positiveOrNegative(-1);

        System.out.println("\nTask 4: ");
        printWord("Hello, world", 7);

        System.out.println("\nTask 4*: ");
        System.out.println(checkYear(1984));

        System.out.println("\nTask 5: ");
        newArray();

        System.out.println("\nTask 6: ");
        fillArray(100);

        System.out.println("\nTask 7: ");
        System.out.println(Arrays.toString(
                changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));

        System.out.println("\nTask 8: ");
        twoIntegerArr();

        System.out.println("\nTask 9: ");
        twoArguments(5, 7);
    }
    //Task_1
    public static boolean checkSum(int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Task_2
    static void positiveAndNegative(int c) {

        if (c >= 0) {
            System.out.println("Число " + c + " положительное");
        } else {

            System.out.println("Число " + c + " отрицательное");
        }
    }

    //Task_3
    public static boolean positiveOrNegative(int l) {
        if (l < 0) {
            return true;
        } else {
            return false;
        }
    }

    //Task_4
    public static void printWord(String str, int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    //Task_4*
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    //Task_5
    public static void newArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Task_6
    public static void fillArray(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }
    //Task_7
    static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }
    //Task_8
    public static void twoIntegerArr() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = arr[i].length - 1; j < arr[i].length; j++, k--) {
                if (i == j || i == k) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    //Task_9
    public static void twoArguments(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + " " + arr[i] + " ");
        }
    }
}