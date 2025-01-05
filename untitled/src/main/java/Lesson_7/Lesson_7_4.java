package Lesson_7;

public class Lesson_7_4 {
    public static void main(String[] args) {

        System.out.println("\nTask 4: ");
        printWord("Hello, world", 7);
    }

    //Task_4
    public static void printWord(String str, int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}