package shape;

public abstract class PointD {
    int x;
    int y;

    PointD(int _x, int _y) {
        x = _x;
        y = _y;
    }
    //--------------------------------

    public boolean closerToO(PointD p) {
        return distanceToO() <= p.distanceToO();
    }
    public PointD minus(PointD p) {
        return new CartesianPt(x - p.x, y - p.y);
    }
    public abstract int distanceToO();
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")";
    }
}

