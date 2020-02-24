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
public class ElectricLamp {
    private boolean status;
    public ElectricLamp(boolean status){
        this.status = status;
    }
    public void turnOff(){
     status = false ;
}
    public void turnOn(){
        status = true;
    }
    
}
