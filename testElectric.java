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
public class testElectric {
    public static void main(String[] args) {    
      ElectricLamp l = new ElectricLamp(true);
      SwitchButton s = new SwitchButton();   
      s.connectToLamp();
      
        
    }
}
