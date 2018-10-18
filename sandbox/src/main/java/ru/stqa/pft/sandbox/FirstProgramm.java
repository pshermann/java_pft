package ru.stqa.pft.sandbox;

public class FirstProgramm {
    public static void main(String[] args) {
        hello("QA");
        hello("Developer");

        Square s = new Square(25);

        double l=5;
        System.out.println("Площадь квадрата со стороной "+s.l+" = "+area(s));
        Rectangle r = new Rectangle(22,24);
        double a=4;
        double b=6;
        System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" = "+area(r));
    }

    public static void hello(String wazza){
        System.out.println("Hello, "+wazza+"!");
    }


    public static double area(Square s){
        return s.l*s.l;
    }

    public static double area(Rectangle r){
        return r.a*r.b;
    }
}