package ru.stqa.pft.sandbox;

public class HelloWorld {
    public static void main(String[] args) {

        Square s = new Square(5);
        System.out.println("square = " + s.area());

        Rectangle r = new Rectangle(2,3);
        System.out.println("rectangle = " + r.area());
    }
}
