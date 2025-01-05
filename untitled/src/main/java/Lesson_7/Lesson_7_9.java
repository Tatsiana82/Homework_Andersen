package Lesson_7;

public class Lesson_7_9 {
    public static void main(String[] args) {

        System.out.println("\nTask 9: ");
        twoArguments(5, 7);
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