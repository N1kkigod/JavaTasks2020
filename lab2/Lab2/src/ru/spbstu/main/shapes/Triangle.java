package ru.spbstu.main.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Shape, Polygon{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    //Площадь
    @Override
    public float getArea() {
        float p = getPerimeter()/2;
        return (float)Math.sqrt(p*(p - getLength(p1,p2))*(p - getLength(p1,p3))*(p - getLength(p2,p3)));
    }
    //Угол поворота
    @Override
    public int getRotation() {
        return 0;
    }
    //Периметр
    @Override
    public float getPerimeter() {
        return getLength(p1,p2) + getLength(p1,p3) + getLength(p2,p3);
    }

    public float getLength(Point p1, Point p2) //Нахождение длины вектора по двум точкам
    {
        float maxx = Math.max(p1.getX(),p2.getX());
        float minx = Math.min(p1.getX(),p2.getX());
        float maxy = Math.max(p1.getY(),p2.getY());
        float miny = Math.min(p1.getY(),p2.getY());
        float v12x = maxx-minx; //X-координата вектора 1-2
        float v12y = maxy-miny; //Y-координата вектора 1-2
        return (float)Math.sqrt(Math.pow(v12x,2)+Math.pow(v12y,2)); //Длина вектора 1-2
    }


    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
