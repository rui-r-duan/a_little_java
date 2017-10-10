package pie;

public class LtdSubstV extends SubstV {
    int c;
    public LtdSubstV(int _c, Object _n, Object _o) {
        super(_n, _o); // call to 'super()' must be first statement in constructor body
        c = _c;
    }
    //--------------------------------
    public PieD forTop(Object t, PieD r) {
        if (c == 0) {
            return new Top(t, r);
        }
        else {
            if (o.equals(t)) {
                return new Top(n, (PieD)r.accept(new LtdSubstV(c - 1, n, o)));
            }
            else {
                return new Top(t, (PieD)r.accept(this));
            }
        }
    }
}
