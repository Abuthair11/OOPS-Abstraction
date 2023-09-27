/**
 * @author abuthair on 27/09/23.
 * 11:35 pm
 * @project OOPS-Abstraction
 */
public class Current extends Account{

    @Override
    void withdraw(int amount) {
        balance-=amount;
    }

    @Override
    void Deposit(int amount) {
       balance+=amount;
    }
}
