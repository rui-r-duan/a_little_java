class RemIntV {
    PieD forBot(Integer i) {
        return new Bottom();
    }

    PieD forTop(Object t, PieD r, Integer i) {
        if (i.equals(t)) {
            return r.remInt(i);
        }
        else {
            return new Top(t, r.remInt(i));
        }
    }
}
