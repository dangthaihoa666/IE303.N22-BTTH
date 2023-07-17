/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau3;

/**
 *
 * @author admind
 */
public class RealVideo implements Video {

    private String videoUrl;

    public RealVideo(String videoUrl) {
        this.videoUrl = videoUrl;
        System.out.println("Đang tải video từ " + videoUrl);
    }

    @Override
    public void play() {
        System.out.println("Đang phát video từ " + videoUrl);
    }
}
