/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babynamecomparison;

import java.util.Scanner;
/**
 *
 * @author Rashmi Singh
 * Purpose : To find the every possible two name combination
 * Date : 10th Oct 2021
 * Version : 1.0
 */
public class BabyNameComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String name1;
        Scanner input = new Scanner(System.in);
        String[] name = new String[3];
        System.out.print("Enter the first name. ");
        name[0] = input.nextLine();
        System.out.print("Enter the second name. ");
        name[1] = input.nextLine();
        System.out.print("Enter the third name. ");
        name[2] = input.nextLine();
        
        System.out.println("The Possible Combinations are as below.");
        int i = 0;
        while(i < 3)
       {
            name1 = name[i];
            i++;
            
            for (int j=0; j<3; j++)
            {  
                if (!name1.equals(name[j]))
                {
                System.out.println(name1 + name[j]);
                }
            }
        }
    }
}    
            
    
    

