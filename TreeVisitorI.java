interface TreeVisitorI {
    Object forBud();
    Object forFlat(FruitD f, TreeD t);
    Object forSplit(TreeD l, TreeD r);
}

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

// This class checks whether a TreeD is constructed with Split and Bud ONLY.
class IsSplitV implements TreeVisitorI {
    public Object forBud() {
        return new Boolean(true);
    }

    public Object forFlat(FruitD f, TreeD t) {
        return new Boolean(false);
    }

    public Object forSplit(TreeD l, TreeD r) {
        // If Java had parametric polymorphism for methods, no downward cast would be
        // necessary for our visitors.
        // (Martin Odersky and Philip Wadler, Pizza into Java: Translating Theory into
        // Practice, Conference Record on Principles of Programming Languages, 146-159.
        // Paris, 1997).
        if (((Boolean)(l.accept(this))).booleanValue()) {
            return r.accept(this);
        }
        else {
            return new Boolean(false);
        }
    }
}

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
