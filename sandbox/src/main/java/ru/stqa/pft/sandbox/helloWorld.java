package ru.stqa.pft.sandbox;

public class HelloWorld {
    public static void main(String[] args) {
        hello("Vlad");
        hello("user!");
        double l = 5;
        System.out.println("kvadrat = " + area(l));
        double a = 4, b = 6;
        System.out.println("pryamoygolnik = " + area(4,5));
    }

    public static void hello(String smb) {
        System.out.println("Hello " + smb);
    }

    public static double area(double length) {
        return length * length;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}
