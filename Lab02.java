
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab02 {


    public static void drawTriangle(int size) {
        // It iterates from 1 up to and including the 'size'.
        for (int i = 1; i <= size; i++) {
            // Inner loop to print the correct number of asterisks for the current row.
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing the asterisks.
        }

       
        // It starts from one less than 'size' and goes down to 1.
        for (int i = size - 1; i > 0; i--) {
           
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Triangle Maker! Enter the size of the triangle.");

        try {
            
            int size = scanner.nextInt();

           
            if (size <= 0) {
                System.out.println("Error: The size must be a positive, whole number.");
                System.exit(1); 
            }

          
            drawTriangle(size);

        } catch (InputMismatchException e) {
           
            System.out.println("Error: The size must be a whole number.");
            System.exit(1); 
        } finally {
            scanner.close(); 
        }

        System.out.println("\nDONE!");
    }
}
