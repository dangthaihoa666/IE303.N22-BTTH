/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT1;
import java.util.Scanner;
/**
 *
 * @author admind
 */
public class BT1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hinh vuong: ");
        Shape hinhVuong = new Square();
        hinhVuong.input(in);
        hinhVuong.output();
        
        System.out.println("Hinh chu nhat: ");
        Shape hinhChuNhat = new Rectangle();
        hinhChuNhat.input(in);
        hinhChuNhat.output();
        
        System.out.println("Hinh tron: ");
        Shape hinhTron = new Circle();
        hinhTron.input(in);
        hinhTron.output();
        
        System.out.println("Hinh tam giac: ");
        Shape hinhTamGiac = new Triangle();
        hinhTamGiac.input(in);
        hinhTamGiac.output();
    }
    
}
