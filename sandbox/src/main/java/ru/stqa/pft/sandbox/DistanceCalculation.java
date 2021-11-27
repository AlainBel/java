package ru.stqa.pft.sandbox;

public class DistanceCalculation {

    public static void main(String[] args) {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(2.0, 3.0);
        Point point3 = new Point(4.0, 5.0);
        Point point4 = new Point(5.0, 7.0);

        double distance1 = point1.distance(point2);
        double distance2 = point1.distance(point3);
        double distance3 = point1.distance(point4);

        System.out.println("Расстояние между точками " + point1 + " и " + point2 + " равно " + distance1);
        System.out.println("Расстояние между точками " + point1 + " и " + point3 + " равно " + distance2);
        System.out.println("Расстояние между точками " + point1 + " и " + point4 + " равно " + distance3);
    }

}