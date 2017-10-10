package shape;

public class Circle extends ShapeD {
    int r;
    public Circle(int _r) {
        r = _r;
    }
    //--------------------------------
    @Override
    public boolean accept(ShapeVisitorI ask) {
        return ask.forCircle(r);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + r + ")";
    }
}
