package Course1.lesson1.HomeWork;

public class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple\n");
    }

    public static void checkSumSign() {
        int a = 18;
        int b = -27;
        if(a+b>=0){
            System.out.println("Ответ положительный");
        }else {
            System.out.println("Ответ отрицательный");
        }

    }
    public static void printColor(){
        int value = 100;
        if(value<=0){
            System.out.println("Красный");
        }else if(value<=100){
            System.out.println("Желтый");
        }else if(value>100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 7;
        int b = 8;
        if(a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
}
