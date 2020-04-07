package ADFII;

import javax.print.attribute.standard.MediaSize;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecord {
    ArrayList<Student> StudentRecordList = new ArrayList<Student>();
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> StudentRecordList = new ArrayList<Student>();
        Scanner in = new Scanner(System.in);
        StudentRecord sr1 = new StudentRecord();
        Student s1 = new Student();
        int n;
        do {
            System.out.print("Enter 1: Add Student record\n" +
                    "Enter 2: Display student record\n" +
                    "Enter 3: Save\n" +
                    "Enter 4: Exit\n" +
                    "Enter: ");
            n = in.nextInt();
        } while (n<0 || n >4);
        switch (n){
            case 1: sr1.addRecord(s1);
            break;
            case 2:sr1.displayRecord();
            break;
            case 3:
                sr1.saveRecord(StudentRecordList);
                break;
            case 4: break;
        }

    }
    public void addRecord(Student student){
        System.out.println("Input amount want to add:");
        int n = in.nextInt();
        for (int i = 0; i < n;i++){
            System.out.println("Please input student id:" +(i+1));
            int id = in.nextInt();
            in.nextLine();
            System.out.println("Please input student name:"+(i+1));
            String name = in.nextLine();
            System.out.println("Please input student address:"+(i+1));
            String add = in.nextLine();
            System.out.println("Please input student phone:"+(i+1));
            String phone = in.nextLine();
            student.setId(id);
            student.setPhone(phone);
            student.setAddress(add);
            student.setName(name);
            StudentRecordList.add(student);
            System.out.println("List student" + StudentRecordList);
        }

    }
    public void displayRecord(){
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
            Statement stmt = conn.createStatement();
        ){
            ResultSet rset = stmt.executeQuery("select * from student");
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
                    // getString() can be used for all column types
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void saveRecord(ArrayList<Student>list){
    try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
            "root", "");
         PreparedStatement pstmt = conn.prepareStatement("insert into student values(?,?,?,?)");
         PreparedStatement pstmtSelect = conn.prepareStatement("select * from student");
            ){
        for(int i =0 ; i<list.size();i++){
            pstmt.setInt(1,list.get(i).getId());
            pstmt.setString(2,list.get(i).getName());
            pstmt.setString(3,list.get(i).getAddress());
            pstmt.setString(4,list.get(i).getPhone());
        }
        int rowsInserted = pstmt.executeUpdate();
        System.out.println(rowsInserted + "rows affected.");
        ResultSet rset = pstmtSelect.executeQuery();
        while(rset.next()) {
            System.out.println(rset.getInt("Studentid") + ", "
                    + rset.getString("StudentName") + ", "
                    + rset.getString("Address") + ", "
                    + rset.getDouble("Phone"));
        }
    } catch(Exception ex){
        ex.printStackTrace();
    }
    }
}
