package littlejava.shape;

public class ShadowedCartesianPt extends CartesianPt {
    int dx;
    int dy;
    public ShadowedCartesianPt(int _x, int _y, int _dx, int _dy) {
        super(_x, _y);
        dx = _dx;
        dy = _dy;
    }
    //--------------------------------
    @Override
    public int distanceToO() {
        return new CartesianPt(x + dx, y + dy).distanceToO();
    }
    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ", " + dx+ ", " + dy + ")";
    }
}
