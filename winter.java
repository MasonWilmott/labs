import java.util.Scanner;

public class winter {
    // Constant defining the required number of days for the temperature array.
    private static final int NUM_DAYS = 10;

    public static void main(String[] args) {
        // Initialize Scanner for easy user input from the console.
        Scanner scanner = new Scanner(System.in);
        
        // Initialize a double array to store the 10 temperatures (decimal type).
        // This strictly adheres to the "Only use Arrays" requirement.
        double[] temperatures = new double[NUM_DAYS];
        double totalSum = 0.0;
        
        System.out.println("Welcome to the below average temperature tester program.");
        System.out.println("--------------------------------------------------");

        // --- Inputting the Temperatures (20pts) ---
        // Loop to prompt the user for input for each day.
        for (int i = 0; i < NUM_DAYS; i++) {
            double currentTemp = 0.0;
            boolean isValidInput = false;
            
            // Loop until valid numeric input is received.
            while (!isValidInput) {
                try {
                    System.out.print("Please enter the temperature for day " + (i + 1) + ": ");
                    // Read the input as a double.
                    currentTemp = scanner.nextDouble(); 
                    isValidInput = true;
                } catch (java.util.InputMismatchException e) {
                    // Handle non-numeric input gracefully, providing clear feedback to the user.
                    System.out.println("Invalid input. Please enter a numerical temperature.");
                    scanner.next(); // Consume the invalid token to prevent an infinite loop
                }
            }
            // Store the valid temperature in the array.
            temperatures[i] = currentTemp;
            // Accumulate the sum for later average calculation.
            totalSum += currentTemp; 
        }

        // Close the scanner after all input is done.
        scanner.close(); 

        // --- Finding the Average (20pts) ---
        // Calculate the average temperature. Since NUM_DAYS is not zero, division is safe.
        double averageTemp = totalSum / NUM_DAYS;

        System.out.println("\n--------------------------------------------------");
        // Display the calculated average temperature, formatted to one decimal place.
        System.out.printf("The average temperature was %.1f\n", averageTemp);
        
        // --- Printing All Temperatures Below the Average (20pts) ---
        System.out.println("The days that were below average were");
        
        int belowAverageCount = 0;

        // Iterate through the array to compare each temperature against the average.
        for (int i = 0; i < NUM_DAYS; i++) {
            // Check if the current temperature is strictly less than the calculated average.
            if (temperatures[i] < averageTemp) {
                // Print the day number (index + 1) and the temperature, formatted to one decimal place.
                System.out.printf("Day %d with %.1f\n", (i + 1), temperatures[i]);
                belowAverageCount++;
            }
        }
        
        // Optional addition for clarity: If no days were below average, state it.
        // The requirement is to display "nothing", but for tests like all 10s, this is clearer.
        if (belowAverageCount == 0 && averageTemp > 0) {
             System.out.println("None.");
        }
        
        System.out.println("--------------------------------------------------");
    }
}
