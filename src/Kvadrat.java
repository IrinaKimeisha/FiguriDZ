public class Kvadrat extends Figure {
    Kvadrat() {
        sideA = 5;
        sideB = 6;
    }

    @Override
    double sToFind() {
        s = sideA * sideB;
        return s;
    }

    @Override
    double perimetrToFind() {
        perimetr = 2 * (sideA + sideB);
        return perimetr;
    }

}
