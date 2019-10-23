/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_02_DES;

/**
 *
 * @author deepika
 */
public class PairOfDice {

    private Die die1;
    private Die die2;
    private int sum;
   

//To change body of generated methods, choose Tools | Templates.
    public PairOfDice(){
        this.die1 = new Die();
        this.die2 = new Die();
    }
     
    public PairOfDice(int sides){
        this.die1 = new Die(sides);
        this.die2 = new Die(sides);
    }
    
    public void roll(){
        this.die1.roll();
        this.die2.roll();
        
    }
    public int getValue1(){
        return die1.getValue();
       
    }
    public int getValue2(){
        return die2.getValue();
    }
    public int getSum(){
        return die1.getValue() + die2.getValue();
    }
    
}
