# BankManagement
The project aims to create a simple Bank Account Management System using Java, demonstrating the implementation of Object-Oriented Programming (OOP) concepts such as abstraction, inheritance, and interfaces.
# Components:

Interfaces:

ABCD: An interface that contains a constant rate and an abstract method calculateinterest().
Abstract Class:

BankAccount: An abstract class that provides a blueprint for bank accounts. It includes methods for inputting and displaying account details and abstract methods for depositing and withdrawing money.
Concrete Classes:

SavingAccount: A class that extends BankAccount and implements the methods for depositing and withdrawing money specific to a savings account.
CurrentAccount: A class that extends BankAccount and implements the methods for depositing and withdrawing money specific to a current account.
Interest1: A class that extends CurrentAccount and implements the ABCD interface to calculate interest for current accounts.
Interest2: A class that extends SavingAccount and implements the ABCD interface to calculate interest for savings accounts.
Features:

Input Data:

Allows the user to input bank account details such as account number, name, and mobile number.
Display Data:

Displays the bank account details and current balance.
Deposit Money:

Allows the user to deposit money into either a savings or a current account, with a limit on the maximum deposit amount.
Withdraw Money:

Allows the user to withdraw money from either a savings or a current account, with conditions to maintain a minimum balance for savings accounts.
Calculate Interest:

Calculates and displays interest based on predefined rates for both savings and current accounts, comparing against a threshold rate.
User Menu:

Provides a menu-driven interface for the user to interact with the system, allowing them to perform various operations like inputting data, displaying data, depositing money, withdrawing money, and calculating interest.
How It Works:

The program starts by displaying a menu to the user.
The user can choose to input data, display account details, deposit or withdraw money from savings or current accounts, and calculate interest.
The program performs the chosen operation and displays the result.
The process repeats until the user decides to exit the program.
OOP Concepts Demonstrated:

Abstraction: The BankAccount abstract class defines common functionalities while leaving specific implementations to its subclasses.
Inheritance: SavingAccount and CurrentAccount classes inherit from the BankAccount abstract class, reusing and extending its functionalities.
Interface Implementation: Interest1 and Interest2 classes implement the ABCD interface to provide specific implementations for calculating interest.
