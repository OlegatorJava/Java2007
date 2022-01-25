package Course1.Lesson6;

public class Dog extends Animals {
    private final int DISTANCE_RUN = 500;
    private final int DISTANCE_SWIM = 10;

    public Dog(String name, boolean run, boolean swimming) {
        super(name, run, swimming);

    }


    @Override
    void running(int distance) {
        if (run == true && distance < DISTANCE_RUN) {
            System.out.println(name + " пробежала " + distance + "м");
        } else if (run == false) {
            System.out.println(name + " не может бежать");
        } else {
            System.out.println(name + " не может пробежать больше " + DISTANCE_RUN + "м");
        }
    }

    @Override
    void swimming(int distance) {
        if (distance < DISTANCE_SWIM) {
            System.out.println(name + " проплыл " + distance + "м");
        } else {
            System.out.println(name + " не может проплыть больше " + DISTANCE_SWIM + "м");
        }
    }
}




