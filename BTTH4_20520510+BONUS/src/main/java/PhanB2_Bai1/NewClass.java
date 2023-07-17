/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PhanB2_Bai1;

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

    public static void main(String[] args) {
         
        // a Nhập mảng A từ bàn phím và ghi các phần tử của mảng xuống file A2.txt để lưu trữ
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng A: ");
        n = sc.nextInt();
        int[] A = new int[n];
        try {
            FileOutputStream fos = new FileOutputStream("F:/A2.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                A[i] = sc.nextInt();
                osw.write(A[i] + " ");
            }
            osw.close();
            fos.close();
            System.out.println("Ghi mảng A xuống file A2.txt thành công!");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        // b Đọc mảng A từ file A2
        try {
            FileInputStream fis = new FileInputStream("F:/A2.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            Scanner scanner = new Scanner(isr);
            System.out.println("Mảng A đọc từ file A2.txt là:");
            while (scanner.hasNextInt()) {
                System.out.print(scanner.nextInt() + " ");
            }
            scanner.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}