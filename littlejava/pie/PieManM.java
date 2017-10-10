package littlejava.pie;

// The postfix "M" is a reminder that the class manages a data structure.
public class PieManM implements PieManI {
    PieD p = new Bottom();

    @Override
    public int addTop(Object t) {
        p = new Top(t, p); // change PieManM's state (the field PieD p)
        return occTop(t);
    }

    @Override
    public int remTop(Object t) {
        p = (PieD)p.accept(new RemV(t)); // change p
        return occTop(t);
    }

    @Override
    public int substTop(Object n, Object o) {
        p = (PieD)p.accept(new SubstV(n, o)); // change p
        return occTop(n);
    }

    @Override
    public int occTop(Object o) {
        return ((Integer)p.accept(new OccursV(o))).intValue();
    }

    public String toString() {
        return "new " + getClass().getName() + "(" + p + ")";
    }
}
