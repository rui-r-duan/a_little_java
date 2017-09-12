abstract class PointD {
    abstract int distanceToO();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class CartesianPt extends PointD {
    int x;
    int y;

    CartesianPt(int _x, int _y) {
        x = _x;
        y = _y;
    }
    //--------------------------------

    @Override
    int distanceToO() {
        return (int)Math.sqrt(x * x + y * y);
    }

    boolean closerToO(CartesianPt p) {
        return distanceToO() <= p.distanceToO();
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
        x = _x;
        y = _y;
    }
    //--------------------------------

    @Override
    int distanceToO() {
        return x + y;
    }

    boolean closerToO(ManhattanPt p) {
        return distanceToO() <= p.distanceToO();
    }

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")";
    }
}
