package Course1.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    //Поле
    public static char[][] map;

    //Размер поля
    public static final int SIZE = 5;

    //Точек для победы
    public static final int DOTS_TO_WIN = 4;

    //Описание точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    //Сканер
    public static final Scanner SCANNER = new Scanner(System.in);
    //рандом
    public static final Random RANDOM = new Random();

    /**
     * Создание пустого поля
     */
    public static void create_empty_map() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }

    /**
     * Вывод игрового поля на экран.
     */
    public static void printMap() {
        //нумеруем верхнию строчку для человека
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека.
     */
    public static void moveHuman() {
        int x, y;
        do {
            System.out.println("Введите координаты формата х y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    /**
     * Ход ИИ.
     */
    public static void moveII() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Робот ходит: " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    /**
     * Проверка валидны ли значения поля
     *
     * @param x координата X
     * @param y координата Y
     * @return да/нет
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

    /**
     * Проверка победы.
     *
     * @param symbol Символ для которого проверяем. Крестик или нолик
     * @return true, если выиграл
     */
    public static boolean checkWin(char symbol) {

        int winDiagonal1 = 0;
        int winDiagonal2 = 0;
        for (int i = 0; i < map.length; i++) {
            int winLine = 0;
            int winColumn = 0;
            if (map[i][(map.length - 1) - i] == symbol) {
                winDiagonal2++;
            }
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == symbol) {
                    winLine++;
                }

                if (map[j][i] == symbol) {
                    winColumn++;
                }
                if (map[i] == map[j] && map[i][j] == symbol) {
                    winDiagonal1++;
                }

                if (winLine == DOTS_TO_WIN || winColumn == DOTS_TO_WIN ||
                        winDiagonal1 == DOTS_TO_WIN || winDiagonal2 == DOTS_TO_WIN) {
                    return true;
                }

            }
        }
        return false;
    }

    /**
     * Проверка что в поле не осталось ни одной ссвободной ячейки.
     *
     * @return true, если нет ни одной свободной
     */
    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        create_empty_map();
        printMap();
        while (true) {
            moveHuman();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Поздравляю с победой!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                System.out.println("Игра окончена");
                break;
            }
            moveII();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Робот выиграл");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                System.out.println("Игра окончена");
                break;
            }
        }
    }
}
