package Course1.lesson7;

public class HomeWork7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 15);
        Cat cat1 = new Cat("Мурзик", 12);
        Cat cat2 = new Cat("Инокентий", 45);
        Plate plate = new Plate(40);

        Cat[] catArr = new Cat[]{cat, cat1, cat2};
        for (Cat catAll : catArr) {
            plate.info();
            catAll.eat(plate);

        }

        plate.info();
    }



}
