interface ExprVisitorI {
    // Object is the type of the evaluated result of the expression
    Object forPlus(ExprD l, ExprD r);
    Object forDiff(ExprD l, ExprD r);
    Object forProd(ExprD l, ExprD r);
    Object forConst(Object c);
}

class IntEvalV implements ExprVisitorI {
    public Object forPlus(ExprD l, ExprD r) {
        return plus(l.accept(this), r.accept(this));
    }

    public Object forDiff(ExprD l, ExprD r) {
        return diff(l.accept(this), r.accept(this));
    }

    public Object forProd(ExprD l, ExprD r) {
        return prod(l.accept(this), r.accept(this));
    }

    public Object forConst(Object c) {
        return c;
    }

    // We agree to avoid the following kind of arithmetic expressions
    // in which there is non-integer Const.
    // e.g.
    // new Plus(new Const(new Empty()), new Const(new Integer(5)))
    //         .accept(new IntEvalV())
    //
    // In other words, we have unsafe evaluators for our expressions.
    // One way to make them safe is to add a method that checks whether
    // constants are instances of the proper class and that raises an
    // exception.
    // An alternative is to define a visitor that type checks the
    // arithmetic expressions we wish to evaluate.
    Object plus(Object l, Object r) {
        return new Integer(((Integer)l).intValue() + ((Integer)r).intValue());
    }

    Object diff(Object l, Object r) {
        return new Integer(((Integer)l).intValue() - ((Integer)r).intValue());
    }

    Object prod(Object l, Object r) {
        return new Integer(((Integer)l).intValue() * ((Integer)r).intValue());
    }
}

class SetEvalV extends IntEvalV {

    @Override
    Object plus(Object l, Object r) {
        return ((SetD)l).plus((SetD)r);
    }

    @Override
    Object diff(Object l, Object r) {
        return ((SetD)l).diff((SetD)r);
    }

    @Override
    Object prod(Object l, Object r) {
        return ((SetD)l).prod((SetD)r);
    }
}