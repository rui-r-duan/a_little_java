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
    abstract int distanceToO();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class CartesianPt extends PointD {
    int x;
    int y;

    CartesianPt(int _x, int _y) {
        super(_x, _y); // without this, compiler reports error "There is no default constructor available in 'PointD'"
    }
    //--------------------------------

    @Override
    int distanceToO() {
        return (int)Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")";
    }
}

class ManhattanPt extends PointD {
    int x;
    int y;

    ManhattanPt(int _x, int _y) {
        super(_x, _y);
    }
    //--------------------------------

    @Override
    int distanceToO() {
        return x + y;
    }

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")";
    }
}
