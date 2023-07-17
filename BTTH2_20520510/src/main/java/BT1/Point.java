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

public class Point {

    private double x;
    private double y;
    Scanner scanner = new Scanner(System.in);

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void createPoint() {
        System.out.print("Nhap hoanh do: ");
        this.x = scanner.nextDouble();
        System.out.print("Nhap tung do: ");
        this.y = scanner.nextDouble();
    }
    
    public void printPoint(){
        System.out.print("(" + this.x + ";" + this.y + ")");
    }
    
    public double distance(Point point) {
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));
    }
    
}
