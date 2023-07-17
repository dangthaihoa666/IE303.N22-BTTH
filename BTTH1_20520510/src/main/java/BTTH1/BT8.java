/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTTH1;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author admind
 */
public class BT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        Random generator = new Random(19900828);
        int random = generator.nextInt((n - 0) + 1) + 0;
        int min = 0;
        int max = n;
        int x;
        do {
            System.out.println("(" + min + ", " + max + ")?");
            x = scanner.nextInt();
            if (x > max || x < min) {
                System.out.println("Out of range. Try again?");
            } else {
                if (x > random) {
                    System.out.println("Too big.");
                    max = x;
                }
                if (x < random) {
                    System.out.println("Too small.");
                    min = x;
                }
                if (x == random) {
                    System.out.println("Bingo.");
                }
            }
        } while (random != x);

    }

}
