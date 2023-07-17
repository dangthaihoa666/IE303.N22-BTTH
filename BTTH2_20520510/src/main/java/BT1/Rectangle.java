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
class Rectangle extends Shape {
    double a;
    double b;

    @Override
    double getArea() {
        return a * b;
    }

    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    void input(Scanner in) {
        System.out.println("Nhap thong tin hinh chu nhat:");
        System.out.println("Nhap chieu dai: ");
        a = in.nextDouble();
        System.out.println("Nhap chieu rong: ");
        b = in.nextDouble();
    }
    
    @Override
    void output() {
        System.out.println("Do dai chieu dai: " + this.a);
        System.out.println("Do dai chieu rong: " + this.b);
        System.out.println("Dien tich: " + this.getArea());
        System.out.println("Chu vi: " + this.getPerimeter());
    }
}
