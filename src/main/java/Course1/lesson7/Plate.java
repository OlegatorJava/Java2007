package Course1.lesson7;

public class Plate {
    private int food;
    private int allPlate;


    public Plate(int food) {
        this.food = food;
        allPlate = this.food;
    }
    public boolean decreaseFood(int n) {
        if((food - n) >= 0) {
            food -= n;
            return true;
        }else{
            System.out.println("В тарелке не хватает еды");
            return false;
        }
    }

    public void addFeed(){
        System.out.println("Досыпаем корм");
        food = allPlate;

    }
    public void info() {
        System.out.println("Кол-во еды в тарелке: " + food);
    }

}
