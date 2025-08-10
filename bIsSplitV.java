// This class checks whether a TreeD is constructed with Split and Bud ONLY.
class bIsSplitV implements bTreeVisitorI {
    public boolean forBud() {
        return true;
    }

    public boolean forFlat(FruitD f, TreeD t) {
        return false;
    }

    public boolean forSplit(TreeD l, TreeD r) {
//        if (l.accept(this)) {
//            return r.accept(this);
//        }
//        else {
//            return false;
//        }
        return l.accept(this) && r.accept(this);
    }
}
