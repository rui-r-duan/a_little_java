package littlejava.shape;

public class Translation extends ShapeD {
    PointD q;
    ShapeD s;
    public Translation(PointD _q, ShapeD _s) {
        q = _q;
        s = _s;
    }
    //--------------------------------
    @Override
    public boolean accept(ShapeVisitorI ask) {
        return ask.forTrans(q, s);
    }
        public String toString() {
        return "new " + getClass().getName() + "(" + q + ", " + s + ")";
    }
}
