package Course1.Lesson6;

public class Dog extends Animals {
    private final int DISTANCE_RUN = 500;
    private final int DISTANCE_SWIM = 10;

    public Dog(boolean run, boolean swimming) {
        super(run, swimming);

    }

    void running(int distance) {
        if (distance < DISTANCE_RUN) {
            System.out.println("Собака пробежала " + distance + "м");
        } else {
            System.out.println("Собака не может пробежать больше "+DISTANCE_RUN+"м");
        }
    }
    void swimming(int distance){
        if(distance<DISTANCE_SWIM){
            System.out.println("Собака проплыла " + distance +"м");
        }else{
            System.out.println("Собака не может проплыть больше "+DISTANCE_SWIM+"м");
        }
    }



}




