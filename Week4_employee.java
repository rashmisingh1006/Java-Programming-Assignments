/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4_employee;

/*
 * @author Rashmi Singh
 * Purpose : Week4 Class Example
 * Date : 20th Sept 2021
 * Version : 1.0
 */
public class Week4_employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setEmpNum(1234);
        e1.setEmpLastName("Smith");
        e1.setEmpFirstName("John");
        e1.setEmpSalary(75000);
        e2.setEmpNum(5678);
        e2.setEmpLastName("Johnson");
        e2.setEmpFirstName("Sarah");
        e2.setEmpSalary(120000);
        System.out.println("The output of my objects are -- ");
        System.out.println(e1.getEmpNum() + " " + e1.getEmpLastName() + " " + e1.getEmpFirstName() + " " +
                e1.getEmpSalary());
        System.out.println(e2.getEmpNum() + " " + e2.getEmpLastName() + " " + e2.getEmpFirstName() + " " +
                e2.getEmpSalary());
        
// TODO e2.code application logic here
    }
    
}
