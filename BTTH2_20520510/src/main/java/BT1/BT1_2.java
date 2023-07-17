/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT1;

/**
 *
 * @author admind
 */
public class BT1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nhap phan so A:\n");
        PhanSo A = new PhanSo();
        A.createPhanSo();

        System.out.print("Nhap phan so B:\n");
        PhanSo B = new PhanSo();
        B.createPhanSo();
        
        PhanSo tong = A.cong(B);
        PhanSo hieu = A.tru(B);
        PhanSo tich = A.nhan(B);
        PhanSo thuong = A.chia(B);
        
        System.out.println("Tong cua A va B: " + tong.toString());
        System.out.println("Hieu cua A va B: " + hieu.toString());
        System.out.println("Tich cua A va B: " + tich.toString());
        System.out.println("Thuong cua A va B: " + thuong.toString());
    }
    
}
