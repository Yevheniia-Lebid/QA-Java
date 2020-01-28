package com.qa.homeWork6;

public class Book {
    private int id;
    private String author;
    private String title;
    private String publishingCompany;
    private int year;
    private int amountOfPages;
    private double price;

    public Book(int id, String author, String title, String publishingCompany, int year, int amountOfPages, double price) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publishingCompany = publishingCompany;
        this.year = year;
        this.amountOfPages = amountOfPages;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getPublishingCompany() { return publishingCompany; }
    public void setPublishingCompany(String publishingCompany) { this.publishingCompany = publishingCompany; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public int getAmountOfPages() { return amountOfPages; }
    public void setAmountOfPages(int amountOfPages) { this.amountOfPages = amountOfPages; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void  viewBook() {
        System.out.println("id=" + id
                + ", author=" + author
                + ", title=" + title
                + ", publishing company=" + publishingCompany
                + ", year=" + year
                + ", amount of pages=" + amountOfPages
                + ", price=" + price);
    }
}
