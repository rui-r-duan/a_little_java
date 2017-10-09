package littlejava.pie;

public class SubstV extends SubstD {
    public SubstV(Object _n, Object _o) {
        super(_n, _o);
    }
    //--------------------------------
    public PieD forTop(Object t, PieD r) {
        if (o.equals(t)) {
            return new Top(n, r.accept(this));
        }
        else {
            return new Top(t, r.accept(this));
        }
    }
}
