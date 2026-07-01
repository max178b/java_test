package ru.at.test.sandbox;

public class hello {
  public static void main(String[] args) {
    hwrld("world");
    hwrld("user");
    hwrld("Max");

    Square s = new Square(7);
    System.out.println("ploshad kvadrata so storonoi "+ s.l + " = "+ s.area());

    Rectangle m = new Rectangle(6,10);
    System.out.println("ploshad pryamougolnika so storonami "+m.a+" i "+m.b+" = " + m.area());
  }

  public static void hwrld(String somebody){
    System.out.println("Hello, "+ somebody +"!");
  }

}