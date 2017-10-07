abstract class ShishD {
    OnlyOnionsV ooFn = new OnlyOnionsV();
    IsVegetarianV ivFn = new IsVegetarianV();
    abstract boolean onlyOnions();
    abstract boolean isVegetarian();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Skewer extends ShishD {
    boolean onlyOnions() { return ooFn.forSkewer(); }
    boolean isVegetarian() {
        return ivFn.forSkewer();
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
    boolean isVegetarian() { return ivFn.forOnion(s); }
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
        return ivFn.forLamb(s);
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
        return ivFn.forTomato(s);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + s + ")";
    }
}
