abstract class TreeD {
    // overloading: same method name but distinct consumed types
    abstract boolean accept(bTreeVisitorI ask);
    abstract int accept(iTreeVisitorI ask);
    abstract TreeD accept(tTreeVisitorI ask);
    abstract Object accept(TreeVisitorI ask);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Bud extends TreeD {
    boolean accept(bTreeVisitorI ask) {
        return ask.forBud();
    }
    int accept(iTreeVisitorI ask) {
        return ask.forBud();
    }
    TreeD accept(tTreeVisitorI ask) {
        return ask.forBud();
    }
    Object accept(TreeVisitorI ask) {
        return ask.forBud();
    }
}

class Flat extends TreeD {
    FruitD f;
    TreeD t;
    Flat(FruitD _f, TreeD _t) {
        f = _f;
        t = _t;
    }
    //--------------------------------
    boolean accept(bTreeVisitorI ask) {
        return ask.forFlat(f, t);
    }
    int accept(iTreeVisitorI ask) {
        return ask.forFlat(f, t);
    }
    TreeD accept(tTreeVisitorI ask) {
        return ask.forFlat(f, t);
    }
    Object accept(TreeVisitorI ask) {
        return ask.forFlat(f, t);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + f + ", " + t + ")";
    }
}

class Split extends TreeD {
    TreeD l;
    TreeD r;
    Split(TreeD _l, TreeD _r) {
        l = _l;
        r = _r;
    }
    //--------------------------------
    boolean accept(bTreeVisitorI ask) {
        return ask.forSplit(l, r);
    }
    int accept(iTreeVisitorI ask) {
        return ask.forSplit(l, r);
    }
    TreeD accept(tTreeVisitorI ask) {
        return ask.forSplit(l, r);
    }
    Object accept(TreeVisitorI ask) {
        return ask.forSplit(l, r);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + l + ", " + r + ")";
    }
}
