/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTTH1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admind
 */
public class BT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n (kich thuoc mang a): ");
        int n = scanner.nextInt();
        System.out.println("Nhap m (kich thuoc mang b): ");
        int m = scanner.nextInt();

        //Cho mảng số nguyên A (kích thước n)
        int[] A = new int[n];
        //for (int i = 0; i < m; i++) {
        //    A[i] = (int) (Math.random() * 100);
        //}

        //1. Tạo mảng số nguyên B (kích thước m) với các giá trị ngẫu nhiên (Hướng dẫn: sử dụng phương thức Math.random).
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = (int) (Math.random() * 100);
        }

        //2. Xuất toàn bộ các phần tử của B ra màn hình (Hướng dẫn: sử dụng phương thức Arrays.toString).
        System.out.println("Mang B: " + Arrays.toString(B));

        //3. Tạo mảng C từ mảng A (Hướng dẫn: sử dụng phương thức copyOf).
        int[] C = Arrays.copyOf(A, n); // tạo mảng C từ mảng A

        //4. Thay thế phần tử thứ 1 đến 3 của mảng C bằng 3 phần tử cuối của mảng B (Hướng dẫn: sử dụng hàm System.arraycopy).
        System.arraycopy(B, m - 3, C, 0, 3);

        //5. Sắp xếp mảng C tăng dần và suất ra màn hình (Hướng dẫn: sử dụng phương thức Arrays.sort)
        Arrays.sort(C);
        System.out.println("Sap xep mang C tang dan: " + Arrays.toString(C));

    }

}
