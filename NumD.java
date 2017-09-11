abstract class NumD {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Zero extends NumD {
}

class OneMoreThan extends NumD {
    NumD predecessor;

    OneMoreThan(NumD _p) {
        predecessor = _p;
    }
    //--------------------------------

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + predecessor + ")";
    }
}
