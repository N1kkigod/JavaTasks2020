package ru.spbstu.main;
import ru.spbstu.main.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(new PointImpl(1,1), new PointImpl(8,8), new PointImpl(16,1));
        shapes[1] = new Rectangle(new PointImpl(1,1), new PointImpl(1,8), new PointImpl(8,8), new PointImpl(8,1));
        shapes[2] = new Circle(2);
        System.out.println(shapes[0].getArea());
        System.out.println(shapes[1].getArea());
        System.out.println(shapes[2].getArea());
        System.out.println(getMaxArea(shapes).getArea());
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }
    public static Shape getMaxArea(Shape[] shapes)
    {
        float maxShape = shapes[0].getArea();
        Shape maxAreaShape = shapes[0];
        for (Shape shape : shapes)
        {
            if(shape.getArea() > maxShape) {
                maxShape = shape.getArea();
                maxAreaShape = shape;
            }
        }
        return maxAreaShape;
    }


}
