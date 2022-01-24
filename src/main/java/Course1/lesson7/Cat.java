package Course1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    public boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if(p.decreaseFood(appetite) == true){
            satiety = true;
            System.out.println(name + " наелся");  // выводы на экран заменяют комментарии, удобнее отслеживать, что код работает
        }else{
            System.out.println(name + " не наелся");
            p.addFeed();
            if(p.decreaseFood(appetite) == true){
                satiety = true;
                System.out.println(name + " наелся");
            }else {
                System.out.println("Кот слишком прожорливый, нужна больше тарелка");
            }
        }

    }
}
