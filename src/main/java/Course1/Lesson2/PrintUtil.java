package Course1.Lesson2;

import java.util.Arrays;

public class PrintUtil {

    public static void main(String[] args) {
        int[][] map = new int [3][];
        map[0] = new int[4];
        map[1] = new int[1];
        map[2] = new int[3];

        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], 5);
        }
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            //выводим номер строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
