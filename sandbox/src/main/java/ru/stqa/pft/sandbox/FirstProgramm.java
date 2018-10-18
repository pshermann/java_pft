package ru.stqa.pft.sandbox;

public class FirstProgramm {
    public static void main(String[] args) {
        hello("QA");
        hello("Developer");
        double l=5;
        System.out.println("Площадь квадрата со стороной "+l+" = "+area(l));

        double a=4;
        double b=6;
        System.out.println("Площадь прямоугольника со сторонами "+a+" и "+b+" = "+area(a,b));
    }

    public static void hello(String wazza){
        System.out.println("Hello, "+wazza+"!");
    }


    public static double area(double l){
        return l*l;
    }

    public static double area(double a, double b){
        return a*b;
    }
}