abstract class PieD {
    abstract PieD rem(RemV remFn, Object o);
    abstract PieD subst(SubstV substFn, Object n, Object o);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Bottom extends PieD {
    PieD rem(RemV remFn, Object o) {
        return remFn.forBot(o);
    }
    PieD subst(SubstV substFn, Object n, Object o) {
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
    PieD rem(RemV remFn, Object o) {
        return remFn.forTop(t, r, o);
    }

    PieD subst(SubstV substFn, Object n, Object o) {
        return substFn.forTop(t, r, n, o);
    }

    public String toString() {
        return "new " + getClass().getName() + "(" + t + ", " + r + ")";
    }
}
