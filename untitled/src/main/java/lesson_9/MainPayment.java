package lesson_9;

public class MainPayment {
//Task_6
        public static void main(String[] args) {
            Payment payment = new Payment();

            payment.addProduct("milk", 1);
            payment.addProduct("bread", 2);
            payment.addProduct("butter", 3);
            payment.addProduct("sugar", 4);
            payment.addProduct("coffee", 5);

            payment.myProducts();

    }
}