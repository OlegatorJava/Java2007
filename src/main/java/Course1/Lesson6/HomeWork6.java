package Course1.Lesson6;

import static Course1.Lesson6.Animals.counter;

public class HomeWork6 {
    public static void main(String[] args) {

     Dog dogBobik = new Dog(true, true);
     dogBobik.running(550);
     dogBobik.swimming(7);
     Cat catBarsik = new Cat(true);
     catBarsik.running(136);
     catBarsik.swimming(53);

        Dog dogBobik2 = new Dog(true, true);
        Dog dogBobik3 = new Dog(true, true);

        System.out.println("Общие кол-во животных = "+ counter);

    }
}
