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
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;
    
    public void connectToLamp(){        
            this.lamp = lamp;                
    }
    public void switchOn(){
        if (status == true){
            lamp.turnOn();
        }
        
        }
        public void switchOff(){
            if (status == false){
             lamp.turnOff();            
        }
    }  
    
}

