package littlejava.shape;

public interface ShapeVisitorI {
    boolean forCircle(int r);
    boolean forSquare(int s);
    boolean forTrans(PointD q, PointD s);
}
