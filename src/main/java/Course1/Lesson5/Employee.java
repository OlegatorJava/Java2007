package Course1.Lesson5;

public class Employee {


    //полюшки
    private String fullName;
    private String position;
    private String email;
    private int mobileNumber;
    private int salary;
    private int age;

    //конструктор
    public Employee(String fullName, String position, String email, int mobileNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println("ФИО= " + fullName + "\nДолжность= " + position + "\nEmail= " + email +
                "\nТелефон= " + mobileNumber + "\nЗарплата= " + salary + "\nВозраст= " + age);
    }
}
