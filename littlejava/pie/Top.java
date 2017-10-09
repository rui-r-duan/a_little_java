package littlejava.pie;

public class Top extends PieD {
    Object t;
    PieD r;
    public Top(Object _t, PieD _r) {
        t = _t;
        r = _r;
    }
    //--------------------------------
    public PieD accept(PieVisitorI ask) {
        return ask.forTop(t, r);
    }

    public String toString() {
        return "new " + getClass().getName() + "(" + t + ", " + r + ")";
    }
}
