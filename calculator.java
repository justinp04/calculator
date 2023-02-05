/*
PROGRAM: calculator.java
AUTHOR: Justin Pan 
DATE: 3/1/2023
PURPOSE: To create a functioning calculator with a user interface.
*/

import java.util.*;

public class calculator
{
    public static void main(String[] args)
    {
        boolean loop = false; //Required to ensure that the user stays in the menu unless they wish to exit. 
        Scanner input = new Scanner(System.in);
        double numOne, numTwo;

        while(!loop)
        {
            //Menu including 
            System.out.println("\nCalculator without GUI:");
            System.out.println("Selecton from the following: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplicaiton");
            System.out.println("4. Division");
            System.out.println("5. Leave program");

            int selection = input.nextInt();
            input.nextLine();

            switch(selection)
            {
                case 1: //Addition
                    System.out.println("Number one:");
                    numOne = input.nextDouble(); //Retrieves the first number 
                    input.nextLine();
                    System.out.println("Number Two: ");
                    numTwo = input.nextDouble(); //Retrives the second number the user wishes to add to the first number
                    input.nextLine();

                    double sum = add(numOne, numTwo); 

                    System.out.println(sum);
                break;
                case 2: //Subtraction
                    System.out.println("Number one:");
                    numOne = input.nextDouble();
                    input.nextLine();
                    System.out.println("Number Two: ");
                    numTwo = input.nextDouble();
                    input.nextLine();

                    double finalNum = subtract(numOne, numTwo);

                    System.out.println(finalNum);
                break;
                case 3: //multiplicaiton
                    System.out.println("Number one:");
                    numOne = input.nextDouble();
                    input.nextLine();
                    System.out.println("Number Two: ");
                    numTwo = input.nextDouble();
                    input.nextLine();

                    double product = multiply(numOne, numTwo);

                    System.out.println("The product of your two numbers is: " + product);
                break;
                case 4: //division
                    System.out.println("Numerator:");
                    double numerator = input.nextDouble();
                    input.nextLine();
                    System.out.println("Denominator: ");
                    double denominator = input.nextDouble();
                    input.nextLine();

                    double divFinal = divide(numerator, denominator);

                break;
                case 5:
                    loop = true;
                break;
            }
        }
    }

    private static double add(double numOne, double numTwo)
    {//Adds the first number and the second number, returning the sum of the two numbers
        double sum = numOne + numTwo;
        return sum;
    }

    private static double subtract(double numOne, double numTwo)
    {//Subtracts the second number from the first number, returning the sum. 
        double sum = numOne - numTwo;
        return sum;
    }

    private static double multiply(double numOne, double numTwo)
    {//Multiplies the first number by the second number, returning the product 
        double product = numOne*numTwo;
        return product;
    }

    private static double divide(double pNumerator, double pDenominator)
    {//Divides the numerator by the denominator, returning the final number. 
        double finalNum = pNumerator/pDenominator;
        return finalNum;
    }
}