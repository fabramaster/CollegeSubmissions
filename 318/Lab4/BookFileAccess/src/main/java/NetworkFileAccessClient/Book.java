package NetworkFileAccessClient;

import java.io.Serializable;

public class Book implements Serializable {
    private String book_title;
    private String author;
    private String isbn;
    private Integer edition;
    private Integer copyright_year;
    private Double price;
    private Integer quantity_in_stock;

    // No-argument constructor
    public Book() {
        this("", "", "", 0, 0, 0.0, 0);
    }

    // Constructor with arguments
    public Book(String book_title, String author, String isbn, 
               Integer edition, Integer copyright_year, 
               Double price, Integer quantity_in_stock) {
        this.book_title = book_title;
        this.author = author;
        this.isbn = isbn;
        this.edition = edition;
        this.copyright_year = copyright_year;
        this.price = price;
        this.quantity_in_stock = quantity_in_stock;
    }

    // Getters
    public String getBookTitle() { return book_title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public Integer getEdition() { return edition; }
    public Integer getCopyrightYear() { return copyright_year; }
    public Double getPrice() { return price; }
    public Integer getQuantityInStock() { return quantity_in_stock; }

    // Setters
    public void setBookTitle(String book_title) { this.book_title = book_title; }
    public void setAuthor(String author) { this.author = author; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setEdition(Integer edition) { this.edition = edition; }
    public void setCopyrightYear(Integer copyright_year) { this.copyright_year = copyright_year; }
    public void setPrice(Double price) { this.price = price; }
    public void setQuantityInStock(Integer quantity_in_stock) { this.quantity_in_stock = quantity_in_stock; }
}