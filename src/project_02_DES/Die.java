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
public class Die {
    private int sides;
    private int value;
    
    public Die(){
        sides = 6;        
    }
    
    public Die(int sides){
       this.sides = sides; 
    }
        
    public void roll(){        
        value = (int)(Math.random() * sides);        
    }    
   
    public int getValue(){
        return value;
    }      
}

    

