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
                    System.out.println("Make Deposit - Coming Soon");
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
            }

        }
    }
}
