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
public class BT5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi 1: ");
        String s1 = scanner.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String s2 = scanner.nextLine();

        // 1. Cho biết tổng chiều dài 2 chuỗi s1 và s2
        System.out.println("1. Cho biet tong chieu dai 2 chuoi s1 va s2");
        System.out.println("Tong chieu dai 2 chuoi la " + (s1.length() + s2.length()));
        System.out.println("");

        // 2. Lấy 3 kí tự đầu tiên chuỗi s1.
        System.out.println("2. Lay 3 ki tu dau tien cua chuoi s1.");
        System.out.println("3 ki tu dau tien cua chuoi s1: " + s1.substring(0, 3));
        System.out.println("");

        // 3. Lấy 3 kí tự cuối của chuỗi s2.
        System.out.println("3. Lay 3 ki tu cuoi cua chuoi s2.");
        System.out.println("3 ki tu cuoi cua chuoi s2: " + s2.substring(s2.length() - 3));
        System.out.println("");

        // 4. Lấy kí tự thứ 6 của chuỗi s1.
        System.out.println("4. Lay ki tu thu 6 cua chuoi s1.");
        System.out.println("Ki tu thu 6 cua chuoi s1: " + s1.charAt(5));
        System.out.println("");

        // 5. Kiểm tra 2 chuỗi s1 và s2 có bằng nhau không?
        System.out.println("5. Kiem tra 2 chuoi s1 va s2 co bang nhau khong?");
        if (s1.equals(s2)) {
            System.out.println("Hai chuoi s1 va s2 bang nhau.");
        } else {
            System.out.println("Hai chuoi s1 va s2 khong bang nhau.");
        }
        System.out.println("");

        // 6. Cho biết s2 có xuất hiện trong s1 hay không? Nếu có thì đó là vị trí nào?
        System.out.println("6. Cho biet s2 co xuat hien trong s1 hay khong? Neu co thi do la vi tri nao?");
        if ((s1.indexOf(s2)) != -1) {
            System.out.println("Chuoi s2 xuat hien trong chuoi s1 tai vi tri thu " + (s1.indexOf(s2) + 1));
        } else {
            System.out.println("Chuoi s2 khong xuat hien trong chuoi s1.");
        }
        System.out.println("");
    }

}
