package First;

public class HomeWorkApp {
         public static void main(String[] args) {
            System.out.println("\n------------ ");
            printThreeWords();
            System.out.println("\n------------ ");
            checkSumSign();
            System.out.println("\n------------ ");
            printColor();
            System.out.println("\n------------ ");
            compareNumbers();

        }

    //Task_2
    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Task_3
    public static void checkSumSign() {

        int a = 1;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Task_4
    public static void printColor() {
        int value = 200;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //Task_5
    public static void compareNumbers() {
        int a = 0;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }
    }
}