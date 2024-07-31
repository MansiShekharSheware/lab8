package lab9;

import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}

class BookManagementSystem {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void updateBook(String oldTitle, String newTitle, String newAuthor) {
        for (Book book : books) {
            if (book.getTitle().equals(oldTitle)) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
            }
        }
    }

    public void deleteBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        BookManagementSystem bms = new BookManagementSystem();
        bms.addBook("Book1", "Author1");
        bms.addBook("Book2", "Author2");
        bms.displayBooks();

        bms.updateBook("Book1", "UpdatedBook1", "UpdatedAuthor1");
        bms.displayBooks();

        bms.deleteBook("Book2");
        bms.displayBooks();
    }
}
