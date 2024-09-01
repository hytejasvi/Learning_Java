package Sample_Projects.Bank_Account_Management_System;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Welcome to Our Bank!"); // Welcome message
        System.out.println("Enter the following details to create an account");

        try (Scanner scanner = new Scanner(System.in)) {
            // Capture the user's name and initial deposit to create an account
            System.out.print("Enter your name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter the initial amount (should be greater than 5000): ");
            double amount = scanner.nextDouble();

            // Create a SavingsAccount object
            SavingsAccount sb = new SavingsAccount(customerName, amount);

            // Loop to keep the program running until the user chooses to exit
            while (true) {
                System.out.println("\nEnter the desired option:");
                System.out.println("1. Deposit money");
                System.out.println("2. Withdraw money");
                System.out.println("3. Check balance");
                System.out.println("4. Check Account Details");
                System.out.println("5. Exit");

                // User selects an option
                int input = scanner.nextInt();
                userSelection(input, sb);

                // Break out of the loop if the user chooses to exit
                if (input == 5) break;

                // Ask the user if they want to continue or exit
                System.out.print("Do you want to continue? (y/n): ");
                String option = scanner.next();
                if (option.equalsIgnoreCase("n")) {
                    System.out.println("Thank you for using Our Bank services. Goodbye!");
                    break;
                }
            }
        } catch (MinimumDepositeException | NegetivebalanceException | InvalidTransactionException e) {
            // Handle custom exceptions
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
        // Scanner resource is automatically closed by try-with-resources
    }

    // Method to handle the user's selected option
    private static void userSelection(int input, SavingsAccount sb) throws InvalidTransactionException, NegetivebalanceException {
        Scanner sc = new Scanner(System.in);

        // Switch statement to handle different operations based on user input
        switch (input) {
            case 1:
                System.out.print("Enter the amount to be deposited: ");
                double depositAmount = sc.nextDouble();
                sb.deposit(depositAmount); // Call deposit method
                break;
            case 2:
                System.out.print("Enter the amount to be withdrawn: ");
                double withdrawAmount = sc.nextDouble();
                sb.withdraw(withdrawAmount); // Call withdraw method
                break;
            case 3:
                // Display current balance
                System.out.println("Your current balance is: " + sb.checkBalance());
                break;
            case 4:
                // Display account details
                sb.displayAccountDetails();
                break;
            case 5:
                // Exit message
                System.out.println("Thank you for using Our Bank services. Goodbye!");
                break;
            default:
                // Handle invalid input
                System.out.println("Invalid option. Please try again.");
        }
    }
}
