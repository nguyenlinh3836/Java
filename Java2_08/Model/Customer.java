package Java2_08.Model;

import java.util.Scanner;

public class Customer {
    private int id;
    private String name;
    private String adress;
    private String email;
    private String phone;
    private int level;
    public Customer(String name , String adress , String email, String phone,int level){
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
        this.level = level;
    }
    public Customer(){

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
    public void setId() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        this.id = in.nextInt();
    }
    public void setAdress() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        this.adress = in.nextLine();
    }

    public void setEmail() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        this.email = in.nextLine();
    }

    public void setPhone() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        this.phone = in.nextLine();
    }

    public void setLevel() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        this.level= in.nextInt();
    }


}
