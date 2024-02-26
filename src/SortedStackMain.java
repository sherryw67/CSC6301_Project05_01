/**
 * Project: Sorted Stack Handler
 * Author: William Sherry
 * Date: 17 Feb, 2024
 * Version: 2.0
 * Description:
 * The {@code SortedStackMain} class serves as entry point to application.
 * Using {@code SortedStackHandler} for reading, sorting, and printing--
 * This will handle a series of integers from the user provided keyboard input.
 * Will put integers into a stack and sort in ascending order (small to big).
 * 
 */

public class SortedStackMain {

    /**
     * The main method will initiate the process of reading from console,
     * sort them in a stack, then print the sorted stack back to console.
     */

    public static void main(String[] args) {
        SortedStackHandler handler = new SortedStackHandler();
        handler.readNumbers();
        handler.printNumbers();
    }

}