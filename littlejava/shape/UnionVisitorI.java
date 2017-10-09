package littlejava.shape;

// Unlike a class, an interface can actually extend several other
// interfaces.  A class can implement several different interfaces.
interface UnionVisitorI extends ShapeVisitorI {
    boolean forUnion(ShapeD s, ShapeD t);
}
