package hometasks.basictypes.task2;

/**
 * Created by Dinara&Shaman on 10/19/2016.
 */
public class Circle {
    int R;

    public Circle(int R) {
        this.R = R;
    }

    public double getLenght() {
        return 2 * Math.PI * R;
    }

    public double getSquare() {
        return Math.PI * Math.pow(R, 2);
    }
}
