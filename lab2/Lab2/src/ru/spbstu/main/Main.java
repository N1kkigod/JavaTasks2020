package ru.spbstu.main;
import ru.spbstu.main.shapes.PointImpl;
import ru.spbstu.main.shapes.Shape;
import ru.spbstu.main.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Triangle(new PointImpl(1,2),new PointImpl(1,2), new PointImpl(1,2));

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
}
