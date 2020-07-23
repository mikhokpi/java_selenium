package ru.stqa.pft.sandbox;

public class HelloWorld {
    public static void main(String[] args) {

        Square s = new Square();
        s.l = 5;
        System.out.println("square = " + area(s));
        Rectangle r = new Rectangle();
        r.a = 2;
        r.b = 3;
        System.out.println("rectangle = " + area(r));
    }

    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }


}
