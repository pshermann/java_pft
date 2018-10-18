package ru.stqa.pft.sandbox;

public class FirstProgramm {
    public static void main(String[] args) {
        hello("QA");
        hello("Developer");

        Square s = new Square(25);

        double l=5;
        System.out.println("Площадь квадрата со стороной "+s.l+" = "+s.area());
        Rectangle r = new Rectangle(22,24);
        double a=4;
        double b=6;
        System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" = "+r.area());
    }

    public static void hello(String wazza){
        System.out.println("Hello, "+wazza+"!");
    }




}