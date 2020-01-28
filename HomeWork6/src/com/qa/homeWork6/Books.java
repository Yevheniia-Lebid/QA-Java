package com.qa.homeWork6;

public class Books {
    private Book[] books;
    private int amountOfBooks;
    private int maxAmountOfBooks;
    public Books (int amountOfBooks){
        this.books = new Book[amountOfBooks];
        this.maxAmountOfBooks = amountOfBooks;
        this.amountOfBooks = 0;
    };

    public void addBook(Book book){
        if(amountOfBooks < maxAmountOfBooks){
            books[amountOfBooks] = book;
            amountOfBooks++;
        }
    }
    public void showAllBooks(){
        for(int i=0; i < amountOfBooks; i++){
            books[i].viewBook();
        }
    }
    public void changePriceOfBooks(double percent){
        for(int i=0; i < amountOfBooks; i++){
            books[i].setPrice(books[i].getPrice()*(100 + percent)/100);
        }
    }
    public Books SearchBooksByAuthor(String author){
        Books bookByAuthor = new Books(maxAmountOfBooks);
        for(int i=0; i < amountOfBooks; i++){
            if(books[i].getAuthor() == author){
                bookByAuthor.addBook(books[i]);
            }
        }
        return bookByAuthor;
    }

    public Books SearchBooksByYear(int year){
        Books booksAfterYear = new Books(maxAmountOfBooks);
        for(int i=0; i < amountOfBooks; i++){
            if(books[i].getYear() > year){
                booksAfterYear.addBook(books[i]);
            }
        }
        return booksAfterYear;
    }

}
