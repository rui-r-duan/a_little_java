class SubstV implements PieVisitorI {
    // In functional programming, a visitor with fields is called a closure
    // (or a higher-order function), which would be the result of applying
    // a curried version of subst.
    // By capturing the fields (state), it can avoid handing back and forth
    // of these extra values.
    Object n; // new object that replaces the old target
    Object o; // the target object that is to be replaced
    SubstV(Object _n, Object _o) {
        n = _n;
        o = _o;
    }
    //--------------------------------
    public PieD forBot() {
        return new Bottom();
    }

    public PieD forTop(Object t, PieD r) {
        if (o.equals(t)) {
            return new Top(n, r.accept(this));
        }
        else {
            return new Top(t, r.accept(this));
        }
    }
}
