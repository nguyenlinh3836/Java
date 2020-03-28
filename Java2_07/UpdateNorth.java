package eBook;
import java.sql.*;
public class UpdateNorth {
    public static void main(String[] args) {
        UpdateNorth u1 = new UpdateNorth();
        u1.updateCategory();
        u1.updateProduct();
        u1.updateCustomer();
        u1.updateOrders();
    }
    public void updateCategory(){
        try(
                Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "") ;
                Statement stmt = conn.createStatement();
        ){
            /// Update Category
            String strUpdate = "update categories set CategoryName = 'SeaFood VN' where CategoryName = 'Seafood'";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
            /// Print to check
            String strSelect = "select * from categories where CategoryName = 'Seafood' ";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()) {
                System.out.println(rset.getInt("CategoryID") + ", "
                        + rset.getString("CategoryName"));
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void updateCustomer(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update customers set Address = '1A Yet Kieu - Ha Noi' where CustomerID = 'FRANK'";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
            String strSelect = "select * from customers where CustomerID = 'FRANK'";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("CustomerID") + ", "
                        + rset.getBigDecimal("Address"));
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void updateProduct() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update products set UnitPrice = UnitPrice*0.1 where ProductID IN (5,7,8)";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
            /// Print
            String strSelect = "select * from products where ProductID IN (5,7,8) ";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("ProductID") + ", "
                        + rset.getBigDecimal("UnitPrice"));
            }
        } catch(SQLException ex){
                ex.printStackTrace();
        }
    }
    public void updateOrders(){
        try (
                Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
                ){
            String strUpdate = "update orders set ShipVia = 3 where OrderID = 10313 ";
            /// Print
            String strSelect = "select * from orders where id = 10313 ";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("OrderID") + ", "
                        + rset.getBigDecimal("ShipVia"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
