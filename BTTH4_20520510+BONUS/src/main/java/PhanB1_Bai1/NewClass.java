/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PhanB1_Bai1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author admind
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // a Dùng InputStream để đọc file nhị phân b1.txt có chứa dòng chữ “CNTT2013 is so kute”.
        // In ra mỗi dòng bao gồm giá trị thập phân của kí tự và kí tự:

        try {
            InputStream inputStream = new FileInputStream("F:/b1.txt");
            int data = inputStream.read();
            while (data != -1) {
                System.out.println(data + " " + (char) data);
                data = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

        // b Sử dụng OutputStream để ghi file nhị phân b2.txt với chuỗi “We are the best group”.        
        try {
            OutputStream outputStream = new FileOutputStream("F:/b2.txt");
            String str = "We are the best group";
            byte[] strToBytes = str.getBytes();
            outputStream.write(strToBytes);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // c Để tăng tốc việc xử lý, chúng ta cần đọc đồng loạt nhiều byte. Giả sử
        // mỗi lần đọc, chương trình có thể đọc và ghi 10 byte. Sử dụng file b1.txt 
        // để thực hiện quá trình đọc
        try {
            InputStream inputStream = new FileInputStream("F:/b1.txt");
            byte[] buffer = new byte[10];
            int bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
