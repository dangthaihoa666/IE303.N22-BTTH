/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT2;

import java.util.Scanner;

/**
 *
 * @author admind
 */
public class BT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int soLuongSV = scanner.nextInt();
        SinhVien[] dsSinhVien = new SinhVien[soLuongSV];
        for (int i = 0; i < soLuongSV; i++) {
            System.out.println("Nhap thong tin cua sinh vien thu " + (i + 1) + ":");
            dsSinhVien[i] = new SinhVien();
            dsSinhVien[i].inputSinhVien();
        }

        //Nhà trường muốn trao học bổng cho những sinh viên có thành tích học
//xuất sắc. Điều kiện để trao học bổng là điểm trung bình >=8.0 và điểm
//Nhập môn lập trình >=9.0. Hãy liệt kê danh sách sinh viên được nhận
//học bổng
        System.out.println("Danh sach sinh vien duoc nhan hoc bong: ");
        for (int i = 0; i < soLuongSV; i++) {
            SinhVien sv = dsSinhVien[i];
            if (sv.getDTB() >= 8.0 && sv.getDiemNMLT() >= 9.0) {
                sv.printSinhvien();
            }
        }

        // Xuất thông tin những sinh viên có điểm trung bình cao nhất. Lưu ý: Có
//thể có nhiều sinh viên có cùng điểm trung bình cao nhất.
        double maxDTB = 0;
        for (int i = 0; i < soLuongSV; i++) {
            if (dsSinhVien[i].getDTB() > maxDTB) {
                maxDTB = dsSinhVien[i].getDTB();
            }
        }
        System.out.println("Danh sach sinh vien co diem trung binh cao nhat: ");
        for (int i = 0; i < soLuongSV; i++) {
            SinhVien sv = dsSinhVien[i];
            if (sv.getDTB() == maxDTB) {
                sv.printSinhvien();
            }
        }
        
        //Sắp xếp danh sách sinh viên giảm dần theo điểm trung bình. Xuất danh sách top 10 sinh viên có điểm cao nhất.

        //Sắp xếp danh sách sinh viên giảm dần theo điểm trung bình. 
        for (int i = 0; i < soLuongSV - 1; i++) {
            for (int j = i + 1; j < soLuongSV; j++) {
                if (dsSinhVien[j].getDTB() > dsSinhVien[i].getDTB()) {
                    SinhVien tmp = dsSinhVien[i];
                    dsSinhVien[i] = dsSinhVien[j];
                    dsSinhVien[j] = tmp;
                }
            }
        }

        //Xuất danh sách top 10 sinh viên có điểm cao nhất.
        System.out.println("Danh sach top 10 sinh viên co diem cao nhat: ");
        if (soLuongSV <= 10) {
            for (int i = 0; i < soLuongSV; i++) {
                dsSinhVien[i].printSinhvien();
            }
        } else {
            for (int i = 0; i < soLuongSV; i++) {
                if (dsSinhVien[i].getDTB() >= dsSinhVien[9].getDTB()) {
                    dsSinhVien[i].printSinhvien();
                }
            }
        }
    }
}
