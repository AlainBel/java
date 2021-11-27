package ru.stqa.pft.sandbox;

public class DistanceCalculation {

    public static void main(String[] args) {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(2.0, 3.0);
        double distance = distance(point1, point2);
        System.out.println("Расстояние между точками " + point1 + " и " + point2 + " равно " + distance);
    }

    public static double distance(Point p1, Point p2) {
        double sqrtX = (p2.x - p1.x) * (p2.x - p1.x);
        double sqrtY = (p2.y - p1.y) * (p2.y - p1.y);
        return Math.sqrt(sqrtX + sqrtY);
    }

}