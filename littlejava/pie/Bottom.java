package littlejava.pie;

public class Bottom extends PieD {
    public PieD accept(PieVisitorI ask) {
        return ask.forBot();
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
