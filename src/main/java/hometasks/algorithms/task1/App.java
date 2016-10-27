package hometasks.algorithms.task1;

/**
 * Created by Dinara&Shaman on 10/12/2016.
 */
public class App {
    public static void main(String[] args) {
        String values2 = "Значения, кратные 2:";
        String values3 = "Значения, кратные 3:";
        String values5 = "Значения, кратные 5:";
        String values7 = "Значения, кратные 7:";
        int summ2 = 0;
        int summ3 = 0;
        int summ5 = 0;
        int summ7 = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                values2 += " " + i;
                summ2 += i;
            }
            if (i % 3 == 0){
                values3 += " " + i;
                summ3 += i;
            }
            if (i % 5 == 0){
                values5 += " " + i;
                summ5 += i;
            }
            if (i % 7 == 0){
                values7 += " " + i;
                summ7 += i;
            }
        }

        System.out.println(values2);
        System.out.println(values3);
        System.out.println(values5);
        System.out.println(values7);
        System.out.println("Разность сумм последовательностей чисел, кратных 7 и 2: " + (summ7 - summ2));
        System.out.println("Отношение сумм последовательностей чисел, кратных 5 и 3: " + ((float)summ5 / summ3));
    }
}
