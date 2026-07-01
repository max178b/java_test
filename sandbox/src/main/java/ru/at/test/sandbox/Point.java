package ru.at.test.sandbox;

public class Point {
  public double x1;
  public double y1;
  public double x2;
  public double y2;

  public Point (double x, double y){
    this.x1=x;
    this.x2=x;
    this.y1=y;
    this.y2=y;

  }
  public static double Distance(Point p1, Point p2) {

    double d = Math.sqrt(Math.pow((p2.x2 - p1.x1), 2) + Math.pow((p2.y2 - p1.y1), 2));
    return d;
  }

}




