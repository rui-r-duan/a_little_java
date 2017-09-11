abstract class SeasoningD {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Salt extends SeasoningD {
}

class Pepper extends SeasoningD {
    double x;
    double y;

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")";
    }
}

class Thyme extends SeasoningD {
    double x;

    @Override
    public String toString() {
        return "new " + getClass().getName() + "(" + x + ")";
    }
}

class Sage extends SeasoningD {
}
