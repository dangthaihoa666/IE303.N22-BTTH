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
public class BT4 {

    /**
     * @param args the command line arguments
     * @param n so nguyen duong n
     */
    public static void cau1(double n) {
        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public static void cau2(double n) {
        int ketQua = 1;
        for (double i = n; i > 10; i = i / 10) {
            ketQua++;
        }
        System.out.println(ketQua);
    }

    public static void cau3(int n) {
        int soDaoNguoc = 0;
        int soBanDau = n;
        while (n > 0) {
            int temp = n % 10;
            soDaoNguoc = soDaoNguoc * 10 + temp;
            n /= 10;
        }
        if (soBanDau == soDaoNguoc) {
            System.out.println(soBanDau + " la so doi xung.");
        } else {
            System.out.println(soBanDau + " khong la so doi xung.");
        }
    }

    public static void cau4(double n) {
        boolean soChinhPhuong = false;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                soChinhPhuong = true;
                break;
            }
        }
        if (soChinhPhuong) {
            System.out.println((int) n + " la so chinh phuong.");
        } else {
            System.out.println((int) n + " khong la so chinh phuong.");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        double n = scanner.nextDouble();
        // cau 1
        System.out.print("1. Liet ke cac uoc so cua n: ");
        cau1(n);

        // cau 2
        System.out.print("2. Cho biet n co bao nhieu chu so: ");
        cau2(n);

        // cau 3
        System.out.print("3. Kiem tra n phai la so doi xung khong? ");
        cau3((int) n);

        // cau 4
        System.out.print("4. Kiem tra n là so chinh phuong khong? ");
        cau4(n);
    }

}
