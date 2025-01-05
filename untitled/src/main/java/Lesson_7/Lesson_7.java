package Lesson_7;
import java.util.Arrays;
public class Lesson_7 {
    public static void main(String[] args) {
        System.out.println("\nTask 1: ");
        checkSum(3, 2);
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
}