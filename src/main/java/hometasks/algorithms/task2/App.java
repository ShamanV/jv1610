package hometasks.algorithms.task2;

/**
 * Created by Dinara&Shaman on 10/12/2016.
 */
public class App {
    static String[] col4 = {
            "������������ ���������� � ���������������� �������",
            "���������� ����������� ��������",
            "������� ��������� �������",
            "�������, ���������� ����������� � ��������� ������������ �����",
            "����� �����������",
            "����������� �������������� ��������",
            "������� �������� ������ ��������������� �������� ������������",
            "��������������� ������� �����������",
            "������ ��������",
            "���� �����������"};
    public static void main(String[] args) {
        int i = (int) (Math.random() * 100);
        System.out.print(i + ": ");
        printNumberInText(i);
    }

    private static void printNumberInText(int i) {
        if (i == 0 || (i >= 10 && i <= 19)) {
            printData1(i);
        } else {
            int y = i / 10;
            printData2(y);

            if (i > 20 && (y * 10 != i)) {
                System.out.print(" ");
            }

            printData3(i % 10);
        }
    }

    private static void printData3(int k) {
        switch (k) {
            case 1:
                System.out.println("����");
                break;
            case 2:
                System.out.println("���");
                break;
            case 3:
                System.out.println("���");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("����");
                break;
            case 6:
                System.out.println("�����");
                break;
            case 7:
                System.out.println("����");
                break;
            case 8:
                System.out.println("������");
                break;
            case 9:
                System.out.println("������");
                break;
            default:
                System.out.println();
        }
    }

    private static void printData2(int y) {
        switch (y) {
            case 2:
                System.out.print("��������");
                break;
            case 3:
                System.out.print("��������");
                break;
            case 4:
                System.out.print("�����");
                break;
            case 5:
                System.out.print("���������");
                break;
            case 6:
                System.out.print("����������");
                break;
            case 7:
                System.out.print("���������");
                break;
            case 8:
                System.out.print("�����������");
                break;
            case 9:
                System.out.print("���������");
                break;
        }
    }

    private static void printData1(int i) {
        switch (i) {
            case 0:
                System.out.println("����");
                break;
            case 10:
                System.out.println("������");
                break;
            case 11:
                System.out.println("�����������");
                break;
            case 12:
                System.out.println("����������");
                break;
            case 13:
                System.out.println("����������");
                break;
            case 14:
                System.out.println("������������");
                break;
            case 15:
                System.out.println("����������");
                break;
            case 16:
                System.out.println("�����������");
                break;
            case 17:
                System.out.println("����������");
                break;
            case 18:
                System.out.println("������������");
                break;
            case 19:
                System.out.println("������������");
                break;
        }
    }
}
