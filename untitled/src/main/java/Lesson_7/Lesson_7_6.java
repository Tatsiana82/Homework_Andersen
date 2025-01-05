package Lesson_7;

public class Lesson_7_6 {
    public static void main(String[] args) {

        System.out.println("\nTask 6: ");
        fillArray(100);
    }

    //Task_6
    public static void fillArray(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }
}