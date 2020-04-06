package Java2_08.Model;

import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String author;
    private int qty;
    private double price;

    public Book() {
    }

    public Book(String name,double price , int qty, String author) {
       this.price = price;
       this.name = name;
       this.qty = qty;
       this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book ID: ");
        this.id = in.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setQty() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book Qty: ");
        this.qty = in.nextInt();
    }

    public int getQty() {
        return qty;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book author name : ");
        this.author = in.nextLine();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Book Price: ");
        this.price = in.nextDouble();
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", qty=" + qty +
                '}';
    }
}
