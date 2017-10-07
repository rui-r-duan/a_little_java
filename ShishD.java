abstract class ShishD {
    OnlyOnionsV ooFn = new OnlyOnionsV();
    abstract boolean onlyOnions();
    abstract boolean isVegetarian();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Skewer extends ShishD {
    boolean onlyOnions() {
        return ooFn.forSkewer();
    }
    boolean isVegetarian() {
        return true;
    }
}

class Onion extends ShishD {
    ShishD s;
    Onion(ShishD _s) {
        s = _s;
    }
    //--------------------------------

    boolean onlyOnions() {
        return ooFn.forOnion(s);
    }
    boolean isVegetarian() {
        return s.isVegetarian();
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + s + ")";
    }
}

class Lamb extends ShishD {
    ShishD s;
    Lamb(ShishD _s) {
        s = _s;
    }
    //--------------------------------

    boolean onlyOnions() {
        return ooFn.forLamb(s);
    }
    boolean isVegetarian() {
        return false;
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + s + ")";
    }
}

class Tomato extends ShishD {
    ShishD s;
    Tomato(ShishD _s) {
        s = _s;
    }
    //--------------------------------

    boolean onlyOnions() {
        return ooFn.forTomato(s);
    }
    boolean isVegetarian() {
        return s.isVegetarian();
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + s + ")";
    }
}
