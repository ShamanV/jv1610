package hometasks.basictypes.task2;

import java.util.Scanner;

/**
 * Created by Dinara&Shaman on 10/12/2016.
 */
public class App {
    private static boolean exit;
    private static final String menuItem1 = "Длина окружности";
    private static final String menuItem2 = "Площадь окружности";
    private static final String menuItem3 = "Площадь кольца";
    private static final String menuItem4 = "Периметр треугольника";
    private static final String menuItem5 = "Площадь треугольника";
    private static final String menuItem6 = "Периметр прямоугольника";
    private static final String menuItem7 = "Площадь прямоугольника";

    public static void main(String[] args) {
        programm();
    }

    private static void programm() {
        exit = false;

        while (!exit) {
            showMenu();
            calculateData(getUserChoice());
        }
    }

    private static void showMenu() {
        System.out.println("Выберите пункт меню:");
        System.out.println("1. " + menuItem1);
        System.out.println("2. " + menuItem2);
        System.out.println("3. " + menuItem3);
        System.out.println("4. " + menuItem4);
        System.out.println("5. " + menuItem5);
        System.out.println("6. " + menuItem6);
        System.out.println("7. " + menuItem7);
        System.out.println("Выход - любое другое число");
        printSeparateLine();
    }

    private static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int choise = 0;

        while (true) {
            String s = scanner.next();

            try {
                choise = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введено не число, повторите ввод");
            }
        }
        return choise;
    }

    private static int getUserChoicePositiveValue() {
        int choise;

        while (true) {
            choise = getUserChoice();
            if (choise <= 0) {
                System.out.println("Введенное значение должно быть больше 0");
                System.out.println("Повторите ввод данных.");
                continue;
            }
            break;
        }

        return choise;
    }

    private static void calculateData(int choice) {
        switch (choice) {
            case 1:
                showResult(menuItem1, getCircleData().getLenght());
                break;
            case 2:
                showResult(menuItem2, getCircleData().getSquare());
                break;
            case 3:
                showResult(menuItem3, getAnnulusData().getSquare());
                break;
            case 4:
                showResult(menuItem4, getTriangleData().getPerimeter());
                break;
            case 5:
                showResult(menuItem5, getTriangleData().getSquare());
                break;
            case 6:
                showResult(menuItem6, getRectangleData().getPerimeter());
                break;
            case 7:
                showResult(menuItem7, getRectangleData().getSquare());
                break;
            default:
                exit = true;
        }
    }

    private static Circle getCircleData() {
        System.out.println("Введите радиус \'R\'");
        return new Circle(getUserChoicePositiveValue());
    }

    private static Annulus getAnnulusData() {
        int R;
        int r;

        while (true) {
            System.out.println("Введите внешний радиус \'R\'");
            R = getUserChoicePositiveValue();
            System.out.println("Введите внутренний радиус \'r\'");
            r = getUserChoicePositiveValue();

            if (R > r)
                break;

            System.out.println("Внешний радиус \'R\' должен быть больше внутреннего радиуса \'r\'.");
            System.out.println("Повторите ввод данных.");
        }

        return new Annulus(R, r);
    }

    private static Triangle getTriangleData() {
        System.out.println("Введите сторону \'a\'");
        int a = getUserChoicePositiveValue();

        System.out.println("Введите сторону \'b\'");
        int b = getUserChoicePositiveValue();

        System.out.println("Введите сторону \'c\'");
        int c = getUserChoicePositiveValue();

        return new Triangle(a, b, c);
    }

    private static Rectangle getRectangleData() {
        System.out.println("Введите сторону \'a\'");
        int a = getUserChoicePositiveValue();

        System.out.println("Введите сторону \'b\'");
        int b = getUserChoicePositiveValue();

        return new Rectangle(a, b);
    }

    private static void showResult(String message, double result) {
        System.out.println(message + ": " + (float) result);
        printSeparateLine();
    }

    private static void printSeparateLine() {
        System.out.println("--------------------------------------");
    }
}