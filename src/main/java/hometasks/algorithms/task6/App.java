package hometasks.algorithms.task6;

/**
 * Created by Dinara&Shaman on 10/21/2016.
 */
public class App {
    public static void main(String[] args) {
        int[][] array = {{0}, {1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Отражение массива по горизонтали:");
        printArrayFlipHor(array);
        System.out.println("Отражение массива по вертикали:");
        printArrayFlipVert(array);
        System.out.println("Отражение массива по горизонтали и вертикали:");
        printArrayFlipHorVert(array);

    }

    private static void printArrayFlipHor(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int anInt : array[i]) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printArrayFlipVert(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array[array.length - 1].length - 1; j >= 0; j--) {
                if (j > array[i].length - 1) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printArrayFlipHorVert(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[array.length - 1].length - 1; j >= 0; j--) {
                if (j >= array[i].length) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
