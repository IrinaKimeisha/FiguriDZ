public class Circle extends Figure {
    public Circle() {
        radius = 2;

    }

    @Override
    double sToFind() {
        s = pi * radius * radius;
        return s;
    }

    @Override
    double perimetrToFind() {
        perimetr = 2 * pi * radius;
        return perimetr;
    }
}
