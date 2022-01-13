package Course1.lesson3.HomeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1");

        int[] arrBin = {0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0};        // ЗАДАНИЕ 1
        for (int i = 0; i < arrBin.length; i++) {
            if (arrBin[i] == 0) {
                arrBin[i] = 1;
                System.out.print(arrBin[i] + " ");
            } else if (arrBin[i] == 1) {
                arrBin[i] = 0;
                System.out.print(arrBin[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 2");

        int[] emptyArray = new int[100];        //ЗАДАНИЕ 2
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = i + 1;
            System.out.print(emptyArray[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 3");

        int[] lessThanSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  // ЗАДАНИЕ 3
        for (int i = 0; i < lessThanSix.length; i++) {
            if (lessThanSix[i] < 6) {
                lessThanSix[i] *= 2;

            }
            System.out.print(lessThanSix[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 4");

        int[][] squareArray = new int[10][10];      //ЗАДАНИЕ 4
        for (int i = 0; i < squareArray.length; i++) {
            squareArray[i][(squareArray.length - 1) - i] = 1;
            for (int j = 0; j < squareArray.length; j++) {
                if (squareArray[i] == squareArray[j]) {
                    squareArray[i][j] = 1;
                }

                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("ЗАДАНИЕ 5");
        System.out.print(Arrays.toString(longArray(8, 7))); //ЗАДАНИЕ 5
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ 6");

        int[] maxMinArr = {-5, -8, -1, -12, -5};  //ЗАДАНИЕ 6
        int max = maxMinArr[0];                     //изначально написал max = 0, но потом понял, что это не сработает
        int min = maxMinArr[0];                     // с отрицательными значениями в массиве
        for (int i = 0; i < maxMinArr.length; i++) {
            if (maxMinArr[i] >= max) {
                max = maxMinArr[i];
            } else if (maxMinArr[i] <= min) {
                min = maxMinArr[i];
            }
        }
        System.out.println("max = " + max + " min = " + min);
        System.out.println();

        System.out.println("ЗАДАНИЕ 7");


        System.out.println(sumArray(new int[]{1, 1, 2, 1, 1, 7, 5, 1})); // ЗАДАНИЕ 7
        System.out.println();
        System.out.println("ЗАДАНИЕ 8");
        System.out.println(Arrays.toString(shiftArray(new int[]{5, 4, 2, 20, 1, 7, 5, 9}, -2))); // ЗАДАНИЕ 8


    }

    //*********************************************************************************************

    public static int[] longArray(int len, int initialValue) {      //МЕТОД ЗАДАНИЯ 5
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }

    public static boolean sumArray(int[] checkBalance) {  //МЕТОД ЗАДАНИЯ 7
        System.out.println("Массив = " + Arrays.toString(checkBalance));
        int sumLeft = checkBalance[0] + checkBalance[1];
        int sumRight = checkBalance[checkBalance.length - 1] + checkBalance[checkBalance.length - 2];
        for (int i = 2; i < checkBalance.length; i++) {

            if (sumLeft == sumRight) {
                System.out.println("сумма левой и правой стороны " + sumLeft + " = " + sumRight);
                break;
            } else if (sumLeft < sumRight) {
                sumLeft = sumLeft + checkBalance[i];
            } else {
                sumRight = sumRight + ((checkBalance.length - 1) - i);
            }
        }
        return true;
    }


    public static int[] shiftArray(int[] incomingArray, int shift) { //МЕТОД ЗАДАНИЯ 8
        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                // убираем первый элемент в буфер, а на его место ставим хвостовой элемент
                int buffer = incomingArray[0];
                incomingArray[0] = incomingArray[incomingArray.length - 1];

                // циклично сдвигаем весь массив
                for (int j = 1; j < incomingArray.length - 1; j++) {
                    incomingArray[incomingArray.length - j] = incomingArray[incomingArray.length - j - 1];
                }

                // ставим буферный элемент в 1 ячейку
                incomingArray[1] = buffer;
            }
        } else if (shift < 0) {
            for (int i = 0; i > shift; i--) {
                int buffer = incomingArray[incomingArray.length - 1];
                incomingArray[incomingArray.length - 1] = incomingArray[0];

                for (int j = 1; j < incomingArray.length - 1; j++) {
                    incomingArray[j - 1] = incomingArray[j];
                }

                incomingArray[incomingArray.length - 2] = buffer;
            }
        }

        return incomingArray;
    }

}
