package hometasks.basictypes.task2;

/**
 * Created by Dinara&Shaman on 10/19/2016.
 */
public class Annulus extends Circle {
    int r;

    public Annulus(int R, int r) {
        super(R);
        this.r = r;
    }

    @Override
    public double getSquare() {
        return super.getSquare() - Math.PI * Math.pow(r, 2);
    }
}
