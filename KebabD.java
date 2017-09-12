abstract class KebabD {
    abstract boolean isVeggie();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Holder extends KebabD {
    Object o;
    Holder(Object _o) {
        o = _o;
    }
    //--------------------------------
    boolean isVeggie() {
        return true;
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + o + ")";
    }
}

class Shallot extends KebabD {
    KebabD k;
    Shallot(KebabD _k) {
        k = _k;
    }
    //--------------------------------
    boolean isVeggie() {
        return k.isVeggie();
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + k + ")";
    }
}

class Shrimp extends KebabD {
    KebabD k;
    Shrimp(KebabD _k) {
        k = _k;
    }
    //--------------------------------
    boolean isVeggie() {
        return false;
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + k + ")";
    }
}

class Radish extends KebabD {
    KebabD k;
    Radish(KebabD _k) {
        k = _k;
    }
    //--------------------------------
    boolean isVeggie() {
        return k.isVeggie();
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + k + ")";
    }
}
