package littlejava.shape;

// We assume that we are not allowed to change ShapeVisitorI for
// the new ShapeD variant Union.
// We must extend this interface for Union.
public interface ShapeVisitorI {
    boolean forCircle(int r);
    boolean forSquare(int s);
    boolean forTrans(PointD q, ShapeD s);
}
