/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_demoraise1;

/**
 *
 * @author Rashmi Singh
 * Purpose : To create a method that calculate raise
 * Date : 12th Sept 2021
 * Version : 1.0
 */
public class Week3_DemoRaise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salary = 200.00;
        double startingWage = 800.00;
        System.out.println("Demonstrating some raises");
        predictRaise(salary);
        predictRaise(startingWage);
    }

   public static void predictRaise(double sal) 
   {
     double newSalary;
     final double RAISE = 1.10;
     newSalary = sal * RAISE;
     System.out.println("Current Salary:" + sal + " After raise:" +
            newSalary); 
   }
    
}
