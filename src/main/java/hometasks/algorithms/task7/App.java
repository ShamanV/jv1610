package hometasks.algorithms.task7;

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
        System.out.println("Массив со сдвигом на " + colCount + " позиций влево: ");
        moveArrLeft(array, delt);
        printArray(array);

        delt = 9;
        System.out.println("Массив со сдвигом на " + colCount + " позиций вправо: ");
        moveArrRight(array, delt);
        printArray(array);

        delt = 2;
        System.out.println("Массив со сдвигом на " + colCount + " позиций вверх: ");
        moveArrUp(array, delt);
        printArray(array);

        delt = 1;
        System.out.println("Массив со сдвигом на " + colCount + " позиций вниз: ");
        moveArrDown(array, delt);
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

    private static void moveArrLeft(int[][] array, int delt) {
        if(delt > colCount)
            delt = delt% colCount;

        int temp;
        for (int i = 0; i < delt; i++) {
            for (int row = 0; row < array.length; row++) {
                temp = array[row][0];
                for (int col = 0; col < array[row].length - 1; col++)
                    array[row][col] = array[row][col + 1];
                array[row][array[row].length - 1] = temp;
            }
        }
    }

    private static void moveArrRight(int[][] array, int delt) {
        if(delt > colCount)
            delt = delt% colCount;

        int temp;
        for (int i = 0; i < delt; i++) {
            for (int row = 0; row < array.length; row++) {
                temp = array[row][array[row].length - 1];
                for (int col = array[row].length - 1; col > 0; col--)
                    array[row][col] = array[row][col - 1];
                array[row][0] = temp;
            }
        }
    }

    private static void moveArrUp(int[][] array, int delt) {
        if(delt > rowCount)
            delt = delt% rowCount;

        int[] temp;
        for (int i = 0; i < delt; i++) {
            temp = array[0];
            for (int row = 0; row < array.length - 1; row++)
                array[row] = array[row + 1];
            array[array.length - 1] = temp;
        }
    }

    private static void moveArrDown(int[][] array, int delt) {
        if(delt > rowCount)
            delt = delt% rowCount;

        int[] temp;
        for (int i = 0; i < delt; i++) {
            temp = array[array.length - 1];
            for (int row = array.length - 1; row > 0; row--)
                array[row] = array[row - 1];
            array[0] = temp;
        }
    }
}
