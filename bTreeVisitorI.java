// The "b" in the interface name reminds us that
// the visitor's methods produce booleans.
interface bTreeVisitorI {
    boolean forBud();
    boolean forFlat(FruitD f, TreeD t);
    boolean forSplit(TreeD l, TreeD r);
}
