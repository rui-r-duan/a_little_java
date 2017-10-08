abstract class FruitD {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Peach extends FruitD {
    public boolean equals(Object o) {
        return (o instanceof Peach);
    }
}

class Apple extends FruitD {
    public boolean equals(Object o) {
        return (o instanceof Apple);
    }
}

class Pear extends FruitD {
    public boolean equals(Object o) {
        return (o instanceof Pear);
    }
}

class Lemon extends FruitD {
    public boolean equals(Object o) {
        return (o instanceof Lemon);
    }
}

class Fig extends FruitD {
    public boolean equals(Object o) {
        return (o instanceof Fig);
    }
}
