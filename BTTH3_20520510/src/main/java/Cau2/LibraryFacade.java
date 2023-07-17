/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admind
 */
public class LibraryFacade {
    private LibraryManagement libraryManagement;

    public LibraryFacade() {
        libraryManagement = new LibraryManagement();
    }

    public User login(String username, String password) {
        return libraryManagement.login(username, password);
    }

    public User register(String username, String password) {
        return libraryManagement.register(username, password);
    }

    public List<Book> search(String keyword) {
        return libraryManagement.search(keyword);
    }

    public boolean borrowBook(User user, Book book) {
        return libraryManagement.borrowBook(user, book);
    }

    public void returnBook(Book book) {
        libraryManagement.returnBook(book);
    }
}
