/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cau2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admind
 */
public class Cau2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryFacade();

        // Đăng nhập
        User user = libraryFacade.login("user1", "password1");
        if (user != null) {
            System.out.println("Đăng nhập thành công với tài khoản " + user.getUsername());
        } else {
            System.out.println("Đăng nhập thất bại");
        }

        // Đăng ký tài khoản
        User newUser = libraryFacade.register("user3", "password3");
        if (newUser != null) {
            System.out.println("Đăng ký tài khoản thành công với tài khoản " + newUser.getUsername());
        } else {
            System.out.println("Đăng ký tài khoản thất bại");
        }

        // Tìm kiếm sách
        List<Book> books = libraryFacade.search("Book");
        System.out.println("Kết quả tìm kiếm: ");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }

        // Mượn sách
        Book book = books.get(0);
        boolean success = libraryFacade.borrowBook(user, book);
        if (success) {
            System.out.println("Đặt mượn sách thành công");
        } else {
            System.out.println("Đặt mượn sách thất bại");
        }

        // Trả sách
        libraryFacade.returnBook(book);
        System.out.println("Trả sách thành công");
    }
}
