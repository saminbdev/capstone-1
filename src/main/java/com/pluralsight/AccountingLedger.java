package com.pluralsight;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountingLedger {
    private static List<String> transactions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String menuList = """
                Home Screen:
                Pick the letter choice that represents what you need to do.
                D) Add Deposit
                P) Make Payment (Debit)
                L) Ledger
                X) Exit
                Enter your command:
                """;

        boolean homeSet = true;
        while (homeSet) {
            System.out.println(menuList);
            String userInput = scanner.nextLine().toUpperCase();

            switch (userInput) {
                case "D" -> {
                    addDeposit(scanner);
                }
                case "P" -> {
                    makePayment(scanner);
                }
                case "L" -> {
                    System.out.println("Ledger");
                    if (transactions.isEmpty()) {
                        System.out.println("No transactions yet.");
                    } else {
                        for (String i : transactions) {
                            System.out.println(i);
                        }
                    }
                    System.out.println("All done.");
                }
                case "X" -> {
                    System.out.println("Thank you and come again!");
                    homeSet = false;
                }
                default -> {
                    System.out.println("Sorry the letter you typed is not found in the system.Please try again!");

                }

            }
        }
    }

    public static void addDeposit(Scanner scanner) {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter the time (HH-MM): ");
        String time = scanner.nextLine();

        System.out.print("Enter the description: ");
        String description = scanner.nextLine();

        System.out.print("Enter the vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Enter the amount: ");
        String amountStr = scanner.nextLine();
        double amount = Double.parseDouble(amountStr);

        System.out.println("Deposit recorded!");
        String line = date + "|" + time + "|" + description + "|" + vendor + "|" + amount;
        transactions.add(line);
    }

    public static void makePayment(Scanner scanner) {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter the time (HH-MM:SS): ");
        String time = scanner.nextLine();

        System.out.print("Enter the description: ");
        String description = scanner.nextLine();

        System.out.print("Enter the vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Enter the amount: ");
        String amountStr = scanner.nextLine();
        double amount = Double.parseDouble(amountStr) * -1;

        System.out.println("Payment recorded!");
        String line = date + "|" + time + "|" + description + "|" + vendor + "|" + amount;
        transactions.add(line);
    }
}



