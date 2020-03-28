package giftmodel;

public class Gift {
private  int id;
private String name;
private float price;
private int qty;

public Gift(int id ,String name,float price, int qty){
    this.id = id;
    this.name = name;
    this.price = price;
    this.qty = qty;
}
public Gift(){

}
public int getID(){
    return id;
}
public String getName(){
    return name;
}
public float getPrice() {
    return price;
}
public int getQty() {
        return qty;
}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
