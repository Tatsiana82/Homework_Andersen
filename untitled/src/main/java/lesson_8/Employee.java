package lesson_8;

public class Employee {

    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String name, String email, String position,
                    int phone, int salary, int age) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


        public void printInformationEmployee() {
        System.out.println("Information:\n" + "Name: " + name + ";\nPosition: " + position +
               ";\nEmail: " + email + ";\nPhone: " + phone + ";\nSalary: " + salary + ";\nAge: " + age + ".");
    }
    @Override
    public String toString(){
        return(name + "\n > 40: "
               + position + "\n- "
               + email+ "\n- "
               + phone+ "\n- "
               + salary+ "\n- "
                + age);
    }
}