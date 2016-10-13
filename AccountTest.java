
/**
 * Released under GNU license v3.0 Please respect open-source code and it's
 * creators
 *
 * Code created on Jul 17, 2013 Revision 1.00
 *
 * @author Josh Cannons <josh.cannons@gmail.com>
 */
import java.util.Scanner;

public class AccountTest {
    //main meth begins execution of Java application

    public static void main(String[] args) {
        Account account1 = new Account(50.00); //create new account object
        Account account2 = new Account(-7.23); // create new account object

        //display initial balannce of each object
        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n", account2.getBalance());

        //create Scanner object to obtain input from command window
        Scanner input = new Scanner(System.in);
        double withdrawlAmount; //withdrawl read from user
        double depositAmount; //deposit read from user
        System.out.print("Enter deposit amount for account1: "); //prompt
        depositAmount = input.nextDouble(); //obtainuser input
        System.out.printf("\nadding $%.2f to account1 balance\n\n", depositAmount);
        account1.credit(depositAmount); //add to account1 balance

        //display balances
        System.out.printf("account1 balance: , $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: , $%.2f\n", account2.getBalance());

        //add to account 2 balance
        System.out.printf("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("\nadding $%.2f to account2\n\n", depositAmount);
        account2.credit(depositAmount); //add to account2 balance

        //display balances
        System.out.printf("account1 balance: , $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: , $%.2f\n", account2.getBalance());

        //subtract from account1 balance
        System.out.print("Enter withdrawl amount for account1: "); //prompt
        withdrawlAmount = input.nextDouble(); //obtainuser input
        System.out.printf("\ndebiting $%.2f from account1 balance\n\n", withdrawlAmount);
        account1.debit(withdrawlAmount); //subtract from account1 balance

        //display balances
        System.out.printf("account1 balance: , $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: , $%.2f\n", account2.getBalance());

        //subtract from account2 balance
        System.out.printf("Enter withdrawl amount for account2: "); // prompt
        withdrawlAmount = input.nextDouble(); // obtain user input
        System.out.printf("\ndebiting $%.2f from account2\n\n", withdrawlAmount);
        account2.debit(withdrawlAmount); //subtract from account2 balance

        //display balances
        System.out.printf("account1 balance: , $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: , $%.2f\n", account2.getBalance());

    } // end main
}// end class AccountTest