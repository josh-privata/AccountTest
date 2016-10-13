
/**
 * Released under GNU license v3.0 Please respect open-source code and it's
 * creators
 *
 * Code created on Jul 17, 2013 Revision 1.00
 *
 * @author Josh Cannons <josh.cannons@gmail.com>
 */
public class Account {

    private double balance; //instance variable that stores balance

//constructor
    public Account(double initialBalance) {
        //validate that initialBalance is greater than 0.0;
        //if it is not, balance is initialised to the default value of 0.0
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    } // end Account constructor

//credit (add) an amount to the account
    public void credit(double amount) {
        balance = balance + amount; //add amount to balance
    } //end method credit

//debit (subtract) an amount to this account
    public void debit(double amount2) {
        if ((balance - amount2) < 0.00) {
            System.out.printf("\nDebit amount $%.2f exceeded account balance of $%.2f\n\n", amount2, balance); // dont subtract balance from amount
        }
        if ((balance - amount2) >= 0.00) {
            balance = balance - amount2; //subtract amount from balance
        }
    } //end method debit

//return the account balance
    public double getBalance() {
        return balance; //gives the value of balance to the calling method
    } // end method getBalance
} // end class Account