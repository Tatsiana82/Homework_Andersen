package lesson_9;
//Task_5
public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("The amount of food is positive");
            return;
        }
        food += amount;
    }

    public int getFood() {
        return food;
    }
}