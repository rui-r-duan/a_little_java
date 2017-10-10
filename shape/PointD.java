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
    public int moveBy(int dx, int dy) {
        x = x + dx; // modification
        y = y + dy; // modification
        return distanceToO();
    }
    public abstract int distanceToO();
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")";
    }
}

