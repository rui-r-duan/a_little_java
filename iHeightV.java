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
