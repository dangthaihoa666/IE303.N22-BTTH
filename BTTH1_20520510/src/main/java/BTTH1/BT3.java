/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTTH1;

import java.util.Scanner;

/**
 *
 * @author admind
 */
public class BT3 {

    /**
     * @param args the command line arguments
     * @param a canh a
     * @param b canh b
     * @param c canh c
     * @return chu vi
     */
    public static double tinhChuVi(double a, double b, double c) {
        return a + b + c;
    }

    public static double tinhDienTich(double a, double b, double c) {
        return Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai canh a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap do dai canh b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap do dai canh c: ");
        double c = scanner.nextDouble();
        System.out.println("Chu vi: " + tinhChuVi(a, b, c));
        System.out.println("Dien tich:" + tinhDienTich(a, b, c));
    }

}
