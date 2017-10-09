abstract class PointD {
    int x;
    int y;

    PointD(int _x, int _y) {
        x = _x;
        y = _y;
    }
    //--------------------------------

    boolean closerToO(PointD p) {
        return distanceToO() <= p.distanceToO();
    }
    PointD minus(PointD p) {
        return new CartesianPt(x - p.x, y - p.y);
    }
    abstract int distanceToO();
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")";
    }
}

class CartesianPt extends PointD {
    CartesianPt(int _x, int _y) {
        super(_x, _y); // without this, compiler reports error "There is no default constructor available in 'PointD'"
    }
    //--------------------------------

    @Override
    int distanceToO() {
        return (int)Math.sqrt(x * x + y * y);
    }
}

class ManhattanPt extends PointD {
    ManhattanPt(int _x, int _y) {
        super(_x, _y);
    }
    //--------------------------------

    @Override
    int distanceToO() {
        return x + y;
    }
}

class ShadowedManhattanPt extends ManhattanPt {
    int dx;
    int dy;
    ShadowedManhattanPt(int _x, int _y, int _dx, int _dy) {
        super(_x, _y);
        dx = _dx;
        dy = _dy;
    }
    //--------------------------------
    @Override
    int distanceToO() {
        return super.distanceToO() + dx + dy;
    }
    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ", " + dx+ ", " + dy + ")";
    }
}

class ShadowedCartesianPt extends CartesianPt {
    int dx;
    int dy;
    ShadowedCartesianPt(int _x, int _y, int _dx, int _dy) {
        super(_x, _y);
        dx = _dx;
        dy = _dy;
    }
    //--------------------------------
    @Override
    int distanceToO() {
        return new CartesianPt(x + dx, y + dy).distanceToO();
    }
    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ", " + dx+ ", " + dy + ")";
    }
}
