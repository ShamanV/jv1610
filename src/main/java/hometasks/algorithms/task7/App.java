package hometasks.algorithms.task7;

import java.util.Arrays;

/**
 * Created by Dinara&Shaman on 10/21/2016.
 */
public class App {
    static int rowCount = 5;
    static int colCount = 7;
    static int delt;

    public static void main(String[] args) {
        int[][] array = new int[rowCount][colCount];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Массив: ");
        printArray(array);

        delt = 8;
        System.out.println("Массив со сдвигом на " + delt + " позиций влево: ");
        array = moveArrLeft(array, delt);
        printArray(array);

        delt = 9;
        System.out.println("Массив со сдвигом на " + delt + " позиций вправо: ");
        array = moveArrRight(array, delt);
        printArray(array);

        delt = 2;
        System.out.println("Массив со сдвигом на " + delt + " позиций вверх: ");
        array = moveArrUp(array, delt);
        printArray(array);

        delt = 6;
        System.out.println("Массив со сдвигом на " + delt + " позиций вниз: ");
        array = moveArrDown(array, delt);
        printArray(array);
    }

    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] moveArrLeft(int[][] array, int delt) {
        delt %= colCount;

        if (delt != 0) {
            for (int row = 0; row < array.length; row++) {
                int[] tempArray = Arrays.copyOfRange(array[row], 0, delt);
                System.arraycopy(array[row], delt, array[row], 0, colCount - delt);
                System.arraycopy(tempArray, 0, array[row], colCount - delt, tempArray.length);
            }
        }

        return array;
    }

    private static int[][] moveArrRight(int[][] array, int delt) {
        array = moveArrLeft(array, colCount - delt % colCount);
        return array;
    }

    private static int[][] moveArrUp(int[][] array, int delt) {
        delt %= rowCount;

        int[][] tempArray = Arrays.copyOfRange(array, 0, delt);
        System.arraycopy(array, delt, array, 0, rowCount - delt);
        System.arraycopy(tempArray, 0, array, rowCount - delt, tempArray.length);

        return array;
    }

    private static int[][] moveArrDown(int[][] array, int delt) {
        array = moveArrUp(array, rowCount - delt % rowCount);
        return array;
    }
}
