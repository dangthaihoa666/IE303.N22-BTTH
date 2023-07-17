/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau2;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    private List<User> users = new ArrayList<>();
    private List<Book> books = new ArrayList<>();

    public LibraryManagement() {
        // Khởi tạo một số tài khoản người dùng và sách
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
        books.add(new Book("Book 1", "Author 1", true));
        books.add(new Book("Book 2", "Author 2", true));
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public User register(String username, String password) {
        User user = new User(username, password);
        users.add(user);
        return user;
    }

    public List<Book> search(String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                results.add(book);
            }
        }
        return results;
    }

    public boolean borrowBook(User user, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            return true;
        } else {
            return false;
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
    }
}
