package com.qa.homeWork6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество книг:");

        int amountOfBooks = sc.nextInt();
        Books myBooks = new Books(amountOfBooks);
        myBooks.addBook(new Book(1, "Brem Stoker", "Dracula", "Star", 1960, 385, 250));
        myBooks.addBook(new Book(2, "Alex Duma", "Black tulip", "Star", 1955, 270, 230));
        myBooks.addBook(new Book(3, "Shari Lapena", "The couple next door", "Star", 2015, 280, 300));
        myBooks.addBook(new Book(4, "George Martin", "A song og Ice and Fire", "Fenix", 2011, 870, 1000));
        myBooks.addBook(new Book(5, "Scott Fitzgerald", "The Great Gatsby", "Star", 1925, 218, 600));
        myBooks.addBook(new Book(6, "Leo Tolstoy", "War and Peace", "Star", 1869, 1225, 1250));
        myBooks.addBook(new Book(7, "Antoine de Saint Exupery", "The little Prince", "Letter", 1943, 85, 150));
        myBooks.addBook(new Book(8, "Suzanne Collins", "The hunger games", "Star", 2008, 305, 670));
        myBooks.addBook(new Book(9, "Margaret Mitchell", "Gone with the Wind", "Star", 1936, 1056, 930));
        System.out.println("All my books");
        myBooks.showAllBooks();
        Books myDumaBooks = myBooks.SearchBooksByAuthor("Alex Duma");
        System.out.println("All my books written by Duma");
        myDumaBooks.showAllBooks();
        Books myCenturyBooks = myBooks.SearchBooksByYear(2000);
        System.out.println("All my books published this centure");
        myCenturyBooks.showAllBooks();
        myBooks.changePriceOfBooks(10);
        System.out.println("All my books are getting expensive");
        myBooks.showAllBooks();
    }
}
