/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanB2_Bai2;

/**
 *
 * @author admind
 */
public class SinhVien {
    private String MSSV;
    private String hoTen;
    private String lop;
    private String diem;

    public SinhVien(String MSSV, String hoTen, String lop, String diem) {
        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diem = diem;
    }

    public String getMSSV() {
        return MSSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public String getDiem() {
        return diem;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }
    
}
