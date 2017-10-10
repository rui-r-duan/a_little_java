package pie;

public class SubstV implements PieVisitorI {
    // In functional programming, a visitor with fields is called a closure
    // (or a higher-order function), which would be the result of applying
    // a curried version of subst.
    // By capturing the fields (state), it can avoid handing back and forth
    // of these extra values.
    Object n; // new object that replaces the old target
    Object o; // the target object that is to be replaced
    public SubstV(Object _n, Object _o) {
        n = _n;
        o = _o;
    }
    //--------------------------------
    @Override
    public Object forBot(Bottom that) {
        return that;
    }

    @Override
    public Object forTop(Top that) {
        if (o.equals(that.t)) {
            that.t = n; // modification
            that.r.accept(this); // modification
            return that;
        }
        else {
            that.r.accept(this); // modification
            return that;
        }
    }
}
