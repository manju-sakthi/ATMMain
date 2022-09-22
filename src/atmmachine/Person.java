package atmmachine;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;
import java.sql.Connection;
import java.util.Scanner;

public class Person {
                   int accountno;
                   int balance;
                   Person( int accountno,int balance){
                       this.balance=balance;
                       this.accountno=accountno;
                   }
}

