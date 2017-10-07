abstract class PieD {
    RemAV raFn = new RemAV();
    RemFishV rfFn = new RemFishV();
    RemIntV riFn = new RemIntV();
    abstract PieD remA();
    abstract PieD remFish(FishD f);
    abstract PieD remInt(Integer i);
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Bottom extends PieD {
    PieD remA() {
        return raFn.forBot();
    }
    PieD remFish(FishD f) {
        return rfFn.forBot(f);
    }
    PieD remInt(Integer i) {
        return riFn.forBot(i);
    }
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Top extends PieD {
    Object t;
    PieD r;
    Top(Object _t, PieD _r) {
        t = _t;
        r = _r;
    }
    //--------------------------------
    PieD remA() {
        return raFn.forTop(t, r);
    }

    PieD remFish(FishD f) {
        return rfFn.forTop(t, r, f);
    }

    PieD remInt(Integer i) {
        return riFn.forTop(t, r, i);
    }

    public String toString() {
        return "new " + getClass().getName() + "(" + t + ", " + r + ")";
    }
}
