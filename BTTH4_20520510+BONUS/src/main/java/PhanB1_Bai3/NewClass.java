/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PhanB1_Bai3;

/**
 *
 * @author admind
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.*;
import java.util.*;

public class NewClass {

    public static void main(String[] args) {
        // a Ghi một dãy số nguyên random tự động (n phần tử, nhập từ bàn phím) lên file với tên “bufftest.txt”. Lưu ý mỗi dòng chứa một số nguyên.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu n: ");
        int n = scanner.nextInt();
        Random random = new Random();
        try {
            try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("F:/bufftest.txt"))) {
                for (int i = 0; i < n; i++) {
                    int num = random.nextInt();
                    outputStream.write(Integer.toString(num).getBytes());
                    outputStream.write(System.lineSeparator().getBytes());
                }
            }
            // b Đọc dãy số vừa ghi trên file “bufftest.txt”.
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("F:/bufftest.txt"))) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    System.out.print(new String(buffer, 0, bytesRead));
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
