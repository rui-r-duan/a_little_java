public class Main {
    public static void main(String[] args) {
        System.out.println("\nChapter 1\n");
        System.out.println(new Salt() + "\n" +
                new Pepper() + "\n" +
                new Thyme() + "\n" +
                new Sage());

        System.out.println(
                new OneMoreThan(
                        new OneMoreThan(
                                new Zero())));

        System.out.println(new CartesianPt(2, 3) + "\n" +
                new ManhattanPt(2, 3));

        System.out.println(new Base(new Zero()) + "\n" +
                new Base(new Salt()) + "\n" +
                new Base(new Integer(5)) + "\n" +
                new Base(new Boolean(false)));

        System.out.println("\nChapter 2\n");
        System.out.println("PointD.distanceToO():");
        PointD point1 = new CartesianPt(3, 4);
        PointD point2 = new ManhattanPt(3, 4);
        System.out.println(point1 + ": " + point1.distanceToO() + "\n" +
                point2 + ": " + point2.distanceToO());

        System.out.println("\nShishD.onlyOnions():");
        ShishD shish1 = new Skewer();
        ShishD shish2 = new Onion(new Onion(new Skewer()));
        ShishD shish3 = new Onion(new Lamb(new Onion(new Skewer())));
        ShishD shish4 = new Onion(new Tomato(new Skewer()));
        System.out.println(shish1 + ": " + shish1.onlyOnions() + "\n" +
                shish2 + ": " + shish2.onlyOnions() + "\n" +
                shish3 + ": " + shish3.onlyOnions() + "\n" +
                shish4 + ": " + shish4.onlyOnions());

        System.out.println("\nShishD.isVegetarian():");
        System.out.println(shish1 + ": " + shish1.isVegetarian() + "\n" +
                shish2 + ": " + shish2.isVegetarian() + "\n" +
                shish3 + ": " + shish3.isVegetarian() + "\n" +
                shish4 + ": " + shish4.isVegetarian());

        System.out.println("\nKebab");
        KebabD kebab1 = new Shallot(new Radish(new Holder(new Dagger())));
        KebabD kebab2 = new Shallot(new Radish(new Holder(new Gold())));
        System.out.println(kebab1);
        System.out.println(kebab2);

        System.out.println("\nKebab.isVeggie()");
        System.out.println(kebab1 + ": " + kebab1.isVeggie());
        System.out.println(kebab2 + ": " + kebab2.isVeggie());
        KebabD kebab3 = new Shallot(new Radish(new Holder(new Integer(52))));
        System.out.println(kebab3 + ": " + kebab3.isVeggie());
        KebabD kebab4 = new Shallot(new Radish(new Holder(new OneMoreThan(new Zero()))));
        System.out.println(kebab4 + ": " + kebab4.isVeggie());
        KebabD kebab5 = new Shallot(new Radish(new Holder(new Boolean(false))));
        System.out.println(kebab5 + ": " + kebab5.isVeggie());

        System.out.println("\nPointD.closerToO()");
        ManhattanPt point3 = new ManhattanPt(3, 4);
        ManhattanPt point4 = new ManhattanPt(1, 5);
        System.out.println(point3 + ".closerToO(" + point4 + "): " +
                point3.closerToO(point4));
        System.out.println(point4 + ".closerToO(" + point3 + "): " +
                point4.closerToO(point3));
        CartesianPt point5 = new CartesianPt(12, 5);
        CartesianPt point6 = new CartesianPt(3, 4);
        System.out.println(point5 + ".closerToO(" + point6 + "): " +
                point5.closerToO(point6));
        System.out.println(point6 + ".closerToO(" + point4 + "): " +
                point6.closerToO(point4));

        System.out.println("\nChapter 3\n");
        PizzaD pizza1 = new Anchovy(new Olive(new Anchovy(new Anchovy(
                new Cheese(new Crust())))));
        System.out.println(pizza1);

        System.out.println("\nPizzaD.removeAnchovy()");
        PizzaD pizza2 = new Anchovy(new Crust());
        System.out.println(pizza2 + ".removeAnchovy(): " + pizza2.removeAnchovy());
        PizzaD pizza3 = new Anchovy(new Anchovy(new Crust()));
        System.out.println(pizza3 + ".removeAnchovy(): " + pizza3.removeAnchovy());
        PizzaD pizza4 = new Olive(new Cheese(new Anchovy(new Anchovy(new Crust()))));
        System.out.println(pizza4 + ".removeAnchovy(): " + pizza4.removeAnchovy());
        System.out.println(pizza1 + ".removeAnchovy(): " + pizza1.removeAnchovy());
        PizzaD pizza5 = new Cheese(new Anchovy(new Cheese(new Crust())));
        System.out.println(pizza5 + ".removeAnchovy(): " + pizza5.removeAnchovy());

        System.out.println("\nPizzaD.topAnchovywithCheese()");
        PizzaD pizza6 = new Olive(new Anchovy(new Cheese(new Anchovy(new Crust()))));
        System.out.println(pizza6 + ".topAnchovywithCheese(): " + pizza6.topAnchovywithCheese());
        PizzaD pizza7 = new Olive(new Cheese(new Sausage(new Crust())));
        System.out.println(pizza7 + ".topAnchovywithCheese(): " + pizza7.topAnchovywithCheese());
        System.out.println(pizza6 + ".removeAnchovy().topAnchovywithCheese():\n" +
                pizza6.removeAnchovy().topAnchovywithCheese());
        System.out.println(pizza6 + ".topAnchovywithCheese().removeAnchovy():\n" +
                pizza6.topAnchovywithCheese().removeAnchovy());

        System.out.println("\nPizzaD.substituteAnchovybyCheese()");
        System.out.println(pizza6 + ".substituteAnchovybyCheese():\n" +
                pizza6.substituteAnchovybyCheese());
    }
}
