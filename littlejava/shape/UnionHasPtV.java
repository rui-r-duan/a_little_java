package littlejava.shape;

public class UnionHasPtV extends HasPtV implements UnionVisitorI {
    public UnionHasPtV(PointD _p) {
        super(_p);
    }
    //--------------------------------
    @Override
    public boolean forUnion(ShapeD s, ShapeD t) {
        return s.accept(this) || t.accept(this);
    }
}
