abstract class PlateD {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}

class Gold extends PlateD {}

class Silver extends PlateD {}

class Brass extends PlateD {}

class Copper extends PlateD {}
