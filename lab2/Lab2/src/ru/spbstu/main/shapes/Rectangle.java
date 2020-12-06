package ru.spbstu.main.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape, Polygon{
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    @Override
    public float getPerimeter() {
        return new Vector(p1,p2).getLength() + new Vector(p1,p4).getLength() + new Vector(p2,p3).getLength() + new Vector(p3,p4).getLength();
    }

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public float getArea() {
        return new Vector(p1,p2).getLength() * new Vector(p1, p4).getLength();
    }

    @Override
    public int getRotation() {
        return 0;
    }
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
