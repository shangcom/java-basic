package oop1.ex;

public class RectangleProcedural {

    int width;
    int height;
    int area;

    public RectangleProcedural(int width, int height) {
        this.width = width;
        this.height = height;
        area = calculateArea();
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

}
