package littlejava.shape;

public class Circle extends ShapeD {
    int r;
    Circle(int _r) {
        r = _r;
    }
    //--------------------------------
    @Override
    boolean accept(ShapeVisitorI ask) {
        return ask.forCircle(r);
    }
}
