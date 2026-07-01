package ru.at.test.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testDistance(){
    Point p1 = new Point(0,0);
    Point p2 = new Point(1,0);
    Assert.assertEquals(Point.Distance(p1,p2),1);
  }
}
