package atmmachine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class PersonManager {

    public static void displayBalance(int balance)
    {
        System.out.println("Current Balance : " + balance);
        System.out.println();
    }

    Scanner sc = new Scanner(System.in);

    public static int Deposit(int balance,
                                       int depositAmount)
    {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount : "
                + depositAmount);
        balance = balance + depositAmount;
        System.out.println(
                "Your Money has been successfully deposited");
        displayBalance(balance);
        return balance;
    }

    public static int Withdrawing(int balance,
                                        int withdrawAmount)
    {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : "
                + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println(
                    "Please collect your money and collect the card");
            displayBalance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }
    }





