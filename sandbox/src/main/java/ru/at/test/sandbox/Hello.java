package ru.at.test.sandbox;


public class Hello {
  public static void main(String[] args) {
    hwrld("world");
    hwrld("user");
    hwrld("Max");

    Square s = new Square(7);
    System.out.println("ploshad kvadrata so storonoi "+ s.l + " = "+ s.area());

    Rectangle m = new Rectangle(6.5,10);
    System.out.println("ploshad pryamougolnika so storonami "+m.a+" i "+m.b+" = " + m.area());

    Point p1 = new Point(0,0);
    Point p2 = new Point(3,3);

    System.out.println("Rasstoyanie mezhdu tochkami = "+ Point.Distance(p1,p2));
  }

  public static void hwrld(String somebody){
    System.out.println("Hello, "+ somebody +"!");
  }


}