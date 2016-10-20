package hometasks.basictypes.task2;

import java.util.Scanner;

/**
 * Created by Dinara&Shaman on 10/12/2016.
 */
public class App {
    private static boolean exit;
    private static final String menuItem1 = "����� ����������";
    private static final String menuItem2 = "������� ����������";
    private static final String menuItem3 = "������� ������";
    private static final String menuItem4 = "�������� ������������";
    private static final String menuItem5 = "������� ������������";
    private static final String menuItem6 = "�������� ��������������";
    private static final String menuItem7 = "������� ��������������";

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
        System.out.println("�������� ����� ����:");
        System.out.println("1. " + menuItem1);
        System.out.println("2. " + menuItem2);
        System.out.println("3. " + menuItem3);
        System.out.println("4. " + menuItem4);
        System.out.println("5. " + menuItem5);
        System.out.println("6. " + menuItem6);
        System.out.println("7. " + menuItem7);
        System.out.println("����� - ����� ������ �����");
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
                System.out.println("������� �� �����, ��������� ����");
            }
        }
        return choise;
    }

    private static void calculateData(int choice) {
        switch (choice) {
            case 1:
                showResult(menuItem1, calculateCircleLenght());
                break;
            case 2:
                showResult(menuItem2, calculateCircleSquare());
                break;
            case 3:
                showResult(menuItem3, calculateAnnulusSquare());
                break;
            case 4:
                showResult(menuItem4, calculateTrianglePerimeter());
                break;
            case 5:
                showResult(menuItem5, calculateTriangleSquare());
                break;
            case 6:
                showResult(menuItem6, calculateRectanglePerimeter());
                break;
            case 7:
                showResult(menuItem7, calculateRectangleSquare());
                break;
            default:
                exit = true;
        }
    }

    private static double calculateRectangleSquare() {
        Rectangle rectangle = getRectangleData();
        return rectangle.getSquare();
    }

    private static double calculateRectanglePerimeter() {
        Rectangle rectangle = getRectangleData();
        return rectangle.getPerimeter();
    }

    private static double calculateTriangleSquare() {
        Triangle triangle = getTriangleData();
        return triangle.getSquare();
    }

    private static double calculateTrianglePerimeter() {
        Triangle triangle = getTriangleData();
        return triangle.getPerimeter();
    }

    private static double calculateAnnulusSquare() {
        Annulus annulus = getAnnulusData();
        return annulus.getSquare();
    }

    private static double calculateCircleSquare() {
        Circle circle = getCircleData();
        return circle.getSquare();
    }

    private static double calculateCircleLenght() {
        Circle circle = getCircleData();
        return circle.getLenght();
    }

    private static Circle getCircleData() {
        System.out.println("������� ������ \'R\'");
        Circle circle = new Circle(getUserChoice());

        return circle;
    }

    private static Annulus getAnnulusData() {
        int R;
        int r;

        do {
            System.out.println("������� ������� ������ \'R\'");
            R = getUserChoice();
            System.out.println("������� ���������� ������ \'r\'");
            r = getUserChoice();

            if (R > r)
                break;

            System.out.println("������� ������ \'R\' ������ ���� ������ ����������� ������� \'r\'.");
            System.out.println("��������� ���� ������.");

        } while (true);

        Annulus annulus = new Annulus(R, r);

        return annulus;
    }

    private static Triangle getTriangleData() {
        System.out.println("������� ������� \'a\'");
        int a = getUserChoice();

        System.out.println("������� ������� \'b\'");
        int b = getUserChoice();

        System.out.println("������� ������� \'c\'");
        int c = getUserChoice();

        Triangle triangle = new Triangle(a, b, c);

        return triangle;
    }

    private static Rectangle getRectangleData() {
        System.out.println("������� ������� \'a\'");
        int a = getUserChoice();

        System.out.println("������� ������� \'b\'");
        int b = getUserChoice();

        Rectangle rectangle = new Rectangle(a, b);

        return rectangle;
    }

    private static void showResult(String message, double result) {
        System.out.println(message + ": " + (float) result);
        printSeparateLine();
    }

    private static void printSeparateLine() {
        System.out.println("--------------------------------------");
    }
}