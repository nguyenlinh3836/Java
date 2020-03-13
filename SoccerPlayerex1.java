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
public class SoccerPlayer {
    private String name;
    private int number;
    private int x;
    private int y;
    
    public SoccerPlayer(){
        name = "Ronaldo";
        number = 7;
        x = 120 ;
        y =80;
    }
   public int run() {       
        return x;    
    }
    public String kickball (){
        return name;
    }
    public int jump(){
        return y;
    }
    

}
