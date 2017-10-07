abstract class PieD {
    RemAV raFn = new RemAV();
    RemFishV rfFn = new RemFishV();
    RemIntV riFn = new RemIntV();
    RemV remFn = new RemV();
    SubstV substFn = new SubstV();
    abstract PieD remA();
    abstract PieD remFish(FishD f);
    abstract PieD remInt(Integer i);
    abstract PieD rem(Object o);
    abstract PieD subst(Object n, Object o);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Bottom extends PieD {
    PieD remA() {
        return raFn.forBot();
    }
    PieD remFish(FishD f) {
        return rfFn.forBot(f);
    }
    PieD remInt(Integer i) {
        return riFn.forBot(i);
    }
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
    PieD remA() {
        return raFn.forTop(t, r);
    }

    PieD remFish(FishD f) {
        return rfFn.forTop(t, r, f);
    }

    PieD remInt(Integer i) {
        return riFn.forTop(t, r, i);
    }

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
