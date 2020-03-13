/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Product {
    private int id;
    private double price;
    private String name;
    private int qty;
    private String description;
    public Product(int id , double price,String name, int qty, String description){
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.description = description;
        this.price = price;
    }
    public Product(int id,double price,String name){
        this.id =id;
        this.price = price;
        this.name = name;        
    }
    public Product(int id, String name,String decription){
        this.id = id;
        this.name = name;
        this.description = decription;        
    }
    
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double newprice){
        this.price = newprice;        
    }
    
    
    

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + ", name=" + name + ", qty=" + qty + ", description=" + description + '}';
    }
       
}
