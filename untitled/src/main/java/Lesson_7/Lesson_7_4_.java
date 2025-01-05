package Lesson_7;

public class Lesson_7_4_ {
    public static void main(String[] args) {

        System.out.println("\nTask 4*: ");
        System.out.println(checkYear(1984));
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
}