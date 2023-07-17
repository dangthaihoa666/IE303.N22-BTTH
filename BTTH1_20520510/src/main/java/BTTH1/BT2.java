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
public class BT2 {

    /**
     * @param args the command line arguments
     * @param x x
     * @param n n
     * @return Tong
     */
    public static double tinhTong(double x, double n) {
        double Tong = 0;
        double tuSo = 1;
        double mauSo = 0;
        for (int i = 1; i <= n; i++) {
            tuSo *= x;
            mauSo += i;
            Tong += tuSo / mauSo;
        }
        // Trả về
        return Tong;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        double n = scanner.nextDouble();
        System.out.println("Nhap x: ");
        double x = scanner.nextDouble();
        System.out.println(tinhTong(x, n));
    }
}
