class IsFlatV implements TreeVisitorI {
    public Object forBud() {
        return new Boolean(true);
    }

    public Object forFlat(FruitD f, TreeD t) {
        return t.accept(this);
    }

    public Object forSplit(TreeD l, TreeD r) {
        return new Boolean(false);
    }
}
