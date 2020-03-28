package eBook;

import java.sql.*;

public class JdbcUpdateTest {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update books set price = price*0.5 where title = 'A Cup of Java'";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
            String strUpdate2 = "update books set qty=0 where title = 'A Teaspoon of Java' ";
            System.out.println("The SQL statement is: " + strUpdate2 + "\n");
            int countUpdated2 = stmt.executeUpdate(strUpdate2);
            System.out.println(countUpdated2 + " records affected.\n");
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}
