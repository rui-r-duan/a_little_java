package pie;

public class AnchovyTop extends FishD {
    // The class Object is defined in a separate package, called java.lang.Object.
    // Overriding methods that reside in other packages requires the word public.
    public boolean equals(Object o) {
        return (o instanceof AnchovyTop);
    }
}
