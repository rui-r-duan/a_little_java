class RemFishV {
    PieD forBot(FishD f) {
        return new Bottom();
    }

    PieD forTop(Object t, PieD r, FishD f) {
        if (f.equals(t)) {
            return r.remFish(f);
        }
        else {
            return new Top(t, r.remFish(f));
        }
    }
}
