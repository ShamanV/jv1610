package hometasks.basictypes.task2;

/**
 * Created by Dinara&Shaman on 10/19/2016.
 */
public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getSemiPerimeter() {
        return getPerimeter() / 2;
    }

    public double getSquare() {
        double p = getSemiPerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
