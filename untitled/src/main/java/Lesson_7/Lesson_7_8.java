package Lesson_7;

public class Lesson_7_8 {
    public static void main(String[] args) {

        System.out.println("\nTask 8: ");
        twoIntegerArr();
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
}