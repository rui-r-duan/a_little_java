class bHasFruitV implements bTreeVisitorI {
    public boolean forBud() {
        return false;
    }

    public boolean forFlat(FruitD f, TreeD t) {
        return true;
    }

    public boolean forSplit(TreeD l, TreeD r) {
//        if (l.accept(this)) {
//            return true;
//        }
//        else {
//            return r.accept(this);
//        }
        return l.accept(this) || r.accept(this);
    }
}
