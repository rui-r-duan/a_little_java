package shape;

// Why do we need "implements UnionVisitorI" explicitly?
// Answer: UnionHasPtV is used as a ShapeVisitorI, and in
// Union.accept(ShapeVisitorI ask), it will be casted from a
// ShapeVisitorI to a UnionVisitorI. Without this explicit
// statement, the downcast will fail.
public class UnionHasPtV extends HasPtV implements UnionVisitorI {
    public UnionHasPtV(PointD _p) {
        super(_p);
    }
    // The overriding of newHasPt makes UnionHasPtV
    // an instance of Factory Method Pattern.
    @Override
    ShapeVisitorI newHasPt(PointD p) {
        return new UnionHasPtV(p);
    }
    //--------------------------------
    @Override
    public boolean forUnion(ShapeD s, ShapeD t) {
        return s.accept(this) || t.accept(this);
    }
}
