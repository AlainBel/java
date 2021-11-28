package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceCalculationTests {

    @Test
    public void testDistanceCalculation1() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(2.0, 3.0);

        Assert.assertEquals(point1.distance(point2), 1.4142135623730951);
    }

    @Test
    public void testDistanceCalculation2() {
        Point point1 = new Point(1.0, 2.0);
        Point point3 = new Point(4.0, 5.0);

        Assert.assertEquals(point1.distance(point3), 4.242640687119285);
    }

    @Test
    public void testDistanceCalculation3() {
        Point point1 = new Point(1.0, 2.0);
        Point point4 = new Point(5.0, 7.0);

        Assert.assertEquals(point1.distance(point4), 6.4031242374328485);
    }

}