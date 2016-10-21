package hometasks.algorithms.task4;

/**
 * Created by Dinara&Shaman on 10/21/2016.
 */
public class App {
    public static void main(String[] args) {
        int[] mass = new int[20];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 9 + 1);
        }

        System.out.println("Массив: ");
        printArray(mass);
        System.out.println("Массив в обратном порядке: ");
        printArrayInvert(mass);
        System.out.println("Четные элементы массива: ");
        printArrayElemEven(mass);
        System.out.println("Нечетные элементы массива: ");
        printArrayElemOdd(mass);
        System.out.println("Сумма элементов, кратных 7: " + printSummElemSeven(mass));
        System.out.println("Произведение элементов, кратных 3: " + printMultElemThree(mass));
    }

    private static void printArray(int[] mass) {
        for (int element : mass) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void printArrayInvert(int[] mass) {
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }

    private static void printArrayElemEven(int[] mass) {
        for (int element : mass) {
            if (element%2 == 0)
                System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void printArrayElemOdd(int[] mass) {
        for (int element : mass) {
            if (element%2 != 0)
                System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int printSummElemSeven(int[] mass) {
        int summ = 0;

        for (int element : mass) {
            if (element%7 == 0)
                summ += element;
        }

        return summ;
    }

    private static int printMultElemThree(int[] mass) {
        int multiply = 1;

        for (int element : mass) {
            if (element%3 == 0)
                multiply *= element;
        }

        return multiply;
    }
}
