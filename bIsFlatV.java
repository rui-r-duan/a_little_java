class bIsFlatV implements bTreeVisitorI {
    public boolean forBud() {
        return true;
    }

    public boolean forFlat(FruitD f, TreeD t) {
        return t.accept(this);
    }

    public boolean forSplit(TreeD l, TreeD r) {
        return false;
    }
}
