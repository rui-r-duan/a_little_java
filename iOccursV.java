class iOccursV implements iTreeVisitorI {
    FruitD a;
    iOccursV(FruitD _a) {
        a = _a;
    }
    //--------------------------------
    public int forBud() {
        return 0;
    }

    public int forFlat(FruitD f, TreeD t) {
        if (a.equals(f)) {
            return t.accept(this) + 1;
        }
        else {
            return t.accept(this);
        }
    }

    public int forSplit(TreeD l, TreeD r) {
        return l.accept(this) + r.accept(this);
    }
}
