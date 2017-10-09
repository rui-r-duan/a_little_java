abstract class SetD {
    SetD add(Integer i) {
        if (mem(i)) {
            return this;
        }
        else {
            return new Add(i, this);
        }
    }

    abstract boolean mem(Integer i);
    abstract SetD plus(SetD s);
    abstract SetD diff(SetD s);
    abstract SetD prod(SetD s);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Empty extends SetD {
    boolean mem(Integer i) {
        return false;
    }

    SetD plus(SetD s) {
        return s;
    }

    SetD diff(SetD s) {
        return new Empty();
    }

    SetD prod(SetD s) {
        return new Empty();
    }

    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Add extends SetD {
    Integer i;
    SetD s;
    Add(Integer _i, SetD _s) {
        i = _i;
        s = _s;
    }
    //--------------------------------

    boolean mem(Integer n) {
        if (i.equals(n)) {
            return true;
        }
        else {
            return s.mem(n);
        }
    }

    SetD plus(SetD t) {
        return s.plus(t.add(i));
    }

    SetD diff(SetD t) {
        // if i is in set "t", drop it,
        // else keep it (add it back after s.diff(t))
        if (t.mem(i)) {
            return s.diff(t);
        }
        else {
            return s.diff(t).add(i);
        }
    }

    SetD prod(SetD t) {
        // if i is in set "t", keep it,
        // else drop it.
        if (t.mem(i)) {
            return s.prod(t).add(i);
        }
        else {
            return s.prod(t);
        }
    }

    public String toString() {
        return "new " + getClass().getName() + "(" + i + ", " + s + ")";
    }
}
