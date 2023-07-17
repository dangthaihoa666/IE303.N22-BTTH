/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanB2_Bai2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author admind
 */
public class NewClass {

    public static void main(String[] args) {
        // a Nhập n sinh viên từ bàn phím. Lưu trữ các sinh viên này trên file sinhvien.txt.
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner1.nextInt();
        scanner1.nextLine(); // consume the newline character
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("F:/sinhvien.txt"), StandardCharsets.UTF_8)) {
            for (int i = 0; i < n; i++) {
                System.out.printf("Nhap thong tin sinh vien thu %d:\n", i + 1);
                System.out.print("MSSV: ");
                String mssv = scanner1.nextLine();
                System.out.print("Ho ten: ");
                String hoTen = scanner1.nextLine();
                System.out.print("Lop: ");
                String lop = scanner1.nextLine();
                System.out.print("Diem: ");
                String diem = scanner1.nextLine();

                SinhVien sv = new SinhVien(mssv, hoTen, lop, diem);
                writer.write(sv.getMSSV() + "," + sv.getHoTen() + "," + sv.getLop() + "," + sv.getDiem() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

// b Xóa sinh viên có mã số ABC (nhập tùy ý từ bàn phím) ra khỏi file sinhvien.txt.
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Nhap ma so sinh vien can xoa: ");
        String mssvXoa = scanner2.nextLine();
        try {
            File inputFile = new File("F:/sinhvien.txt");
            File tempFile = new File("F:/sinhvien_temp.txt");

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.UTF_8));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile), StandardCharsets.UTF_8));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String mssv = parts[0];
                if (!mssv.equals(mssvXoa)) {
                    writer.write(line + "\n");
                }
            }
            writer.close();
            reader.close();
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Da xoa sinh vien co ma so " + mssvXoa + " khoi file sinhvien.txt");
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }
    }

}
