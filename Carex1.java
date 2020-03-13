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
public class Car {
    private int plateNumber;
    private int x,y;
    private double speed;
    
    public double move(){
        return speed;
    }
    public int park(){
        return x & y;
    }
    public double accelerate(){
        return plateNumber;
    }
}
