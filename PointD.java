abstract class PointD {
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
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")";
    }
}
