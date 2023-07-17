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
class Circle extends Shape {
    double r;

    @Override
    double getArea() {
        return Math.PI * r * r;
    }

    @Override
    double getPerimeter() {
        return Math.PI * 2 * r;
    }

    @Override
    void input(Scanner in) {
        System.out.println("Nhap thong tin hinh tron: ");
        System.out.println("Nhap ban kinh: ");
        r = in.nextDouble();
    }
    
    @Override
    void output() {
        System.out.println("Ban kinh: " + this.r);
        System.out.println("Dien tich: " + this.getArea());
        System.out.println("Chu vi: " + this.getPerimeter());
    }

}
