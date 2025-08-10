class OccursV implements TreeVisitorI {
    FruitD a;
    OccursV(FruitD _a) {
        a = _a;
    }
    //--------------------------------
    public Object forBud() {
        return new Integer(0);
    }

    public Object forFlat(FruitD f, TreeD t) {
        if (a.equals(f)) {
            return new Integer(((Integer)(t.accept(this))).intValue() + 1);
        }
        else {
            return t.accept(this);
        }
    }

    public Object forSplit(TreeD l, TreeD r) {
        return new Integer(((Integer)(l.accept(this))).intValue() +
                ((Integer)(r.accept(this))).intValue());
    }
}
