package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }

    public double distance(Point p2) {
        double sqrtX = (p2.x - this.x) * (p2.x - this.x);
        double sqrtY = (p2.y - this.y) * (p2.y - this.y);
        return Math.sqrt(sqrtX + sqrtY);
    }

}