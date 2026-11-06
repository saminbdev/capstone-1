# Accounting Ledger

A command line application for managing financial transactions.

## Features
- Add deposits
- Make payments
- View transaction ledger
- Save transactions to a CSV file
- Load saved transactions when the app starts

## How to Run
1. Open the project in IntelliJ IDEA.
2. Click on the AccountingLedger class.
3. Select Run AccountingLedger.main().

## Menu
- D) Add Deposit
- P) Make Payment (Debit)
- L) Ledger
- X) Exit

When adding a deposit or payment, the app asks for the date, time, description, vendor, and amount. Payments are saved as negative numbers.

## Data Storage
Transactions are stored in a file named transactions.csv in the project root directory. Each part is separated by `|`:

```
2026-11-03|07:28:30|ATM WITHDRAWAL|Chase Bank|-40.00
2025-10-31|07:00:00|Payroll|Camarillo|1000.00
```

## Code I'm Proud Of

### The menu
This is how the home screen handles the letter the user types:

```java
String userInput = scanner.nextLine().trim().toUpperCase();

switch (userInput) {
    case "D" -> addDeposit(scanner);
    case "P" -> makePayment(scanner);
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
    default -> System.out.println("Sorry the letter you typed is not found in the system. Please try again!");
}
```

I broke the program into pieces. Each letter goes to its own part, so main stays short and easy to read. `.trim()` and `.toUpperCase()` let the user type `d` or `D` with extra spaces and it still works. If the letter isn't on the menu, default tells them to try again.

### Saving to the file
This was the last thing I added, and it's what made the app actually work:

```java
public static void saveToFile(String line) {
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv", true));
        writer.write(line);
        writer.newLine();
        writer.close();
    } catch (IOException e) {
        System.out.println("Error saving transaction: " + e.getMessage());
    }
}
```

It took me a while to get this one. Before it, every transaction disappeared when I closed the app. This method opens the file, writes the transaction on a new line, and closes it. The `true` means it adds to the end of the file instead of erasing what's already there.

## Project Progress
| Date | What I did |
|------|------------|
| Nov 4 | Relearned the material from the workbooks through Ninjava |
| Nov 5 | Kept relearning the material while starting the project. Created the repo and added sample data to transactions.csv |
| Nov 6 | Built the Transaction class |
| Nov 6 | Made the home screen menu with a Scanner |
| Nov 6 | Added Add Deposit and Make Payment |
| Nov 6 | Added the Ledger and the README |
| Nov 6 | Added saving and loading transactions.csv |

## What I'd Do Differently
- Not rely on AI, and write the code myself first
- Do more repetition of the material
- Manage my time better and start earlier
- Ask for help sooner when I'm stuck

## What's Next
- Show the ledger newest first, with deposits only and payments only options
- Reports: month to date, previous month, year to date, previous year, search by vendor
- Stop the app from crashing if a word is typed for the amount
- Use the Transaction class instead of plain text lines