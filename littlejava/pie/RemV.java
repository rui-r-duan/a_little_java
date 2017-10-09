package littlejava.pie;

public class RemV implements PieVisitorI {
    Object o; // object to be removed
    public RemV(Object _o) { o = _o; }
    //--------------------------------
    public PieD forBot() {
        return new Bottom();
    }

    public PieD forTop(Object t, PieD r) {
        if (o.equals(t)) {
            return r.accept(this);
        }
        else {
            return new Top(t, r.accept(this));
        }
    }
}
