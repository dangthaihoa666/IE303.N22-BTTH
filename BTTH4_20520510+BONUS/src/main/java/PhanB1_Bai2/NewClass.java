/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanB1_Bai2;

/**
 *
 * @author admind
 */
import java.io.*;
import java.util.Date;

public class NewClass {
    public static void main(String[] args) {
        // a Hãy ghi file lên file student.txt lần lượt theo thứ tự sau:
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("F:/student.txt"));

            // Ghi chuỗi “Hello Students and Pupils”.

            outputStream.writeObject("Hello Students and Pupils");

            //  Ghi đối tượng ngày. 
            outputStream.writeObject(new Date());

            //  Đối tượng student với tên Sơn Tùng MTP.
            outputStream.writeObject(new Student("Sơn", "Tùng MTP"));

            // Đối tượng pupil với tên là Minh Mạng
            outputStream.writeObject(new Pupil("Minh Mạng"));

            // Đối tượng student với tên Bảo Thy
            outputStream.writeObject(new Student("Bảo"," Thy"));

            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // b Đọc file student.txt vừa ghi bên trên.
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("F:/student.txt"));

            String hello = (String) inputStream.readObject();
            Date date = (Date) inputStream.readObject();
            Student sonTung = (Student) inputStream.readObject();
            Pupil minhMang = (Pupil) inputStream.readObject();
            Student baoThy = (Student) inputStream.readObject();

            System.out.println(hello);
            System.out.println(date);
            System.out.println(sonTung);
            System.out.println(minhMang);
            System.out.println(baoThy);

            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
