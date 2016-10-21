package hometasks.algorithms.task5;

/**
 * Created by Dinara&Shaman on 10/21/2016.
 */
public class App {
    public static void main(String[] args) {
        int m = 5;
        int n = 6;
        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("������: ");
        printArray(array);
        System.out.println("������ � �������� �������: ");
        printArrayInvert(array);
        System.out.println("�������� �������� ������� ��� ������� ��������� �������: ");
        printArrayElemOdd(array);
        System.out.println();
        System.out.println("����� ���������, ������� 7 � ������ ��������: " + printSummElemSevenInEvenCol(array));
        System.out.println();
        System.out.println("������������ ���������, ������� 3 � �������� ��������: " + printMultElemThreeInOddCol(array));


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

    private static void printArrayInvert(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printArrayElemOdd(int[][] array) {
        for (int elem[] : array) {
            for (int i = 0; i < elem.length; i++) {
                if (i % 2 != 0)
                    continue;
                if (elem[i] % 2 != 0)
                    System.out.print(elem[i] + " ");
            }
        }
        System.out.println();
    }

    private static int printSummElemSevenInEvenCol(int[][] array) {
        int summ = 0;

        for (int elem[] : array) {
            for (int i = 0; i < elem.length; i++) {
                if (i % 2 == 0)
                    continue;
                if (elem[i] % 7 == 0)
                    summ += elem[i];
            }
        }

        return summ;
    }

    private static int printMultElemThreeInOddCol(int[][] array) {
        int multiply = 1;

        for (int elem[] : array) {
            for (int i = 0; i < elem.length; i++) {
                if (i % 2 != 0)
                    continue;
                if (elem[i] % 3 == 0 && elem[i] != 0)
                    multiply *= elem[i];
            }
        }

        return multiply;
    }

}
