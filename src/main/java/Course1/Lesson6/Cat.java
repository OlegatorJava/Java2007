package Course1.Lesson6;

public class Cat extends Animals{

    private final int DISTANCE = 200;

    public Cat(String name, boolean run) {
        super(name, run);
        swimming = false;
    }

    @Override
    void running(int distance) {
        if (distance < DISTANCE) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " не может пробежать больше " + DISTANCE+ "м");
        }
    }
    @Override
    void swimming(int distance){
        System.out.println(name + " не умеет плавать");
    }
}
