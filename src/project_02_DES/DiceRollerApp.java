/*
Name: Deepika Shrestha
Project Name: cis3145_DiceRoll_Project2
Date: 3/11/2018
Description: Dice Rolling Project
 */
package project_02_DES;

import java.util.Scanner;
/**
 *
 * @author deepika
 */
public class DiceRollerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Paradise Roller");
        System.out.println();        
        Scanner sc = new Scanner(System.in);    
        
        System.out.print("Roll the dice? (y/n): ");
        String choice = sc.nextLine();
        
        PairOfDice dices = new PairOfDice();
        int count = 1;
        while(choice.equalsIgnoreCase("y")){
             dices.roll();
             System.out.println("Roll " + count++ + ": " + dices.getValue1() + " & " + dices.getValue2());
             
             if(dices.getSum() == 7){
                 System.out.println("Craps!");
             }else if(dices.getValue1() == 1 && dices.getValue2() == 1){
                 System.out.println("Snake eyes!");
             }else if(dices.getValue1() == 6 && dices.getValue2() == 6){
                 System.out.println("Box cars!");
             }
             System.out.print("Roll again? (y/n): ");     
             choice = sc.nextLine();        
        } 
    }
}
