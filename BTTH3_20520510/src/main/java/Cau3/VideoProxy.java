/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau3;

/**
 *
 * @author admind
 */
public class VideoProxy implements Video {

    private RealVideo realVideo;
    private int numberOfViews;

    public VideoProxy(String videoUrl) {
        this.realVideo = new RealVideo(videoUrl);
        this.numberOfViews = 0;
    }

    @Override
    public void play() {
        if (numberOfViews < 5) {
            realVideo.play();
            numberOfViews++;
        } else {
            System.out.println("Bạn đã đạt giới hạn việc tải video");
        }
    }
}
