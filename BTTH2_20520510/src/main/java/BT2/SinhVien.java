/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.util.Scanner;

/**
 *
 * @author admind
 */
public class SinhVien {

    private String MSSV;
    private String HoTen;
    private double diemGT;
    private double diemVL;
    private double diemNMLT;
    private double DTB;
    Scanner scanner = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(String MSSV, String HoTen, double diemGT, double diemVL, double diemNMLT) {
        this.MSSV = MSSV;
        this.HoTen = HoTen;
        this.diemGT = Math.round(diemGT * 100.0) / 100.0;
        this.diemVL = Math.round(diemVL * 100.0) / 100.0;
        this.diemNMLT = Math.round(diemNMLT * 100.0) / 100.0;
        this.DTB = Math.round((((diemGT + diemVL + diemNMLT) / 3) * 100.0) / 100.0);
    }

    public String getMSSV() {
        return MSSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public double getDiemGT() {
        return diemGT;
    }

    public double getDiemVL() {
        return diemVL;
    }

    public double getDiemNMLT() {
        return diemNMLT;
    }

    public double getDTB() {
        return DTB;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiemGT(double diemGT) {
        this.diemGT = diemGT;
    }

    public void setDiemVL(double diemVL) {
        this.diemVL = diemVL;
    }

    public void setDiemNMLT(double diemNMLT) {
        this.diemNMLT = diemNMLT;
    }

    public void setDTB(double DTB) {
        this.DTB = DTB;
    }

    public void inputSinhVien() {
        System.out.print("Nhap MSSV: ");
        MSSV = scanner.next();
        
        System.out.print("Nhap ho ten: ");
        HoTen = scanner.next();

        System.out.print("Nhap diem giai tich: ");
        diemGT = scanner.nextDouble();
        diemGT = Math.round(diemGT * 100.0) / 100.0;
        
        System.out.print("Nhap diem vat li: ");
        diemVL = scanner.nextDouble();
        diemVL = Math.round(diemVL * 100.0) / 100.0;
        
        System.out.print("Nhap diem NMLT: ");
        diemNMLT = scanner.nextDouble();
        diemNMLT = Math.round(diemNMLT * 100.0) / 100.0;
        
        DTB = Math.round(((diemGT + diemVL + diemNMLT) / 3) * 100.0) / 100.0;
    }

    public void printSinhvien() {
        System.out.println("MSSV: " + this.MSSV);
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Diem giai tich: " + this.diemGT);
        System.out.println("Diem vat li: " + this.diemVL);
        System.out.println("Diem NMLT: " + this.diemNMLT);
        System.out.println("Diem trung binh: " + this.DTB);
    }

}
