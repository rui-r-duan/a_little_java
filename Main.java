import pie.*;
import shape.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nChapter 1. Modern Toys\n");
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

        System.out.println("\nChapter 2. Methods to Our Madness\n");
        System.out.println("littlejava.shape.PointD.distanceToO():");
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

        System.out.println("\nlittlejava.shape.PointD.closerToO()");
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

        System.out.println("\nChapter 3. What's New?\nInterpreter and Composite Patterns\n");
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
        System.out.println(pizza6 + ".removeAnchovy().topAnchovywithCheese():\n\t" +
                pizza6.removeAnchovy().topAnchovywithCheese());
        System.out.println(pizza6 + ".topAnchovywithCheese().removeAnchovy():\n\t" +
                pizza6.topAnchovywithCheese().removeAnchovy());

        System.out.println("\nPizzaD.substituteAnchovybyCheese()");
        System.out.println(pizza6 + ".substituteAnchovybyCheese():\n\t" +
                pizza6.substituteAnchovybyCheese());
        PizzaD pizza8 = new Spinach(pizza6);
        System.out.println(pizza8 + ".substituteAnchovybyCheese():\n\t" +
                pizza8.substituteAnchovybyCheese());

        System.out.println("\nChapter 4. Come to Our Carousel\nVisitor Pattern\n");
        System.out.println(shish2 + ".onlyOnions(): " + shish2.onlyOnions());
        System.out.println("ShishD.isVegetarian():");
        System.out.println(shish1 + ": " + shish1.isVegetarian() + "\n" +
                shish2 + ": " + shish2.isVegetarian() + "\n" +
                shish3 + ": " + shish3.isVegetarian() + "\n" +
                shish4 + ": " + shish4.isVegetarian());

        System.out.println(pizza5 + ".removeAnchovy(): " + pizza5.removeAnchovy());
        System.out.println(pizza7 + ".topAnchovywithCheese(): " + pizza7.topAnchovywithCheese());
        System.out.println(pizza8 + ".substituteAnchovybyCheese():\n\t" +
                pizza8.substituteAnchovybyCheese());

        System.out.println("\nChapter 5. Objects Are People, Too\n");
        PieD pie1 = new Top(new AnchovyTop(),
                new Top(new Tuna(),
                        new Top(new AnchovyTop(),
                                new Bottom())));
        PieD pie2 = new Top(new Tuna(),
                new Top(new Integer(42),
                        new Top(new AnchovyTop(),
                                new Top(new Integer(5),
                                        new Bottom()))));
        System.out.println(pie1 + "\n" + pie2);
        PieD pie3 = new Top(new Salmon(),
                new Top(new AnchovyTop(),
                        new Top(new Tuna(),
                                new Top(new AnchovyTop(),
                                        new Bottom()))));

        // The following RemV and SubstV variables are added for Chapter 6

        PieD pie4 = (PieD)pie3.accept(new RemV(new AnchovyTop()));
        System.out.println(pie3 + ".remA():\n\t" + pie4);
        System.out.println(pie4 + ".remA(): " + pie4.accept(new RemV(new AnchovyTop())));

        PieD pie5 = new Top(new AnchovyTop(), new Bottom());
        System.out.println(pie5 + ".remFish(new AnchovyTop()): " +
                pie5.accept(new RemV(new AnchovyTop())));

        PieD pie6 = new Top(2, new Top(3, new Top(2, new Bottom())));
        System.out.println(pie6 + ".remInt(3): " + pie6.accept(new RemV(3)));
        System.out.println(pie6 + ".rem(3): " + pie6.accept(new RemV(3)));
        System.out.println(pie5 + ".rem(new AnchovyTop()): " +
                pie5.accept(new RemV(new AnchovyTop())));
        PieD pie7 = new Top(new AnchovyTop(),
                new Top(3,
                        new Top(new Zero(), new Bottom())));
        System.out.println(pie7 + ".rem(3):\n\t" +
                pie7.accept(new RemV(3)));
        System.out.println(pie6 + ".rem(new Bottom()): " +
                pie6.accept(new RemV(new Bottom()))); // Safe!

        // With proper overriding NumD.equals(), the following test works.
        System.out.println(pie7 + ".rem(new Zero()):\n\t" +
                pie7.accept(new RemV(new Zero())));

        System.out.println(pie1 + ".subst(Salmon, Anchovy):\n\t" +
                pie1.accept(new SubstV(new Salmon(), new AnchovyTop())));
        PieD pie8 = new Top(3, new Top(2, new Top(3, new Bottom())));
        System.out.println(pie8 + ".subst(5, 3): " + pie8.accept(new SubstV(5, 3)));

        System.out.println("\nChapter 6. Boring Protocols\nComplete Visitor Pattern\n");
        PieD pie9 = new Top(new AnchovyTop(),
                new Top(3,
                        new Top(new Zero(),
                                new Bottom())));
        System.out.println(pie9 + ".rem(RemV, Zero): " + pie9.accept(new RemV(new Zero())));

        PieD pie10 = new Top(new AnchovyTop(),
                new Top(new Tuna(),
                        new Top(new AnchovyTop(),
                                new Top(new Tuna(),
                                        new Top(new AnchovyTop(),
                                                new Bottom())))));
        System.out.println(pie10 + ".accept(LtdSubst(2, Salmon, Anchovy)):\n\t" +
                pie10.accept(new LtdSubstV(2, new Salmon(), new AnchovyTop())));

        System.out.println("\nChapter 7. Oh, My!");
        System.out.println("Tree and Visitors that produce distinct types\n");
        TreeD tree1 = new Flat(new Apple(),
                new Flat(new Peach(),
                        new Bud()));
        bIsFlatV isFlatV = new bIsFlatV();
        bIsSplitV isSplitV = new bIsSplitV();
        System.out.println(tree1 + "\n\t.isFlat? " + tree1.accept(isFlatV) +
                "\n\t.isSplit? " + tree1.accept(isSplitV));
        TreeD tree2 = new Flat(new Pear(), new Bud());
        System.out.println(tree2 + "\n\t.isFlat? " + tree2.accept(isFlatV) +
                "\n\t.isSplit? " + tree2.accept(isSplitV));
        TreeD tree3 =
                new Split(
                        new Bud(),
                        new Flat(
                                new Fig(),
                                new Split(
                                        new Bud(),
                                        new Bud())));
        System.out.println(tree3 + "\n\t.isFlat? " + tree3.accept(isFlatV) +
                "\n\t.isSplit? " + tree3.accept(isSplitV)); // false, false
        TreeD tree4 = new Bud();
        System.out.println(tree4 + "\n\t.isFlat? " + tree4.accept(isFlatV) +
                "\n\t.isSplit? " + tree4.accept(isSplitV)); // true, true
        TreeD tree5 =
                new Split(
                        new Split(
                                new Bud(),
                                new Flat(
                                        new Lemon(),
                                        new Bud())),
                        new Flat(
                                new Fig(),
                                new Split(
                                        new Bud(),
                                        new Bud())));
        System.out.println(tree5 + "\n\t.isFlat? " + tree5.accept(isFlatV) +
                "\n\t.isSplit? " + tree5.accept(isSplitV)); // false, false
        TreeD tree6 =
                new Split(
                        new Split(
                                new Bud(),
                                new Split(
                                        new Bud(),
                                        new Bud())),
                        new Split(
                                new Bud(),
                                new Split(
                                        new Bud(),
                                        new Bud())));
        System.out.println(tree6 + "\n\t.isFlat? " + tree6.accept(isFlatV) +
                "\n\t.isSplit? " + tree6.accept(isSplitV)); // false, true

        bHasFruitV hasFruitV = new bHasFruitV();
        System.out.println("\n" + tree6 + ".hasFruit? " + tree6.accept(hasFruitV));
        System.out.println(tree5 + ".hasFruit? " + tree5.accept(hasFruitV));
        System.out.println(tree4 + ".hasFruit? " + tree4.accept(hasFruitV));
        System.out.println(tree3 + ".hasFruit? " + tree3.accept(hasFruitV));
        System.out.println(tree2 + ".hasFruit? " + tree2.accept(hasFruitV));
        System.out.println(tree1 + ".hasFruit? " + tree1.accept(hasFruitV));

        iHeightV heightV = new iHeightV();
        System.out.println();
        System.out.println(tree5 + ".height?\n\t" + tree5.accept(heightV));
        System.out.println(tree6 + ".height?\n\t" + tree6.accept(heightV));
        System.out.println(tree4 + ".height?\n\t" + tree4.accept(heightV));
        System.out.println(tree3 + ".height?\n\t" + tree3.accept(heightV));
        System.out.println(tree2 + ".height?\n\t" + tree2.accept(heightV));
        System.out.println(tree1 + ".height?\n\t" + tree1.accept(heightV));
        TreeD tree7 =
                new Split(
                        new Split(
                                new Bud(),
                                new Bud()),
                        new Flat(new Fig(),
                                new Flat(new Lemon(),
                                        new Flat(new Apple(),
                                                new Bud()))));
        System.out.println(tree7 + ".height?\n\t" + tree7.accept(heightV));

        System.out.println();
        TreeD tree8 =
                new Split(
                        new Split(
                                new Flat(new Fig(),
                                        new Bud()),
                                new Flat(new Fig(),
                                        new Bud())),
                        new Flat(new Fig(),
                                new Flat(new Lemon(),
                                        new Flat(new Apple(),
                                                new Bud()))));
        System.out.println(tree8 + ".subst(Apple, Fig):\n" +
                tree8.accept(new tSubstV(new Apple(), new Fig())));

        System.out.println();
        System.out.println(tree8 + ".occurs(Fig):\n" +
                tree8.accept(new iOccursV(new Fig())));
        System.out.println(tree7 + ".occurs(Fig):\n" +
                tree7.accept(new iOccursV(new Fig())));

        System.out.println("\nGeneral visitors that produce Object");
        System.out.println(tree8 + ".isFlat?\n" + tree8.accept(new IsFlatV()));
        System.out.println(tree8 + ".isSplit?\n" + tree8.accept(new IsSplitV()));
        System.out.println(tree8 + ".occurs(Fig):\n" + tree8.accept(new OccursV(new Fig())));

        System.out.println("\nChapter 8. Like Father, Like Son");
        System.out.println("Use Inheritance in Visitor Pattern. Expression Interpretation.\n");

        // (+ 7 (* (- 4 3) 5)) => 12
        ExprD expr1 =
                new Plus(
                        new Const(new Integer(7)),
                        new Prod(
                                new Diff(
                                        new Const(new Integer(4)),
                                        new Const(new Integer(3))),
                                new Const(new Integer(5))));
        IntEvalV intEvalV = new IntEvalV();
        System.out.println(expr1 + ".eval():\n" + expr1.accept(intEvalV));

        // (union {7, 5} (intersection (diff {4} {3}) {5})) => {7, 5}
        // => rename the operators:
        // => (+ {7, 5} (* (- {4} {3})) {5}))
        // eval to => new Empty().add(new Integer(7)).add(new Integer(5))
        ExprD expr2 =
                new Plus(
                        new Const(new Empty()
                                .add(new Integer(7))
                                .add(new Integer(5))),
                        new Prod(
                                new Diff(
                                        new Const(new Empty()
                                                .add(new Integer(4))),
                                        new Const(new Empty()
                                                .add(new Integer(3)))),
                                new Const(new Empty()
                                        .add(new Integer(5)))));
        SetEvalV setEvalV = new SetEvalV();
        System.out.println(expr2 + ".eval():\n" + expr2.accept(setEvalV));

        System.out.println("\nChapter 9. Be a Good Visitor");
        System.out.println("Extension of interfaces; Factory Method Pattern for polymorphic generator\n");
        PointD point7 = new ShadowedManhattanPt(2, 3, 1, 0);
        System.out.println(point7 + ".distanceToO(): " + point7.distanceToO());
        PointD point8 = new ShadowedCartesianPt(12, 5, 3, 4);
        System.out.println(point8 + ".distanceToO(): " + point8.distanceToO());
        PointD point9 = new ShadowedCartesianPt(1, 5, 1, 2);
        System.out.println(point6 + ".closerToO(" + point9 + "): " + point6.closerToO(point9));
        System.out.println(point9 + ".distanceToO(): " + point9.distanceToO());

        System.out.println();
        ShapeD circle1 = new Circle(10);
        System.out.println(circle1 + ".hasPt(Cartisian(10,10))? " +
                circle1.accept(new HasPtV(new CartesianPt(10, 10))));
        ShapeD square1 = new Square(10);
        System.out.println(square1 + ".hasPt(Cartisian(10,10))? " +
                square1.accept(new HasPtV(new CartesianPt(10, 10))));
        ShapeD circle2 = new Translation(new CartesianPt(5, 6), new Circle(10));
        System.out.println(circle2 + ".hasPt(Cartisian(10,10))? " +
                circle2.accept(new HasPtV(new CartesianPt(10, 10))));
        ShapeD circle3 = new Translation(
                new CartesianPt(5, 4),
                new Translation(
                        new CartesianPt(5, 6),
                        new Circle(10)));
        System.out.println(circle3 + ".hasPt(Cartisian(10,10))? " +
                circle3.accept(new HasPtV(new CartesianPt(10, 10))));

        System.out.println("\nUnion Shape");
        ShapeD union1 = new Translation(
                new CartesianPt(12, 2),
                new Union(
                        new Square(10),
                        new Translation(
                                new CartesianPt(4, 4),
                                new Circle(5))));
        System.out.println(union1 + ".hasPt(CartesianPt(12,6))?\n" +
                union1.accept(new UnionHasPtV(new CartesianPt(12, 6))));
        ShapeD union2 = new Translation(
                new CartesianPt(3, 7),
                new Union(
                        new Square(10),
                        new Circle(10)));
        System.out.println(union2 + ".hasPt(CartesianPt(13,17))?\n" +
                union2.accept(new UnionHasPtV(new CartesianPt(13, 17))));

        System.out.println("\nChapter 10. The State of Things to Come");
        System.out.println("\n");
        PieManI pieman1 = new PieManM();
        System.out.println("pieman1 = " + pieman1);
        System.out.println("pieman1.occTop(AnchovyTop): " + pieman1.occTop(new AnchovyTop()));
        System.out.println("pieman1.addTop(nchovyTop): " + pieman1.addTop(new AnchovyTop()));
        System.out.println("pieman1.occTop(AnchovyTop): " + pieman1.occTop(new AnchovyTop()));
        System.out.println("pieman1.addTop(AnchovyTop): " + pieman1.addTop(new AnchovyTop()));
        System.out.println("pieman1.occTop(AnchovyTop): " + pieman1.occTop(new AnchovyTop()));
        System.out.println("pieman1.substTop(Tuna, AnchovyTop): " +
                pieman1.substTop(new Tuna(), new AnchovyTop()));
        System.out.println("pieman1.occTop(AnchovyTop): " + pieman1.occTop(new AnchovyTop()));
        PieManI pieman2 = new PieManM();
        pieman2.addTop(new AnchovyTop());
        pieman2.addTop(new AnchovyTop());
        pieman2.addTop(new Salmon());
        pieman2.addTop(new Tuna());
        pieman2.addTop(new Tuna());
        int result = pieman2.substTop(new Tuna(), new AnchovyTop());
        System.out.println("pieman2\n.addTop(Anchovy)" +
                "\n.addTop(Anchovy)\n.addTop(Salmon)\n.addTop(Tuna)\n.addTop(Tuna):");
        System.out.println(result);
        result = pieman2.remTop(new Tuna());
        System.out.println("pieman2.remTop(Tuna):");
        System.out.println(result); // remTop() always produces 0
        System.out.println("pieman2.occTop(Salmon): " + pieman2.occTop(new Salmon()));
        System.out.println("pieman1.occTop(Salmon): " + pieman1.occTop(new Salmon()));
    }
}
