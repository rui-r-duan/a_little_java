package shape;

public class ShadowedManhattanPt extends ManhattanPt {
    int dx;
    int dy;
    public ShadowedManhattanPt(int _x, int _y, int _dx, int _dy) {
        super(_x, _y);
        dx = _dx;
        dy = _dy;
    }
    //--------------------------------
    @Override
    public int distanceToO() {
        return super.distanceToO() + dx + dy;
    }
    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ", " + dx+ ", " + dy + ")";
    }
}
