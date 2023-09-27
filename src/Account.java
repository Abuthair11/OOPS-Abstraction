/**
 * @author abuthair on 27/09/23.
 * 11:31 pm
 * @project OOPS-Abstraction
 */
public abstract class Account {
    double balance = 2000;

    abstract  void withdraw(int amount);
    abstract  void Deposit(int amount);

    double getBalance(){
        return balance;
    }
}
