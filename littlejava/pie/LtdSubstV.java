package littlejava.pie;

public class LtdSubstV implements PieVisitorI {
    int c;
    Object n;
    Object o;
    public LtdSubstV(int _c, Object _n, Object _o) {
        c = _c;
        n = _n;
        o = _o;
    }
    //--------------------------------
    public PieD forBot() {
        return new Bottom();
    }

    public PieD forTop(Object t, PieD r) {
        if (c == 0) {
            return new Top(t, r);
        }
        else {
            if (o.equals(t)) {
                return new Top(n, r.accept(new LtdSubstV(c - 1, n, o)));
            }
            else {
                return new Top(t, r.accept(this));
            }
        }
    }
}
