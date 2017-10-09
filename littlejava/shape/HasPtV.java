package littlejava.shape;

public class HasPtV implements ShapeVisitorI {
    PointD p;
    public HasPtV(PointD _p) {
        p = _p;
    }
    //--------------------------------
    @Override
    public boolean forCircle(int r) {
        return p.distanceToO() <= r;
    }

    @Override
    public boolean forSquare(int s) {
        return (p.x <= s) && (p.y <= s);
    }

    @Override
    public boolean forTrans(PointD q, ShapeD s) {
        return s.accept(new HasPtV(p.minus(q)));
    }
}
