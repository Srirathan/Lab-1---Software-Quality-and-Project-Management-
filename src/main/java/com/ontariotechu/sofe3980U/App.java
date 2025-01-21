package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Main program: Entry point of the program. Displays the local time, allows user interaction,
 * and performs binary operations.
 */
public class App {
    /**
     * Main program: The entry point of the program.
     *
     * @param args: not used
     */
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the first binary number
        System.out.print("Enter the first binary number: ");
        String binary1Input = scanner.nextLine();
        Binary binary1 = new Binary(binary1Input);

        // Prompt user to input the second binary number
        System.out.print("Enter the second binary number: ");
        String binary2Input = scanner.nextLine();
        Binary binary2 = new Binary(binary2Input);

        System.out.println("\nFirst binary number is: " + binary1.getValue());
        System.out.println("Second binary number is: " + binary2.getValue());

        // Display menu options
        System.out.println("\nChoose an operation to perform:");
        System.out.println("1. Add");
        System.out.println("2. OR");
        System.out.println("3. AND");
        System.out.println("4. Multiply");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Perform the selected operation
        Binary result = null;
        switch (choice) {
            case 1:
                result = Binary.add(binary1, binary2);
                System.out.println("Result of addition: " + result.getValue());
                break;
            case 2:
                result = Binary.OR(binary1, binary2);
                System.out.println("Result of OR operation: " + result.getValue());
                break;
            case 3:
                result = Binary.AND(binary1, binary2);
                System.out.println("Result of AND operation: " + result.getValue());
                break;
            case 4:
                result = Binary.Multiply(binary1, binary2);
                System.out.println("Result of multiplication: " + result.getValue());
                break;
            default:
                System.out.println("Invalid choice! Please run the program again.");
        }

        scanner.close();
    }
}
