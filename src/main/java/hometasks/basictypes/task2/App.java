package hometasks.basictypes.task2;

/**
 * Created by Dinara&Shaman on 10/12/2016.
 */
public class App {
    public static void main(String[] args) {

        //окружность
        {
            int R = 5;
            int r = 3;

            double c = 2 * Math.PI * R; //длина окружности
            double sCirc = Math.PI * Math.pow(R, 2); //площадь окружности
            double sRing = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2)); //площадь кольца
        }

        //треугольник
        {
            int a = 3;
            int b = 4;
            int c = 5;

            double P = a + b + c; //периметр треугольника
            double p = P / 2;
            double S = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //площадь треугольника
        }

        //прямоугольник
        {
            int a = 8;
            int b = 6;

            int P = 2 * a + 2 * b; //периметр прямоугольника
            int S = a * b; //площадь прямоугольника
        }


    }
}
