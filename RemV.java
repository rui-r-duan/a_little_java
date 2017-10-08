class RemV {
    PieD forBot(Object o) {
        return new Bottom();
    }

    PieD forTop(Object t, PieD r, Object o) {
        if (o.equals(t)) {
            return r.rem(this, o);
        }
        else {
            return new Top(t, r.rem(this, o));
        }
    }
}
