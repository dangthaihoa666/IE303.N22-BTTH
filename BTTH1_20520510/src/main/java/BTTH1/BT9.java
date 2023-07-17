/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTTH1;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author admind
 */
public class BT9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N (so luong cong dan): ");
        int n = scanner.nextInt(); // số lượng công dân

        System.out.println("Nhap ma so id cua cong dan dau tien bi nhiem benh (0 <= x < N): ");
        int x; // id công dân đầu tiên bị nhiễm bệnh
        do {
            x = scanner.nextInt();
            if (0 > x || x >= n) {
                System.out.println("Nhap khong hop le! Vui long nhap ma so id cua cong dan dau tien bi nhiem benh (0 <= x < N): ");
            }
        } while (0 > x || x >= n);

        // arr1 id 
        // arr2 contactee
        // arr3 self-isolated
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        ArrayList<Integer> arr3 = new ArrayList<>();

        // set id 
        for (int i = 0; i < n; i++) {
            arr1[i] = i;
        }
        System.arraycopy(arr1, 0, arr2, 0, n);

        // print id
        System.out.print("       Id | ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        // shuffle arr2
        Random rand = new Random();
        for (int i = arr2.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
        }

        // print contactee
        System.out.print("\nContactee | ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

        //
        while (true) {
            arr3.add(x); // Đưa id x của người đầu tiên bị nhiễm bệnh vào arr3
            x = arr2[x]; // x = id của người tiếp xúc với người nhiễm bệnh
            for (int i = 0; i < arr3.size(); i++) { //Kiểm tra x có tồn tại trong arr3 không
                if (arr3.get(i) == x) { // Nếu x tồn tại trong arr3 thì in ra những người cần cách ly và dừng vòng lặp
                    System.out.print("\nThe following citizens are to be self-isolated: ");
                    for (int j = 0; j < arr3.size(); j++) {
                        System.out.print(arr3.get(j) + " ");
                    }
                    return;
                }
            }
        }
    }
}
