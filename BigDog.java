/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class BigDog extends Animal{
	@Override
   public void greeting() {
      System.out.println("Woow!");
   }
   
   public void greeting(Dog another) {
      System.out.println("Woooooowwwww!");
   }
}
