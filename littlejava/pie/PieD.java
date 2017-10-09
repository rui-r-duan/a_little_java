package littlejava.pie;

public abstract class PieD {
    public abstract Object accept(PieVisitorI ask);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

