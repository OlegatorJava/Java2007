package Course1.Lesson6;

import java.util.Random;

import static Course1.Lesson6.Animals.counter;

public class HomeWork6 {
    public static void main(String[] args) {

     Dog dogBobik = new Dog("Бобик", false, true);
     Dog dogBobik2 = new Dog("Шарик", true, true);
     Dog dogBobik3 = new Dog("Тузик", true, true);
     Cat catBarsik = new Cat("Мурзик", true);


     Animals[] animals = new Animals[]{dogBobik,dogBobik2,dogBobik3,catBarsik};
        for (Animals animal : animals) {
            animal.running(distanceRun());
            animal.swimming(distanceSwimm());
            System.out.println();
        }
     dogBobik.running(550);
     dogBobik.swimming(7);

        System.out.println();

     catBarsik.running(136);
     catBarsik.swimming(53);

        System.out.println();

        System.out.println("Общие кол-во животных = "+ counter);
    }

    public static int distanceRun(){
        int random = (int) ((Math.random()*1000)+1);
        return random;
    }
    public static int distanceSwimm(){
        int random = (int) ((Math.random()*15)+1);
        return random;
    }
}
