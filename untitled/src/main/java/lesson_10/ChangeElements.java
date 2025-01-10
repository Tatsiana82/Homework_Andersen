package lesson_10;

//Task_1
public class ChangeElements {

    public static <T> void exchangeElements(T[] array, int ind1, int ind2) {
        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        exchangeElements(array, 2, 3);
        for (Integer i : array) {
            System.out.print(i + " ");
        }
    }
}