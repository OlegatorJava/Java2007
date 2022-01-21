package Course1.Lesson6;

public class Animals {
    protected boolean run;
    protected boolean swimming;
    static int counter = 0;

    public Animals(boolean run, boolean swimming) {
        this.run = run;
        this.swimming = swimming;
        counter++;
    }
    public Animals(boolean run) {
        this.run = run;
        counter++;
    }
}