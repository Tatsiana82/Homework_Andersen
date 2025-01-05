package Lesson_7;

public class Lesson_7_5 {
    public static void main(String[] args) {

        System.out.println("\nTask 5: ");
        newArray();
    }

    //Task_5
    public static void newArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
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
}