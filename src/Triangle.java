public class Triangle extends Figure {
    Triangle() {
        sideA = 3;
        sideB = 4;
        sideC = 5;
    }

    //S = p ⋅ ( p − a ) ⋅ ( p − b ) ⋅ ( p − c ) - формула Герона
    @Override
    double sToFind() {
        poluPerimetr = (sideA + sideB + sideC) / 2;
        s = poluPerimetr * (poluPerimetr - sideA) * (poluPerimetr - sideB) * (poluPerimetr - sideC);
        return s;
    }

    @Override
    double perimetrToFind() {
        perimetr = sideA + sideB + sideC;
        return perimetr;
    }
}
