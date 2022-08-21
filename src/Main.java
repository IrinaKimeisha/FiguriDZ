public class Main {
    public static void main(String[] args) {
        /** Написать иерархию классов «Фигуры».
         Фигура -> Треугольник -> Прямоугольник -> Круг.
         Реализовать метод подсчета площади для каждого типа фигуры и подсчет периметра.
         Создать массив из 5 фигур.
         Вывести на экран сумму периметра всех фигур в массиве. */
        Figure[] figure = new Figure[3];
        figure[0] = new Triangle();
        figure[1] = new Circle();
        figure[2] = new Kvadrat();
        double summaPerimetrov = 0;
        for (int i = 0; i < figure.length; i++) {
            summaPerimetrov = figure[0].perimetrToFind() + figure[1].perimetrToFind() + figure[2].perimetrToFind();
        }
        System.out.print("Сумма периметра всех фигур в массиве равна " + summaPerimetrov);
    }
}
