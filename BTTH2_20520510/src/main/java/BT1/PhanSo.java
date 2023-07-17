/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

import java.util.Scanner;

/**
 *
 * @author admind
 */
public class PhanSo {

    public int TuSo;
    public int MauSo;
    Scanner scanner = new Scanner(System.in);

    public PhanSo(int TuSo) {
        this.TuSo = TuSo;
        this.MauSo = 1;
    }

    public PhanSo() {
        this.TuSo = 0;
        this.MauSo = 1;
    }

    public PhanSo(int TuSo, int MauSo) {
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }

    public int getTuSo() {
        return TuSo;
    }

    public int getMauSo() {
        return MauSo;
    }

    public void setTuSo(int TuSo) {
        this.TuSo = TuSo;
    }

    public void setMauSo(int MauSo) {
        this.MauSo = MauSo;
    }

    public void createPhanSo() {
        System.out.print("Nhap tu so: ");
        this.TuSo = scanner.nextInt();
        do {
            System.out.print("Nhap mau so: ");
            this.MauSo = scanner.nextInt();
            if (this.MauSo == 0){
                System.out.print("Mau so phai khac 0.");
            }
        }
        while(this.MauSo == 0);
    }

    public void printPhanSo() {
        System.out.print(this.TuSo + "/" + this.MauSo);
    }

    public PhanSo cong(PhanSo ps) {
        int kqTuSo = this.TuSo * ps.MauSo + ps.TuSo * this.MauSo;
        int kqMauSo = this.MauSo * ps.MauSo;
        PhanSo kq = new PhanSo(kqTuSo, kqMauSo);
        kq.toiGian();
        return kq;
    }

    public PhanSo tru(PhanSo ps) {
        int kqTuSo = this.TuSo * ps.MauSo - ps.TuSo * this.MauSo;
        int kqMauSo = this.MauSo * ps.MauSo;
        PhanSo kq = new PhanSo(kqTuSo, kqMauSo);
        kq.toiGian();
        return kq;
    }

    public PhanSo nhan(PhanSo ps) {
        int kqTuSo = this.TuSo * ps.TuSo;
        int kqMauSo = this.MauSo * ps.MauSo;
        PhanSo kq = new PhanSo(kqTuSo, kqMauSo);
        kq.toiGian();
        return kq;
    }

    public PhanSo chia(PhanSo ps) {
        int kqTuSo = this.TuSo * ps.MauSo;
        int kqMauSo = this.MauSo * ps.TuSo;
        PhanSo kq = new PhanSo(kqTuSo, kqMauSo);
        kq.toiGian();
        return kq;
    }

    public void toiGian() {
        int ucln = timUCLN(this.TuSo, this.MauSo);
        this.TuSo /= ucln;
        this.MauSo /= ucln;
    }

    private int timUCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return timUCLN(b, a % b);
    }

    public String toString() {
        return (TuSo + "/" + MauSo);
    }
}
