/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static java.lang.Integer.sum;
import static java.time.Clock.system;
import javax.swing.JOptionPane;

/**
 *
 * @author ericbeaudet
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Joffrey sucks");
//        System.out.println(" bollocks");
//        System.out.println("im eric");
//        System.out.println("alkjsdfhlakjs");
//        System.out.println(";laksdjf;lak");
//        
////        JOptionPane.showMessageDialog(null, "simon says jump");
////        String showInputDialog = JOptionPane.showInputDialog(null,"Simon Says Kill Justin?");
//        String gunType = JOptionPane.showInputDialog(null, "What type of gun would you like");
//        JOptionPane.showMessageDialog(null, gunType);
//        System.out.println("justin whyyyy:/");
//        
//        String gunType = JOptionPane.showConfirmDialog(null, "Purchase successfull, 1,000,000 dollars has been billed to your account shortly")
       
        
//       int sum = addTwoNumbers(17, 34); 
//        System.out.println("the real sum is " + sum);
////        
//       double sum = addTwoDoubles(20, 30);
//        System.out.println("the real sum is " + sum);
        
        int sum = divideIntegers(1234, 1234);
        System.out.println("the real sum is " + sum);
        
        System.out.println("the result is " + addTwoIntegers(57576, 649759875));
        System.out.println("The result is " + addTwoIntegers(0,   Integer.MAX_VALUE ));
        System.out.println("the result is " + divideIntegers(6, 2));
    }
    
    public static int addTwoNumbers(int number1, int number2){
        return  number1 + number2;
//        System.out.println("The result is " + result);
//        
//        
//        
//        public static double addTwoDoubles(double number1, double number2){
//        return  number1 + number2;
////        System.out.println("The result is " + result);
       
//        }       return 0;
//        System.out.println("The result is " + result);
//        
//        
//        
//        public static double addTwoDoubles(double number1, double number2){
//        return  number1 + number2;
////        System.out.println("The result is " + result);
       
        }
    
    
     public static int addTwoIntegers(int number1, int number2){
            return number1 * number2;
        }
     public static int divideIntegers(int number1, int number2);
             return number1 / number2;
}
    /*
    NOTE: All "Test Methods" should print the values and the result out to the screen.  Consider using a System.out.printf() statement (we will do one in class!) to 

1) As a class sized group, write a method called addThreeIntegers that:
  - accepts three integers as parameters;
  - adds the three numbers and returns the sum as an integer;

  Write a test method to call the addThreeIntegers method at least 3 times, with 3 different sets of numbers.  Use your calculator to validate that the number.

In pairs: write each of the following methods in paris: working together, write the method first on one computer, and then on the second.

2) As a pair, write a method called addTwoDoubles that:
  - accepts two doubles as parameters;
  - adds the two doubles and returns the sum as an double;

  Write a test method to call this method at least 3 times, with 3 different sets of numbers.  Use your calculator to validate that the result.

3) As a pair, write a method called addTwoIntegers that:
  - accepts two integers as parameters;
  - multiplies the two integers and returns the product as an integer;

  Write a test method to call this method at least 3 times, with 3 different sets of numbers.  Use your calculator to validate that the result.

You must also test this method with the following two pairs of numbers:
 0,   Integer.MAX_VALUE
 1,   Integer.MAX_VALUE

Did you notice anything about the results?  What could possible explain this? if you don’t know, do some research!

4) As a pair, write a method called divideIntegers that:
  - accepts two integers as parameters;
  - divides the two integers and returns the result as an integer;

  Write a test method to call this method at least 3 times, with 3 different sets of numbers.  Use your calculator to validate that the result.

You must also test this method with the following two pairs of numbers:
 10,  2
 11,  2

Did you notice anything about the results?  What could possible explain this? if you don’t know, do some research!

 
4) As a pair, write a method called divideDoubles that:
  - accepts two Doubles as parameters;
  - divides the two Doubles and returns the result as an Doubles;

  Write a test method to call this method at least 3 times, with 3 different sets of numbers.  Use your calculator to validate that the result.

You must also test this method with the following two pairs of numbers:
 10.0,  2.0
 11.0,  2.0

Did you notice anything about the results, particularly compared to the integer version of this method?  What could possible explain this? if you don’t know, do some research!
    */
    
}
