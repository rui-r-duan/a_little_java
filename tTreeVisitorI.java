interface tTreeVisitorI {
    TreeD forBud();
    TreeD forFlat(FruitD f, TreeD t);
    TreeD forSplit(TreeD l, TreeD r);
}

class tSubstV implements tTreeVisitorI {
    FruitD n;
    FruitD o;
    tSubstV(FruitD _n, FruitD _o) {
        n = _n;
        o = _o;
    }
    //--------------------------------
    public TreeD forBud() {
        return new Bud();
    }

    public TreeD forFlat(FruitD f, TreeD t) {
        if (o.equals(f)) {
            return new Flat(n, t.accept(this));
        }
        else {
            return new Flat(f, t.accept(this));
        }
    }

    public TreeD forSplit(TreeD l, TreeD r) {
        return new Split(l.accept(this), r.accept(this));
    }
}
