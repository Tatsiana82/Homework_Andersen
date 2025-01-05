package Lesson_7;

public class Lesson_7_2 {
    public static void main(String[] args) {


        System.out.println("\nTask 2: ");
        positiveAndNegative(-1);
    }

    //Task_2
    static void positiveAndNegative(int c) {

        if (c >= 0) {
            System.out.println("Число " + c + " положительное");
        } else {

            System.out.println("Число " + c + " отрицательное");
        }
    }
}