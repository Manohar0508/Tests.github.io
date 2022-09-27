package ScreeningTest;

import java.util.Scanner;

public class Program_1 {
	public static void main(String[] args) {

	    char operator;
	    Double number1, number2, result;
	    
	    Scanner input = new Scanner(System.in);

	    // operators
	    System.out.println("Choose an operator: +, -, *, /");
	    operator = input.next().charAt(0);

	    // enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) {

	      // Addition :
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // Subtraction :
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // Multiplication :
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // Division :
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }
}

/* Outputs Of the Program :
 
 
 
 (1) Addition :
 
	Choose an operator: +, -, *, /
	+
	Enter first number
	3
	Enter second number
	4
	3.0 + 4.0 = 7.0
 
 
 (2) Subtraction :
 
	Choose an operator: +, -, *, /
	-
	Enter first number
	5
	Enter second number
	4
	5.0 - 4.0 = 1.0
 
 
 (3) Multiplication :

	Choose an operator: +, -, *, /
	*
	Enter first number
	4
	Enter second number
	3
	4.0 * 3.0 = 12.0
 
 
 (4) Division :
 
	Choose an operator: +, -, *, /
	/
	Enter first number
	5
	Enter second number
	2
	5.0 / 2.0 = 2.5


 // Invalid Operator :
 
	Choose an operator: +, -, *, /
	1
	Enter first number
	3
	Enter second number
	4
	Invalid operator!

 
 */
