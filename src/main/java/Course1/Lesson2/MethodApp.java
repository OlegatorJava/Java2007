package Course1.Lesson2;

public class MethodApp {
    public static void main(String[] args) {
        int v1 = multiplication(4,10);
        int v2 = multiplication(5,7);
        //int v3 = multiplication(v1,v2);

        System.out.println("v1 = "+ v1 + " v2 = "+ v2+ "v3 = "+ multiplication(v1,v2));

    }
    public static int multiplication(int n1 , int n2){
    int result = n1 * n2;
    return result;

    }
}
