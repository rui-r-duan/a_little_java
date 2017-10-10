package shape;

public class ManhattanPt extends PointD {
    public ManhattanPt(int _x, int _y) {
        super(_x, _y);
    }
    //--------------------------------

    @Override
    public int distanceToO() {
        return x + y;
    }
}
