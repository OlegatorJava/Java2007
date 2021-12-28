package Course1.Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(SumofNumbers(2,4));
        definition(15);
        definition2(-4);
        Text ("Это Java, детка! ", 5);
        leapYear(1600);

    }
    public static boolean SumofNumbers(int a, int b){ //проверяет положительная или отрицательная сумма чисел
        if (10 <= a + b || a + b >= 20){
            return true;
        } else {
            return false;
        }
    }

    public static void definition(int a) { //проверяет положительное или отрицательное число
    if(a>=0){
        System.out.println("Число положительное");
    } else {
        System.out.println("Число отрицательное");
    }
    }
    public static boolean definition2(int a){ //проверяет положительное или отрицательное число
        if(a>=0){
            return false;
        }else {
            return true;
        }
    }

    public static void Text (String txtToPrint, int a) { //выводит в консоль текст а раз.
        for (int i = 0; i < a; i++) {
            System.out.println(txtToPrint);
        }

    }
    public static void leapYear(int year){  /* В задании сказано чтобы метод был boolean и возвращал true или false
    для этого надо вместо void написать boolean и в теле if написать return true или false, но я решил сделать так,
    так как это нагляднее.*/
        if(year % 400 == 0){
            System.out.println("Год високосный");
        }else if(year % 100 == 0){
            System.out.println("Год не високосный");
        }else if(year % 4 == 0){
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }
    }
}
