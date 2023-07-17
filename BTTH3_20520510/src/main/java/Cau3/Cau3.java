/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cau3;

/**
 *
 * @author admind
 */
public class Cau3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video video = new VideoProxy("youtube.com");
        video.play(); // phát video lần 1
        video.play(); // phát video lần 2
        video.play(); // phát video lần 3
        video.play(); // phát video lần 4
        video.play(); // phát video lần 5
        video.play(); // Phát video lần 6 -> đạt giới hạn -> không cho phát nữa
    }
}