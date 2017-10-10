package littlejava.pie;

public class OccursV implements PieVisitorI {
    Object a;
    OccursV(Object _a) {
        a = _a;
    }
    //--------------------------------
    @Override
    public Object forBot(Bottom that) {
        return new Integer(0);
    }

    @Override
    public Object forTop(Top that) {
        if (that.t.equals(a)) {
            return new Integer(((Integer)(that.r.accept(this))).intValue() + 1);
        }
        else {
            return that.r.accept(this);
        }
    }
}
