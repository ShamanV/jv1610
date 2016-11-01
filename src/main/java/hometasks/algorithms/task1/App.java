package hometasks.algorithms.task1;

/**
 * Created by Dinara&Shaman on 10/12/2016.
 */
public class App {
    public static void main(String[] args) {
        int summ2 = getSummForMultValue(2);
        int summ3 = getSummForMultValue(3);
        int summ5 = getSummForMultValue(5);
        int summ7 = getSummForMultValue(7);

        System.out.println("Разность сумм последовательностей чисел, кратных 7 и 2: " + (summ7 - summ2));
        System.out.println("Отношение сумм последовательностей чисел, кратных 5 и 3: " + ((float) summ5 / summ3));
    }

    static int getSummForMultValue(int num) {
        String values = "Значения, кратные " + num + ":";
        int summ = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % num == 0) {
                values += " " + i;
                summ += i;
            }
        }
        System.out.println(values);

        return summ;
    }
}
