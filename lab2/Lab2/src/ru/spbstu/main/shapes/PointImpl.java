package ru.spbstu.main.shapes;

public class PointImpl implements Point{
    int x;
    int y;

    public PointImpl(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
}
