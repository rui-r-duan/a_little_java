// The "b" in the interface name reminds us that
// the visitor's methods produce booleans.
interface bTreeVisitorI {
    boolean forBud();
    boolean forFlat(FruitD f, TreeD t);
    boolean forSplit(TreeD l, TreeD r);
}

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
