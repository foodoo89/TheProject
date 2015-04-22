/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

/**
 *
 * @author 041406846
 */
public class Assignment1 {
    final static double inci_const = 2.54;      // constant variable using for inci converter formula
    final static double feet_const = 0.3048;    // constant variable using for feet converter formula
    final static double kilogram_const = 0.453592; // constant variable using for pound converter formula
    
    public static void main(String[] args){
        int choice = 0;
        Scanner sc = new Scanner(System.in);                                    // initializing Scanner object to read input from keyboard
        do {                                                                    // looping for repeating the process
            System.out.println("This is measurements converting program");      // Some program instructions 
            System.out.println("Please select the option");
            System.out.println("1. Convert from cm to inch");
            System.out.println("2. Convert from m to feet");
            System.out.println("3. Convert from Pound to Kilogram");
            System.out.println("4. Exit program");
            
            choice = sc.nextInt();                                              //read input from keyboard
            
            if(choice == 1){                                                    // this IF statement executes if input value is 1;                                           
                System.out.println("Input the value in cm"); 
                double cm = sc.nextDouble();                                    //read input for cm value from keyboard
                double output = cm / inci_const;                                //formula for converting cm to inci
                System.out.println("the converted value "                       // display the result in inch
                        + "is "+round(output,2)+" inci");
                System.out.println("--------------------------------------");   // it is only seperator
            } else if(choice == 2){                                             // this IF statement executes if input value is 2; 
                System.out.println("Input the value in metres");
                double m = sc.nextDouble();                                     //read input for metre value from keyboard
                double output = m / inci_const;                                 //formula for converting metre to feet
                System.out.println("the converted value "                       // display the result in feet
                        + "is "+round(output,2)+" feet3");
                System.out.println("--------------------------------------");   // it is only seperator
            } else if(choice == 3){                                             // this IF statement executes if input value is 3
                System.out.println("Input the value in pounds");
                double pound = sc.nextDouble();                                 // get the value of pound from the user
                double output = pound * kilogram_const;                         // formula for converting pound to kg
                System.out.println("The converted value " + "is "+round(output,2// display the result in kilograms
                        )+" kilograms.");
                System.out.println("--------------------------------------");   // it is only seperator
            } else if(choice == 4){
                System.out.println("Program terminates");       
                System.exit(0);                                                 //to terminate whole process
            }  else {                                                           //this IF statement executes if input value is not 1, 2, 3 or 4
            }
        } while (choice != 4);                                                  // condition to run looping
    }
    
    public static double round(double value, int places) { // for rounding into two digits after decimals
        if (places < 0) 
            throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }  
}
