import java.util.Scanner;
import java.util.Stack;

/**
 * Project: Sorted Stack Handler (CSC6301 Project 05)
 * Author: William Sherry
 * Date: Due 17 Feb, 2024
 * Version 2.0
 * 
 * Description:
 * The {@code SortedStackHandler} class encapsulates function for reading
 * a series of values from the user, sorts them in a stack in ascending order..
 * This will then print the sorted stack to console.
 * 
 */

 public class SortedStackHandler {

    private Stack<Integer> numbers = new Stack<>();

    /**
     * This will read integers from console/user input -- until the user
     * enters 'done'. Integers that were added to the Stack will be sorted
     * in ascending order.. Invalid inputs will reprompt the user to try again.
     */

    public void readNumbers(){
        System.out.println("Please enter integers -- type 'done' to exit: ");
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String input = scanner.next();
            if ("done".equalsIgnoreCase(input)){
                break; //Will exit the loop when user enters 'done'...
            }

            try{
                int number = Integer.parseInt(input);
                insertSorted(number); //Will insert valid integers into stack
            } catch (NumberFormatException e){
                System.out.println("Please enter a valid integer, or type 'done'");
            }
        }
    }

    /**
     * Inserts a number into the stack -- will maintain order.
     * 
     * {@param} number The int to insert..
     */

    private void insertSorted(int number){
        Stack<Integer> tempStack = new Stack<>(); //moves element great than 'number' to temp stack
        while (!numbers.isEmpty() && numbers.peek() > number) {
            tempStack.push(numbers.pop());
        }
        numbers.push(number);
        while (!tempStack.isEmpty()){
            numbers.push(tempStack.pop());
        }
    }

    /**
     * Prints the sorted stack of ints.. When stack is printed it will empty..
     */

     public void printNumbers() {
        System.out.println("Sorted Numbers are as follows: ");
        while (!numbers.isEmpty()){
            System.out.println(numbers.pop());
        }
     }
    
 }