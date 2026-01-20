/*****************************************************
 * Created by: Avit Dharmeche
 * Overview: Simple two input arithmetic calculator.
******************************************************/

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        runCalculator(); 
    }

    // Runs a simple two input arithmetic calculator that asks the user to select operation/ enter inputs and passes them onto the correct methods to obtain a result
    // 
    public static void runCalculator () {
        
        boolean run = true;
        String user_response = "";
        double calculation_result = 0.0;
        String input1 = "";
        String input2 = "";

        while (run) {
            user_response = inputString("Which operation would you like to perform a calculation on? Enter: (+) Addition (-) Subtraction (*) Multiplication (/) Division or (E) Exit");

            while (!user_response.equals("+") && !user_response.equals("-") && !user_response.equals("*") && !user_response.equals("/") && !user_response.equals("E")) {
                user_response = inputString("Which operation would you like to perform a calculation on? Enter: (+) Addition (-) Subtraction (*) Multiplication (/) Division or (E) Exit");
            }
            

           if (user_response.equals("+") || user_response.equals("-") || user_response.equals("*") || user_response.equals("/") ) {
                input1 = inputString("Please enter your first input (Can be integer or double): ");

                input2 = inputString("Please enter your second input (Can be integer or double): ");
           }
           else if (user_response.equals("E")) {
                run = false;
           }

           if (user_response.equals("+"))
            calculation_result = performAddition(input1, input2);
           else if (user_response.equals("-"))   
            calculation_result = performSubtraction(input1, input2);
           else if (user_response.equals("*"))
            calculation_result = performMultiplication(input1, input2);
           else if (user_response.equals("/"))
            calculation_result = performDivision(input1, input2);

           if (user_response.equals("E")) {
           System.out.println("You have chosen to exit the calculator.");
           }
           else {
            System.out.println("Your calculated result is: " + calculation_result);
           }

        }

        return;
    } // END runCalculator

    // Performs addition between two inputs (Parsed into the Double type)
    //
    public static double performAddition (String input1, String input2) {
        double first = Double.parseDouble(input1);
        double second = Double.parseDouble(input2);

        return first + second;
    } // END performAddition

    // Performs subtraction between two inputs (Parsed into the Double type)
    //
    public static double performSubtraction (String input1, String input2) {
        double first = Double.parseDouble(input1);
        double second = Double.parseDouble(input2);

        return first - second;
    } // END performSubtraction

    // Performs multiplication between two inputs (Parsed into the Double type)
    //
    public static double performMultiplication (String input1, String input2) {
        double first = Double.parseDouble(input1);
        double second = Double.parseDouble(input2);

        return first * second;
    } // performMultiplication

    // Performs division between two inputs (Parsed into the Double type)
    //
    public static double performDivision (String input1, String input2) {
        double first = Double.parseDouble(input1);
        double second = Double.parseDouble(input2);

        return first / second;
    } // performDivision

    // Allows the user to input a string after printing a given message
    //
    public static String inputString (String message) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        String input = scanner.nextLine();

        return input;
    } // END inputString
    
} // END class Calculator
