abstract class PizzaD {
    RemAV remFn = new RemAV();
    TopAwCV topFn = new TopAwCV();
    SubAwCV subFn = new SubAwCV();
    abstract PizzaD removeAnchovy();
    abstract PizzaD topAnchovywithCheese();
    abstract PizzaD substituteAnchovybyCheese();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Crust extends PizzaD {
    PizzaD removeAnchovy() { return remFn.forCrust(); }
    PizzaD topAnchovywithCheese() { return topFn.forCrust(); }
    PizzaD substituteAnchovybyCheese() { return subFn.forCrust(); }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Cheese extends PizzaD {
    PizzaD p;
    Cheese(PizzaD _p) {
        p = _p;
    }
    //--------------------------------
    PizzaD removeAnchovy() { return remFn.forCheese(p); }
    PizzaD topAnchovywithCheese() { return topFn.forCheese(p); }
    PizzaD substituteAnchovybyCheese() { return subFn.forCheese(p); }
    public String toString() {
        return "new " + getClass().getName() + "(" + p + ")";
    }
}

class Olive extends PizzaD {
    PizzaD p;
    Olive(PizzaD _p) {
        p = _p;
    }
    //--------------------------------
    PizzaD removeAnchovy() { return remFn.forOlive(p); }
    PizzaD topAnchovywithCheese() { return topFn.forOlive(p); }
    PizzaD substituteAnchovybyCheese() { return subFn.forOlive(p); }
    public String toString() {
        return "new " + getClass().getName() + "(" + p + ")";
    }
}

class Sausage extends PizzaD {
    PizzaD p;
    Sausage(PizzaD _p) {
        p = _p;
    }
    //--------------------------------
    PizzaD removeAnchovy() { return remFn.forSausage(p); }
    PizzaD topAnchovywithCheese() { return topFn.forSausage(p); }
    PizzaD substituteAnchovybyCheese() { return subFn.forSausage(p); }
    public String toString() {
        return "new " + getClass().getName() + "(" + p + ")";
    }
}

class Anchovy extends PizzaD {
    PizzaD p;
    Anchovy(PizzaD _p) { p = _p; }
    //--------------------------------
    PizzaD removeAnchovy() { return remFn.forAnchovy(p); }
    PizzaD topAnchovywithCheese() { return topFn.forAnchovy(p); }
    PizzaD substituteAnchovybyCheese() { return subFn.forAnchovy(p); }
    public String toString() {
        return "new " + getClass().getName() + "(" + p + ")";
    }
}

// When we add variants to the datatypes we have defined, we don't need to change what we have.
// Unfortunately, the more things we want to do with PizzaDs, the more methods we must add.
// And that means cluttered classes
class Spinach extends PizzaD {
    PizzaD p;
    Spinach(PizzaD _p) { p = _p; }
    //--------------------------------
    PizzaD removeAnchovy() {
        return remFn.forSpinach(p);
    }
    PizzaD topAnchovywithCheese() { return topFn.forSpinach(p); }
    PizzaD substituteAnchovybyCheese() { return subFn.forSpinach(p); }
    public String toString() {
        return "new " + getClass().getName() + "(" + p + ")";
    }
}
