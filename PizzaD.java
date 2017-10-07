// This is similar to the interpreter and composite patterns.
abstract class PizzaD {
    abstract PizzaD removeAnchovy();
    abstract PizzaD topAnchovywithCheese();
    abstract PizzaD substituteAnchovybyCheese();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Crust extends PizzaD {
    PizzaD removeAnchovy() {
        return new Crust();
    }
    PizzaD topAnchovywithCheese() { return new Crust(); }
    PizzaD substituteAnchovybyCheese() { return new Crust(); }
}

class Cheese extends PizzaD {
    PizzaD p;
    Cheese(PizzaD _p) {
        p = _p;
    }
    //--------------------------------
    PizzaD removeAnchovy() {
        return new Cheese(p.removeAnchovy());
    }
    PizzaD topAnchovywithCheese() { return new Cheese(p.topAnchovywithCheese()); }
    PizzaD substituteAnchovybyCheese() { return new Cheese(p.substituteAnchovybyCheese()); }
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
    PizzaD removeAnchovy() {
        return new Olive(p.removeAnchovy());
    }
    PizzaD topAnchovywithCheese() { return new Olive(p.topAnchovywithCheese()); }
    PizzaD substituteAnchovybyCheese() { return new Olive(p.substituteAnchovybyCheese()); }
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
    PizzaD removeAnchovy() {
        return new Sausage(p.removeAnchovy());
    }
    PizzaD topAnchovywithCheese() { return new Sausage(p.topAnchovywithCheese()); }
    PizzaD substituteAnchovybyCheese() { return new Sausage(p.substituteAnchovybyCheese()); }
    public String toString() {
        return "new " + getClass().getName() + "(" + p + ")";
    }
}

class Anchovy extends PizzaD {
    PizzaD p;
    Anchovy(PizzaD _p) {
        p = _p;
    }
    //--------------------------------
    PizzaD removeAnchovy() {
        return p.removeAnchovy();
    }
    PizzaD topAnchovywithCheese() { return new Cheese(new Anchovy(p.topAnchovywithCheese())); }
    PizzaD substituteAnchovybyCheese() { return new Cheese(p.substituteAnchovybyCheese()); }
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
        return p.removeAnchovy();
    }
    PizzaD topAnchovywithCheese() { return new Spinach(new Anchovy(p.topAnchovywithCheese())); }
    PizzaD substituteAnchovybyCheese() { return new Spinach(p.substituteAnchovybyCheese()); }
    public String toString() {
        return "new " + getClass().getName() + "(" + p + ")";
    }
}
