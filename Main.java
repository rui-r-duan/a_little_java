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
    }
}
