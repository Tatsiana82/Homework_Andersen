package lesson_9;

import java.util.ArrayList;
import java.util.List;

//Task_6
public class Payment {

    List<Product> productList;

    public Payment() {
        productList = new ArrayList<>();
    }

    public void myProducts(){
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void addProduct(String name, double cost) {
        productList.add(new Product(name, (int) cost));
    }

    private class Product{
        private String name;
        private int cost;

        public Product(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public String toString(){
            return(name + " : "
                    + cost );
        }
    }
}