/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanB2_Bai3;

/**
 *
 * @author admind
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang n: ");
        int n = sc.nextInt();
        System.out.print("Nhap so cot m: ");
        int m = sc.nextInt();
        double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = Math.random() * 100;
            }
        }
        // a Thực hiện thao tác ghi ma trận đó xuống file với tên “btvn.txt”.
        FileOutputStream fos = new FileOutputStream("F:/btvn.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                osw.write(a[i][j] + " ");
            }
            osw.write("\n");
        }
        osw.flush();
        osw.close();

        // b Thực hiện thao tác đọc ma trận in ra màn hình.
        FileInputStream fis = new FileInputStream("F:/btvn.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        int c;
        while ((c = isr.read()) != -1) {
            System.out.print((char) c);
        }
        isr.close();
    }
}
