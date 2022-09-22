package atmmachine;

import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) throws SQLException {
        PersonManager pm=new PersonManager();
        Person p1=new Person(2345667,1000);
        Person p2=new Person(367849,10000);
        Person p3=new Person(234512,200);
        Person p4=new Person(98765,5000);
        System.out.println("Welcome..");

        HashMap<Integer, Person> map = new HashMap<>();
        map.put(2340,p1) ;
        map.put(2341,p2) ;
        map.put(2342,p3) ;
        map.put(2343,p4) ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PIN:");
        int pin= sc.nextInt();
        if (map.containsKey(pin)) {
            Person p = map.get(pin);
            System.out.println("Account No:"+p.accountno );

        }

        System.out.println( "Select 1 for Withdraw" );
        System.out.println( "Select 2 for Deposit" );
        System.out.println( "Select 3 for Check Balance" );
        System.out.println( "Select 4 for EXIT" );
        System.out.print( "Select the  options:" );
        int op = sc.nextInt( );
switch(op) {
    case 1:System.out.println("Enter Amount Withdrawing:");
        int withdraw= sc.nextInt();
        System.out.println("Enter PIN:");
        pin = sc.nextInt();
        if (map.containsKey(pin)) {
            Person p = map.get(pin);
            pm.Withdrawing(p.balance, withdraw);
        } break;
    case 2: System.out.println("Enter Amount Depositing:");
        int deposit= sc.nextInt();
        System.out.println("Enter PIN:");
        pin = sc.nextInt();
        if (map.containsKey(pin)) {
            Person p = map.get(pin);
            pm.Deposit(p.balance, deposit);
        }break;
    case 3:System.out.println("Enter PIN:");
        pin = sc.nextInt();
        if (map.containsKey(pin)) {
            Person p = map.get(pin);
            pm.displayBalance(p.balance);
        } break;
    case 4:
        System.exit(0);
}

        }
    }
