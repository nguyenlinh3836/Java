/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Temperature {
    private double cTemp;
    
    public Temperature(double c){
        cTemp = c ;
    }
    public double getCTemp(){
        return cTemp;
    }
    public void setCTemp(double c){
        this.cTemp = c;
    }
    public double getFTemp(){
        return (cTemp * 1.8) + 32 ;
    }
    public double getKTeamp(){
        return cTemp + 273;
        
    }

    @Override
    public String toString() {
        return "Temperature{" + "cTemp=" + cTemp + '}';
    }
    
}
