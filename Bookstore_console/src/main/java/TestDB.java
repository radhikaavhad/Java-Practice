
import java.sql.*;
import java.util.Scanner;

public class TestDB {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("org.h2.Driver");
            System.out.println("Driver Loaded.");

            Connection conn = DriverManager.
                    getConnection("jdbc:h2:file:C:\\Users\\Radhika Avhad\\Desktop\\h2","sa","");
            System.out.println("Established Connection.");

            Scanner sc = new Scanner(System.in);

            //TO DO - Insert a new book
//            Statement statement1 = conn.createStatement();
//            System.out.println("Enter book name: ");
//            String name = sc.nextLine();
//            System.out.println("Enter price of the book: ");
//            double price = sc.nextDouble();
//            String sql1 = "Insert into books(name, price) values('"+name+"',"+price+")";
//            int res1 = statement1.executeUpdate(sql1);
//            System.out.println(res1 + " rows inserted");

            //TODO - Update a book
//            Statement statement2 = conn.createStatement();
//            String sql2 = "update books set name = 'OCPJP by Kathy Sierra',price = 4800 where name = 'Hidden Gems'";
//            int res2 = statement2.executeUpdate(sql2);
//            System.out.println(res2 + " rows updated");

            //TODO - View all books
            Statement statement3 = conn.createStatement();
            String sql3 = "select * from books";
            ResultSet resultSet = statement3.executeQuery(sql3);

            while(resultSet.next()){
                System.out.println("===Printing Book Details===");
                System.out.println("Id = "+resultSet.getInt(1));
                System.out.println("Book Name = "+resultSet.getString(2));
                System.out.println("Price = "+resultSet.getString(3));
            }

//            //TODO - Delete a book
//            Statement statement4 = conn.createStatement();
//            String sql4 = "delete from books where id=1";
//            int res4 = statement4.executeUpdate(sql4);
//            System.out.println(res4 + " rows deleted");
        }
    }
