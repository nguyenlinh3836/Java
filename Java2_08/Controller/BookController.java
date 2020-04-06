package Java2_08.Controller;

import Java2_08.Model.Book;

import java.sql.*;
import java.util.Scanner;

public class BookController {
    Scanner in = new Scanner(System.in);
    public void insertBook(Book book) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/storebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
                PreparedStatement pstmt = conn.prepareStatement("insert into book(id,name,price,qty) values (?,?,?,?)");
        ) {
                pstmt.setInt(1,book.getId());
                pstmt.setString(2,book.getName());
                pstmt.setDouble(3,book.getPrice());
                pstmt.setInt(4,book.getQty());
                int rowsInserted = pstmt.executeUpdate();
                System.out.println(rowsInserted + "rows affected.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Book book) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/storebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            book.setId();
            book.setQty();
            book.setQty();
            String sqlInsert = "update book set Price = "+ book.getQty() +",qty = "+ book.getQty() +" where id ="+ book.getId();
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(Book book) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/storebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
                PreparedStatement pstmt = conn.prepareStatement("delete from book where id = ?")
        ) {
            book.setId();
            pstmt.setInt(1,book.getId());
            int rowDeleted = pstmt.executeUpdate();
            if (rowDeleted == 0 ){
                System.out.println("Can't Delete! \n");
            }else {
                System.out.println(rowDeleted + " records deleted.\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectBook() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/storebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            ResultSet rset = stmt.executeQuery("select * from book limit 100");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-40s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-40s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-40s", rset.getString(i));
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Book scannerBook(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        String Name = in.nextLine();
        System.out.print("Enter Book Author: ");
        String articles = in.nextLine();
        System.out.print("Enter Book price: ");
        double price = in.nextDouble();
        System.out.print("Enter Book Qty: ");
        int qty = in.nextInt();
        Book book = new Book(Name,price,qty,articles);
        return book;
    }

}
