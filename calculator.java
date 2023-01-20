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
        boolean loop = false;
        Scanner input = new Scanner(System.in);
        double numOne, numTwo;
        while(!loop)
        {
            System.out.println("Calculator without GUI:");
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
                    numOne = input.nextDouble();
                    input.nextLine();
                    System.out.println("Number Two: ");
                    numTwo = input.nextDouble();
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
                case 3:
                break;
                case 4:
                break;
                case 5:
                    loop = true;
                break;
            }
        }
    }

    private static double add(double numOne, double numTwo)
    {
        double sum = numOne + numTwo;
        return sum;
    }

    private static double subtract(double numOne, double numTwo)
    {
        double sum = numOne - numTwo;
        return sum;
    }
}