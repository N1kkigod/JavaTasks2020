package ru.spbstu.main.shapes;

public class Vector{
    private Point p1;
    private Point p2;

    public Vector(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public float getLength()
    {
        float maxx = Math.max(this.p1.getX(),this.p2.getX());
        float minx = Math.min(this.p1.getX(),this.p2.getX());
        float maxy = Math.max(this.p1.getY(),this.p2.getY());
        float miny = Math.min(this.p1.getY(),this.p2.getY());
        float v12x = maxx-minx; //X-координата вектора 1-2
        float v12y = maxy-miny; //Y-координата вектора 1-2
        return (float)Math.sqrt(Math.pow(v12x,2)+Math.pow(v12y,2)); //Длина вектора 1-2
    }

}
