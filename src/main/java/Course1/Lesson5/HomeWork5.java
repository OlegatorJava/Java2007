package Course1.Lesson5;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5]; // Вначале объявляем массив объектов
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                892312312, 30000, 30);
        persArray[1] = new Employee("Ivanov Sergey", "Engineer", "ivivan@mailbox.com",
                892312312, 30000, 45);
        persArray[2] = new Employee("Ivanov Petr", "Engineer", "ivivan@mailbox.com",
                892312312, 30000, 56);
        persArray[3] = new Employee("Ivanov Konstantin", "Engineer", "ivivan@mailbox.com",
                892312312, 30000, 23);
        persArray[4] = new Employee("Ivanov Viktor", "Engineer", "ivivan@mailbox.com",
                892312312, 30000, 40);


        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() > 40){
                persArray[i].info();
            }
        }

    }



}
