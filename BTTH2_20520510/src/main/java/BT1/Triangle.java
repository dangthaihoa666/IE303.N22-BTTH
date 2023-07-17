/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;
import java.util.Scanner;
/**
 *
 * @author admind
 */
class Triangle extends Shape {
    double a;
    double b;
    double c;

    @Override
    double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    void input(Scanner in) {
        System.out.println("Nhap thong tin tam giac:");
        System.out.println("Nhap do dai canh 1: ");
        a = in.nextDouble();
        System.out.println("Nhap do dai canh 2: ");
        b = in.nextDouble();
        System.out.println("Nhap do dai canh 3: ");
        c = in.nextDouble();
    }
    
    @Override
    void output() {
        System.out.println("Do dai canh 1: " + this.a);
        System.out.println("Do dai canh 2: " + this.b);
        System.out.println("Do dai canh 3: " + this.c);
        System.out.println("Dien tich: " + this.getArea());
        System.out.println("Chu vi: " + this.getPerimeter());
    }
}
