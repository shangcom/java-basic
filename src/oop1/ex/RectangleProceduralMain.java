package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {

        RectangleProcedural rectangleProcedural = new RectangleProcedural(5, 8);

        System.out.println("넓이: " + rectangleProcedural.area);

        int perimeter = rectangleProcedural.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangleProcedural.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
