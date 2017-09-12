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
        System.out.println("distanceToO():");
        PointD point1 = new CartesianPt(3, 4);
        PointD point2 = new ManhattanPt(3, 4);
        System.out.println(point1 + ": " + point1.distanceToO() + "\n" +
                point2 + ": " + point2.distanceToO());

        System.out.println("\nonlyOnions():");
        ShishD shish1 = new Skewer();
        ShishD shish2 = new Onion(new Onion(new Skewer()));
        ShishD shish3 = new Onion(new Lamb(new Onion(new Skewer())));
        ShishD shish4 = new Onion(new Tomato(new Skewer()));
        System.out.println(shish1 + ": " + shish1.onlyOnions() + "\n" +
                shish2 + ": " + shish2.onlyOnions() + "\n" +
                shish3 + ": " + shish3.onlyOnions() + "\n" +
                shish4 + ": " + shish4.onlyOnions());

        System.out.println("\nisVegetarian():");
        System.out.println(shish1 + ": " + shish1.isVegetarian() + "\n" +
                shish2 + ": " + shish2.isVegetarian() + "\n" +
                shish3 + ": " + shish3.isVegetarian() + "\n" +
                shish4 + ": " + shish4.isVegetarian());
    }
}
