abstract class NumD {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Zero extends NumD {
    public boolean equals(Object o) {
        return (o instanceof Zero);
    }
}

class OneMoreThan extends NumD {
    NumD predecessor;

    OneMoreThan(NumD _p) {
        predecessor = _p;
    }
    //--------------------------------

    public boolean equals(Object o) {
        if (o instanceof OneMoreThan) {
            // downward casting
            return predecessor.equals(((OneMoreThan)o).predecessor);
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + predecessor + ")";
    }
}
