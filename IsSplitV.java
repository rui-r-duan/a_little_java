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
