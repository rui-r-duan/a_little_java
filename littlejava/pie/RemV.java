package littlejava.pie;

public class RemV implements PieVisitorI {
    Object o; // object to be removed
    public RemV(Object _o) { o = _o; }
    //--------------------------------
    public Object forBot(Bottom that) {
        return new Bottom();
    }

    public Object forTop(Top that) {
        if (o.equals(that.t)) {
            return that.r.accept(this);
        }
        else {
            return new Top(that.t, (PieD)that.r.accept(this));
        }
    }
}
