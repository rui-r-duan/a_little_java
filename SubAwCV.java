class SubAwCV {
    PizzaD forCrust() { return new Crust(); }
    PizzaD forCheese(PizzaD p) { return new Cheese(p.substituteAnchovybyCheese()); }
    PizzaD forOlive(PizzaD p) { return new Olive(p.substituteAnchovybyCheese()); }
    PizzaD forSausage(PizzaD p) { return new Sausage(p.substituteAnchovybyCheese()); }
    PizzaD forAnchovy(PizzaD p) { return new Cheese(p.substituteAnchovybyCheese()); }
    PizzaD forSpinach(PizzaD p) { return new Spinach(p.substituteAnchovybyCheese()); }
}
