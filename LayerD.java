abstract class LayerD {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Base extends LayerD {
    Object o;
    Base(Object _o) {
        o = _o;
    }
    //--------------------------------

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + o + ")";
    }
}

class Slice extends LayerD {
    LayerD l;
    Slice(LayerD _l) {
        l = _l;
    }
    //--------------------------------

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + l + ")";
    }
}
