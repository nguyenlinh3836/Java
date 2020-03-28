package eBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class InsertTestEx1 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(  "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
                ){
            /// DELETE
            String sqlDelete = "delete from books where id > 8000";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");
            ///INSERT MULTI
            String sqlInsert = "insert into books values "
                    + "(8001, 'Java Core', 'Dang Kim Thi', 15.55, 55),"
                    + "(8002, 'Java Advanced', 'James Gosling', 25.55, 55)";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            ///INSERT 1
            sqlInsert = "insert into books (id, title, author) values (2001, 'Java JDBC MySQL', 'ThiDK')";
            System.out.println("The SQL statement is :" + sqlInsert+ "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            ///DELETE INPUT ID
            Scanner in = new Scanner(System.in);
            System.out.println("Please input id delete:");
            String input = in.nextLine();
            sqlDelete = "delete from books where id =" + input;
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");
//            ///INSERT INPUT
            System.out.println("Please input id:");
            String id = in.nextLine();
            System.out.println("Please input Title name:");
            String title = in.nextLine();
            System.out.println("Please input Author");
            String author = in.nextLine();
            System.out.println("Please input price");
            String price = in.nextLine();
            System.out.println("Please input Quantity:");
            String qty = in.nextLine();
            sqlInsert = "insert into books values ( " + id + "," + "'" + title + "'," + "'" + author + "'," + price + "," + qty + ")";
            System.out.println("The SQL statement is :" + sqlInsert+ "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex){
            ex.printStackTrace();
        }


    }
}
