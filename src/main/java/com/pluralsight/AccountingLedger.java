package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class AccountingLedger {
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
                    System.out.println("Make Payment - Coming Soon");
                }
                case "L" -> {
                    System.out.println("Make Ledger - Coming Soon");
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
        System.out.println("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.println("Enter the time (HH-MM): ");
        String time = scanner.nextLine();

        System.out.println("Enter the description: ");
        String description = scanner.nextLine();

        System.out.println("Enter the vendor: ");
        String vendor = scanner.nextLine();

        System.out.println("Enter the amount: ");
        String amountStr = scanner.nextLine();
        double amount = Double.parseDouble(amountStr);

        System.out.println("Deposit recorded!");
    }
}