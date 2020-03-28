package giftcontroller;

import Phone.Contact;
import giftmodel.Gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class GiftController {
    Scanner in = new Scanner(System.in);
    public void deleteGift(Gift gift) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/gift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            int id;
            System.out.println("Please input id to delete:");
            id = in.nextInt();
            gift.setId(id);
            String s = String.valueOf(gift.getID());
            String sqlDelete = "delete from gift where id =  " + s ;
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertGift(Gift gift){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/gift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            System.out.println("Please input ID:");
            int id = in.nextInt();
            gift.setId(id);
            String s1 = String.valueOf(gift.getID());
            System.out.println("Please input name");
            String name = in.nextLine();
            gift.setName(name);
            String s2 = gift.getName();
            System.out.println("PLease input Price");
            Float price = in.nextFloat();
            gift.setPrice(price);
            String s3 = String.valueOf(gift.getPrice());
            System.out.println("PLease input Qty");
            int qty = in.nextInt();
            gift.setQty(qty);
            String s4 = String.valueOf(gift.getQty());
            String sqlInsert = "insert into gift values ( " + s1 + "," + "'" + s2 + "'," + "," + s3 + "," + s4 + ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void selectGift(Gift gift){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/gift?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select name, price, qty from gift";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            int rowCount = 0;
            while(rset.next()) {
                String name = rset.getString("name");
                double price = rset.getDouble("price");
                int    qty   = rset.getInt("qty");
                System.out.println(name + ", " + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}




