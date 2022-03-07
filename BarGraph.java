/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bargraph;
import java.util.Scanner;
/**
* @author Rashmi Singh
* Purpose : To display the car sold by each salesperson in form of Bar chart
* Date : 10th Oct 2021
* Version : 1.0
*/
public class BarGraph {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Pamsold, Leosold, Kimsold, Bobsold;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cars sold by Pam >> ");
        Pamsold = sc.nextInt();
        System.out.print("Enter cars sold by Leo >> ");
        Leosold = sc.nextInt();
        System.out.print("Enter cars sold by Kim >> ");
        Kimsold = sc.nextInt();
        System.out.print("Enter cars sold by Bob >> ");
        Bobsold = sc.nextInt();
        System.out.println(  );
        System.out.println("Car Sales For Month");
        System.out.println(  );
        drawGraph("Pam", Pamsold);
        drawGraph("Leo", Leosold);
        drawGraph("Kim", Kimsold);
        drawGraph("Bob", Bobsold);
    }
    private static void drawGraph(String salesperson, int sales)
    {     
        
        System.out.print(salesperson + " ");
        for (int i=0; i < sales; i++)
        {
            System.out.print("X");
        }
        
        System.out.print("\n");
    }
    
}
