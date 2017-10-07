class TopAwCV {
    PizzaD forCrust() { return new Crust(); }
    PizzaD forCheese(PizzaD p) { return new Cheese(p.topAnchovywithCheese()); }
    PizzaD forOlive(PizzaD p) { return new Olive(p.topAnchovywithCheese()); }
    PizzaD forSausage(PizzaD p) { return new Sausage(p.topAnchovywithCheese()); }
    PizzaD forAnchovy(PizzaD p) { return new Cheese(new Anchovy(p.topAnchovywithCheese())); }
    PizzaD forSpinach(PizzaD p) { return new Spinach(p.topAnchovywithCheese()); }
}
