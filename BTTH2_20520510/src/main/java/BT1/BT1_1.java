/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT1;

/**
 *
 * @author admind
 */
public class BT1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nhap toa do diem A:\n");
        Point A = new Point();
        A.createPoint();

        System.out.print("Nhap toa do diem B:\n");
        Point B = new Point();
        B.createPoint();
        
        double distanceAB = A.distance(B);
        System.out.println("Khoang cach giua A va B la: " + distanceAB);
    }
}
