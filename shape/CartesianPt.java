package shape;

public class CartesianPt extends PointD {
    public CartesianPt(int _x, int _y) {
        super(_x, _y); // without this, compiler reports error "There is no default constructor available in 'shape.PointD'"
    }
    //--------------------------------

    @Override
    public int distanceToO() {
        return (int)Math.sqrt(x * x + y * y);
    }
}
