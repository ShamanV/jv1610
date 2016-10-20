package hometasks.basictypes.task2;

/**
 * Created by Dinara&Shaman on 10/19/2016.
 */
public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getSquare() {
        return a * b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }
}
