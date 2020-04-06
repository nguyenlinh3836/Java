package Java2_08.Controller;
import Java2_08.Model.Customer;
import java.sql.*;
import java.util.Scanner;

import static java.sql.DriverManager.*;

public class CustomerController {
    public void insertCustomer(Customer customer) {
        try (
                Connection conn = getConnection(
                        "jdbc:mysql://localhost:3306/storebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                PreparedStatement pstmt = conn.prepareStatement("insert into customer(Name,email,tel,Adress,level) value (?,?,?,?,?)")

        ) {
           pstmt.setString(1,customer.getName());
           pstmt.setString(2,customer.getEmail());
           pstmt.setString(3,customer.getPhone());
           pstmt.setString(4,customer.getAdress());
           pstmt.setInt(5,customer.getLevel());
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + "rows affected.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCustomer(Customer customer) {
        try (
                Connection conn = getConnection(
                        "jdbc:mysql://localhost:3306/storebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            customer.setId();
            customer.setEmail();
            customer.setPhone();
            customer.setLevel();
            String sqlInsert = "update customer set email = '"+ customer.getEmail() +"',tel = '"+ customer.getPhone() +"',customer.level = "+ customer.getLevel() +" where id ="+ customer.getId();
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCusmoter(Customer customer) {
        try (
                Connection conn = getConnection(
                        "jdbc:mysql://localhost:3306/storebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            customer.setId();

            String sqlDelete = "delete from customer where id = "+ customer.getId() +" and "+ customer.getId() +" not in (select Customer_id from order)";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            if (countDeleted ==0 ){
                System.out.println("Can't Delete! \n");
            }else {
                System.out.println(countDeleted + " records deleted.\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectCustomer() {
        try (
                Connection conn = getConnection(
                        "jdbc:mysql://localhost:3306/storebook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
           ResultSet rset = stmt.executeQuery("select * from customer limit 100");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColumns; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; ++i) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Customer scannerCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customerName = in.nextLine();
        System.out.print("Enter Email: ");
        String email = in.nextLine();
        System.out.print("Enter Phone: ");
        String phone = in.nextLine();
        System.out.print("Enter Address: ");
        String address = in.nextLine();
        System.out.print("Enter Level: ");
        int level = in.nextInt();
        Customer customer = new Customer(customerName,email,phone,address,level);
        return customer;
    }
}
