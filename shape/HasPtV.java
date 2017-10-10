package shape;

public class HasPtV implements ShapeVisitorI {
    PointD p;
    public HasPtV(PointD _p) {
        p = _p;
    }
    // A functional programmer would say that newHasPt and HasPtV are
    // eta-equivalent.
    ShapeVisitorI newHasPt(PointD p) {
        return new HasPtV(p);
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
        // We hope this 'HasPtV' generator to be polymorphic for future extension.
        return s.accept(newHasPt(p.minus(q)));
    }
}
