package pie;

public class Top extends PieD {
    Object t;
    PieD r;
    public Top(Object _t, PieD _r) {
        t = _t;
        r = _r;
    }
    //--------------------------------
    public Object accept(PieVisitorI ask) {
        return ask.forTop(this);
    }

    public String toString() {
        return "new " + getClass().getName() + "(" + t + ", " + r + ")";
    }
}
