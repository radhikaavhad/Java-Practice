package bookstore.runner;

import bookstore.dao.BookDAO;
import bookstore.dao.BookDAOImpl;
import bookstore.model.Book;

import java.util.Scanner;

public class TestBookStore {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("===Welcome to the Online Bookstore===");
            System.out.println("1) Insert book");
            System.out.println("2) Update book");
            System.out.println("3) Delete book");
            System.out.println("4) View book by ID");
            System.out.println("5) View book by Name");
            System.out.println("6) View all books");
            System.out.println("7) Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    //TODO - Insert a new book using DAO
                    System.out.println("Enter book name: ");
                    String bname = sc.nextLine();
                    System.out.println("Enter book price: ");
                    double bprice = sc.nextDouble();
                    sc.nextLine();
                    int insertedRows = bookDAO.insert(new Book(0, bname, bprice));
                    System.out.println(insertedRows+" rows inserted");
                    break;

                case 2:
                    //TODO - Update book
                    System.out.println("Enter book ID to update: ");
                    int bidupd = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter book name to update: ");
                    String bnameupd = sc.nextLine();
                    System.out.println("Enter book price to update:");
                    double bpriceupd = sc.nextDouble();
                    sc.nextLine();
                    int updatedRows = bookDAO.update(new Book(bidupd, bnameupd, bpriceupd));
                    System.out.println(updatedRows+" rows updated");
                    break;

                case 3:
                    //TODO - Delete book
                    System.out.println("Enter book ID to delete: ");
                    int biddel = sc.nextInt();
                    sc.nextLine();
                    int deletedRows = bookDAO.delete(new Book(biddel, null, 0));
                    System.out.println(deletedRows+" rows deleted");
                    break;

                case 4:
                    //TODO - View book by ID
                    System.out.println("Enter book ID to view: ");
                    int bidview = sc.nextInt();
                    sc.nextLine();
                    System.out.println(bookDAO.view(bidview));
                    break;

                case 5:
                    //TODO - View book by Name
                    System.out.println("Enter book name to view: ");
                    String bnameview = sc.nextLine();
                    System.out.println(bookDAO.view(bnameview));
                    break;

                case 6:
                    //TODO - View books
                    bookDAO.view().forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("Exiting");
                    return;
            }
        }
    }
}
