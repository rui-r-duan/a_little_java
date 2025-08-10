abstract class FishD {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class AnchovyTop extends FishD {
    // The class Object is defined in a separate package, called java.lang.Object.
    // Overriding methods that reside in other packages requires the word public.
    public boolean equals(Object o) {
        return (o instanceof AnchovyTop);
    }
}

class Salmon extends FishD {
    public boolean equals(Object o) {
        return (o instanceof Salmon);
    }
}

class Tuna extends FishD {
    public boolean equals(Object o) {
        return (o instanceof Tuna);
    }
}
