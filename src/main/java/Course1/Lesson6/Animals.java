package Course1.Lesson6;

public abstract class Animals {
    protected boolean run;
    protected boolean swimming;
    protected String name;
    static int counter = 0;

    public Animals(String name, boolean run, boolean swimming) {
        this.name = name;
        this.run = run;
        this.swimming = swimming;
        counter++;
    }
    public Animals(String name, boolean run) {
        this.name = name;
        this.run = run;
        counter++;
    }

    void running(int distance) {
        System.out.println("Животное пробежало " + distance);
    }

    void swimming(int distance){
        System.out.println("Животное проплыло " + distance);
    }
}