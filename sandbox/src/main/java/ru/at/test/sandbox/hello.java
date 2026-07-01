package ru.at.test.sandbox;

public class hello {
  public static void main(String[] args) {
    hwrld("world");
    hwrld("user");
    hwrld("Max");
    double l = 7;
    double a = 6;
    double b = 10;
    System.out.println("ploshad kvadrata so storonoi "+ l + " = "+ area(l));
    System.out.println("ploshad pryamougolnika so storonami "+a+" i "+b+" = " + area(a,b));
  }

  public static void hwrld(String somebody){
    System.out.println("Hello, "+ somebody +"!");
  }

  public static double area(double len){
    return len*len;
  }

  public static double area(double a, double b){
    return a*b;
  }
}