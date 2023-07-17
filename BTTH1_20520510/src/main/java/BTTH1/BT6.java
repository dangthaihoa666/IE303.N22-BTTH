/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BTTH1;

import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author admind
 */
public class BT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nhập vào 2 ngày a, b (Kiểu Calendar). 
        Scanner scanner = new Scanner(System.in);
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();

        System.out.println("Nhap ngay a (dd/MM/yyyy): ");
        String[] dateParts = scanner.nextLine().split("/");
        a.set(Integer.parseInt(dateParts[2]), Integer.parseInt(dateParts[1]) - 1, Integer.parseInt(dateParts[0]));

        System.out.println("Nhap ngay b (dd/MM/yyyy): ");
        dateParts = scanner.nextLine().split("/");
        b.set(Integer.parseInt(dateParts[2]), Integer.parseInt(dateParts[1]) - 1, Integer.parseInt(dateParts[0]));

        // 1. So sánh 2 ngày a và b.
        if (a.get(Calendar.YEAR) == b.get(Calendar.YEAR)
                && a.get(Calendar.MONTH) == b.get(Calendar.MONTH)
                && a.get(Calendar.DAY_OF_MONTH) == b.get(Calendar.DAY_OF_MONTH)) {
            System.out.println("Ngay a va ngay b la cung ngay");
        } else if (a.compareTo(b) > 0) {
            System.out.println("Ngay a sau ngay b");
        } else if (a.compareTo(b) < 0) {
            System.out.println("Ngay a truoc ngay b");
        }

        // 2. In ra ngày trước và ngày tiếp theo của ngày a.
        Calendar prevDay = (Calendar) a.clone();
        prevDay.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println("Ngay truoc cua ngay a: " + prevDay.get(Calendar.DAY_OF_MONTH) + "/" + (prevDay.get(Calendar.MONTH) + 1) + "/" + prevDay.get(Calendar.YEAR));

        Calendar nextDay = (Calendar) a.clone();
        nextDay.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Ngày tiep theo cua ngay a: " + nextDay.get(Calendar.DAY_OF_MONTH) + "/" + (nextDay.get(Calendar.MONTH) + 1) + "/" + nextDay.get(Calendar.YEAR));

        // 3. Cho biết a là ngày thứ mấy trong năm.
        int dayOfYear = a.get(Calendar.DAY_OF_YEAR);
        System.out.println("a la ngay thu " + dayOfYear + " trong nam");

        // 4. Cho biết tháng chứa a có bao nhiêu ngày (Ví dụ: a = 14/02/2016, tháng 02)?
        int daysInMonth = a.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Thang " + (a.get(Calendar.MONTH) + 1) + " co " + daysInMonth + " ngay");

        // 5. Cho biết năm chứa a có phải làm năm nhuần không?
        int year = a.get(Calendar.YEAR);
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (isLeapYear) {
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year + " khong la nam nhuan");
        }
    }

}
