abstract class TreeD {
    abstract boolean accept(bTreeVisitorI ask);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Bud extends TreeD {
    boolean accept(bTreeVisitorI ask) {
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
    public String toString() {
        return "new " + getClass().getName() + "(" + l + ", " + r + ")";
    }
}
