package lesson_8;

public class EmployeeInformation {
    public static void main(String[] args) {
        Employee empl = new Employee("Karnilava  Tatsiana Uladzimirauna", "karnilava@gmail.com",
                "QA engineer",291111111, 1000, 42);
        empl.printInformationEmployee();


        Employee empl1 = new Employee("Kuznetskaya Iryna Igarauna", "kuzn@mail.com",
                "QA engineer",292222222, 1000, 30);
        empl1.printInformationEmployee();

        System.out.println("------------------------");

        Employee empl2 = new Employee("Kuznetsky Michail Ivanavich", "mihkuzn@gmail.com",
                "Java developer",293333333, 5000, 45);
        empl2.printInformationEmployee();

        System.out.println("------------------------");

        Employee empl3 = new Employee("Salavey Taisiya Lvouna", "sol@gmail.com",
                "HR",294444444, 3000, 27);
        empl3.printInformationEmployee();

        System.out.println("------------------------");

        Employee empl4 = new Employee("Razumovich Ivan Ivanavich", "razum@gmail.com",
                "Python developer",295555555, 5100, 29);
        empl4.printInformationEmployee();

        System.out.println("------------------------");


        Employee[] emplArray = new Employee[5];

        emplArray[0] = new Employee("Karnilava  Tatsiana Uladzimirauna", "karnil@gmail.com",
                "QA engineer",291111111, 1000, 42);
        emplArray[1] = new Employee("Kuznetskaya Iryna Igarauna", "kuzn@mail.com",
                "QA engineer",292222222, 1000, 30);
        emplArray[2] = new Employee("Kuznetsky Michail Ivanavich", "mihkuzn@gmail.com",
                "Java developer",293333333, 5000, 45);
        emplArray[3] = new Employee("Salavey Taisiya Lvouna", "sol@gmail.com",
                "HR",294444444, 3000, 27);
        emplArray[4] = new Employee("Razumovich Ivan Ivanavich", "razum@gmail.com",
                "Python developer",295555555, 5100, 29);

        for(Employee employee : emplArray)
            if(employee.getAge() > 40)
                System.out.println(employee);

    }
}