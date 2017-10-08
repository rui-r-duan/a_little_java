class SubstV {
    PieD forBot(Object n, Object o) {
        return new Bottom();
    }

    PieD forTop(Object t, PieD r, Object n, Object o) {
        if (o.equals(t)) {
            return new Top(n, r.subst(this, n, o));
        }
        else {
            return new Top(t, r.subst(this, n, o));
        }
    }
}
