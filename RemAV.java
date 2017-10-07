class RemAV {
    PizzaD forCrust() { return new Crust(); }
    PizzaD forCheese(PizzaD p) { return new Cheese(p.removeAnchovy()); }
    PizzaD forOlive(PizzaD p) { return new Olive(p.removeAnchovy()); }
    PizzaD forSausage(PizzaD p) { return new Sausage(p.removeAnchovy()); }
    PizzaD forAnchovy(PizzaD p) { return p.removeAnchovy(); }
    PizzaD forSpinach(PizzaD p) { return new Spinach(p.removeAnchovy()); }

    PieD forBot() {
        return new Bottom();
    }

    PieD forTop(Object t, PieD r) {
        if (new AnchovyTop().equals(t)) {
            return r.remA();
        }
        else {
            return new Top(t, r.remA());
        }
    }
}
