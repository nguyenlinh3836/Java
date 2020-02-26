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
public class Account {
    private String id;
    private String name;
    private int balance;
    public  Account(String id, String name){
        
    }
    
    public Account(String id, String name,int balance){
        this.id =id;
        this.name = name;
        this.balance = balance;
        
    }
    
    public  String getID(){
        return id;
    }
    
    public  String getName(){
        return name;
    }
    
    public  int getBalance(){
        return balance;
    }
    
    public int credit(int amount){
        this.balance = amount;
        return balance;
    }
    
    public int debit(int amount){
        if (amount <= balance) {
            balance = balance - amount;
        }else
        {
            System.out.println("Amount Exceeded blance");
        }
        return balance;
    }
    
    public  void transFerTo(Account another, int amount){
        if( amount <= balance){
            debit(amount);
            another.credit(amount);
            System.out.println(" tranfer success "+ another.getBalance());                  
        } else {
            System.out.println("Amount Exceeded blance");
        }         
    }
    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
    
    
}
