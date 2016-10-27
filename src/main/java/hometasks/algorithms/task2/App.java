package hometasks.algorithms.task2;

/**
 * Created by Dinara&Shaman on 10/12/2016.
 */
public class App {
    static String[] col4 = {
            "существующих финансовых и административных условий",
            "дальнейших направлений развитая",
            "системы массового участия",
            "позиций, занимаемых участниками в отношении поставленных задач",
            "новых предложений",
            "направлений прогрессивного развития",
            "системы обучения кадров соответствующей насущным потребностям",
            "соответствующих условий активизации",
            "модели развития",
            "форм воздействия"};
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
                System.out.println("один");
                break;
            case 2:
                System.out.println("два");
                break;
            case 3:
                System.out.println("три");
                break;
            case 4:
                System.out.println("четыре");
                break;
            case 5:
                System.out.println("пять");
                break;
            case 6:
                System.out.println("шесть");
                break;
            case 7:
                System.out.println("семь");
                break;
            case 8:
                System.out.println("восемь");
                break;
            case 9:
                System.out.println("девять");
                break;
            default:
                System.out.println();
        }
    }

    private static void printData2(int y) {
        switch (y) {
            case 2:
                System.out.print("двадцать");
                break;
            case 3:
                System.out.print("тридцать");
                break;
            case 4:
                System.out.print("сорок");
                break;
            case 5:
                System.out.print("пятьдесят");
                break;
            case 6:
                System.out.print("шестьдесят");
                break;
            case 7:
                System.out.print("семьдесят");
                break;
            case 8:
                System.out.print("восемьдесят");
                break;
            case 9:
                System.out.print("девяносто");
                break;
        }
    }

    private static void printData1(int i) {
        switch (i) {
            case 0:
                System.out.println("ноль");
                break;
            case 10:
                System.out.println("десять");
                break;
            case 11:
                System.out.println("одиннадцать");
                break;
            case 12:
                System.out.println("двенадцать");
                break;
            case 13:
                System.out.println("тринадцать");
                break;
            case 14:
                System.out.println("четырнадцать");
                break;
            case 15:
                System.out.println("пятнадцать");
                break;
            case 16:
                System.out.println("шестнадцать");
                break;
            case 17:
                System.out.println("семнадцать");
                break;
            case 18:
                System.out.println("восемнадцать");
                break;
            case 19:
                System.out.println("девятнадцать");
                break;
        }
    }
}
