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
class Square extends Shape {
    double a;

    @Override
    double getArea() {
        return a * a;
    }

    @Override
    double getPerimeter() {
        return a * 4;
    }

    @Override
    void input(Scanner in) {
        System.out.println("Nhap thong tin hinh vuong:");
        System.out.println("Nhap do dai canh: ");
        a = in.nextDouble();
    }
    
    @Override
    void output() {
        System.out.println("Do dai canh: " + this.a);
        System.out.println("Dien tich: " + this.getArea());
        System.out.println("Chu vi: " + this.getPerimeter());
    }
}
