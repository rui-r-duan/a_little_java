// An expression is either
//     a Plus(expr1, expr2),
//     a Diff(expr1, expr2),
//     a Prod(expr1, expr2),
//     a constant,
// where expr1 and expr2 stand for arbitrary expressions.

abstract class ExprD {
    abstract Object accept(ExprVisitorI ask);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Plus extends ExprD {
    ExprD l;
    ExprD r;
    Plus(ExprD _l, ExprD _r) {
        l = _l;
        r = _r;
    }
    //--------------------------------
    Object accept(ExprVisitorI ask) {
        return ask.forPlus(l, r);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + l + ", " + r + ")";
    }
}

class Diff extends ExprD {
    ExprD l;
    ExprD r;
    Diff(ExprD _l, ExprD _r) {
        l = _l;
        r = _r;
    }
    //--------------------------------
    Object accept(ExprVisitorI ask) {
        return ask.forDiff(l, r);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + l + ", " + r + ")";
    }
}

class Prod extends ExprD {
    ExprD l;
    ExprD r;
    Prod(ExprD _l, ExprD _r) {
        l = _l;
        r = _r;
    }
    //--------------------------------
    Object accept(ExprVisitorI ask) {
        return ask.forProd(l, r);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + l + ", " + r + ")";
    }
}

class Const extends ExprD {
    Object c;
    Const(Object _c) {
        c = _c;
    }
    //--------------------------------
    Object accept(ExprVisitorI ask) {
        return ask.forConst(c);
    }
    public String toString() {
        return "new " + getClass().getName() + "(" + c + ")";
    }
}
