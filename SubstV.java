class SubstV {
    Object n;
    Object o;
    SubstV(Object _n, Object _o) {
        n = _n;
        o = _o;
    }
    //--------------------------------
    PieD forBot() {
        return new Bottom();
    }

    PieD forTop(Object t, PieD r) {
        if (o.equals(t)) {
            return new Top(n, r.subst(this));
        }
        else {
            return new Top(t, r.subst(this));
        }
    }
}
