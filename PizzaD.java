abstract class PizzaD {
    abstract PizzaD removeAnchovy();
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Crust extends PizzaD {
    PizzaD removeAnchovy() {
        return new Crust();
    }
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
    public String toString() {
        return "new " + getClass().getName() + "(" + p + ")";
    }
}
