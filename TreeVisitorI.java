interface TreeVisitorI {
    Object forBud();
    Object forFlat(FruitD f, TreeD t);
    Object forSplit(TreeD l, TreeD r);
}
