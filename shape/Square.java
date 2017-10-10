package shape;

public class Square extends ShapeD {
    int s;
    public Square(int _s) {
        s = _s;
    }
    //--------------------------------
    @Override
    public boolean accept(ShapeVisitorI ask) {
        return ask.forSquare(s);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + s + ")";
    }
}
