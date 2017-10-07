abstract class PieD {
    RemV remFn = new RemV();
    SubstV substFn = new SubstV();
    abstract PieD rem(Object o);
    abstract PieD subst(Object n, Object o);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Bottom extends PieD {
    PieD rem(Object o) {
        return remFn.forBot(o);
    }
    PieD subst(Object n, Object o) {
        return substFn.forBot(n, o);
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Top extends PieD {
    Object t;
    PieD r;
    Top(Object _t, PieD _r) {
        t = _t;
        r = _r;
    }
    //--------------------------------
    PieD rem(Object o) {
        return remFn.forTop(t, r, o);
    }

    PieD subst(Object n, Object o) {
        return substFn.forTop(t, r, n, o);
    }

    public String toString() {
        return "new " + getClass().getName() + "(" + t + ", " + r + ")";
    }
}
