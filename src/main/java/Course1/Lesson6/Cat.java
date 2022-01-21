package Course1.Lesson6;

public class Cat extends Animals{

    private final int DISTANCE = 200;

    public Cat(boolean run) {
        super(run);
        swimming = false;
    }

    void running(int distance) {
        if (distance < DISTANCE) {
            System.out.println("Кошка пробежала " + distance + "м");
        } else {
            System.out.println("Кошка не может пробежать больше " + DISTANCE+ "м");
        }
    }
    void swimming(int distance){
        System.out.println("Кошка не умеет плавать");
    }
}
