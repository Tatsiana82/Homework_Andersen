package lesson_9;
//Task_1-5
public class Cat extends Animal {
    private boolean isFed;
//Task_3
    public Cat() {
        run = 200;
        swim = 0;
        isFed = false;
    }

    public void eat(Plate plate, int amount) {
        if (amount <= 0) {
            System.out.println("The amount of food must be positive");
            return;
        }
        if (amount <= plate.getFood()) {
            plate.decreaseFood(amount);
            isFed = true;
            System.out.println("The cat ate");
        } else {
            System.out.println("There is not enough food in the plate");
        }
    }

    public boolean isFed() {
        return isFed;
    }
}