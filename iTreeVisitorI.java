interface iTreeVisitorI {
    int forBud();
    int forFlat(FruitD f, TreeD t);
    int forSplit(TreeD l, TreeD r);
}

class iHeightV implements iTreeVisitorI {
    public int forBud() {
        return 0;
    }

    public int forFlat(FruitD f, TreeD t) {
        return t.accept(this) + 1;
    }

    public int forSplit(TreeD l, TreeD r) {
        return Math.max(l.accept(this), r.accept(this)) + 1;
    }
}

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
