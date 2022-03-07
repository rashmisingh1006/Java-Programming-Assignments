/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_demoraise2;

/**
 *
 * @author Rashmi Singh
 * Purpose : To create a method that calculate raise
 * Date : 12th Sept 2021
 * Version : 1.0
 */
public class Week3_demoraise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double salary = 200.00;
        System.out.println("Demonstrating some raises");
        System.out.println("The output is : " + prdictRaise(salary));
    }
    public static double prdictRaise(double salary)
    {
        double TotalAmount;
        final double RAISE = 1.10;
        TotalAmount = calBonus(salary * RAISE);
        return TotalAmount;
    }

    public static double calBonus(double newSalary) 
    {
      double TotalAmount;
      TotalAmount = newSalary + 100;
      return TotalAmount;
    }
}
