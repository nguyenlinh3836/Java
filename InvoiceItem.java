/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol1;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class InvoiceItem {
    private int id;
    private int qty;
    private String desc;
    private double unitPrice;

    public InvoiceItem() {
    }   
    public int getID(){
        return id;
    }
    public int getQty(){
        return qty;
    }
    public String getDesc(){
        return desc;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" + "id=" + id + ", qty=" + qty + ", desc=" + desc + ", unitPrice=" + unitPrice + '}';
    }
    
  
}
