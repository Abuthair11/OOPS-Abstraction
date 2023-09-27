import java.util.Scanner;

/**
 * @author abuthair on 27/09/23.
 * 11:42 pm
 * @project OOPS-Abstraction
 */
public class ATMmain {
    public static void main(String[] args) {
        System.out.println("Enter your accort S/C" );
        Scanner sc =  new Scanner (System.in);
        String type = sc.next();


        if(type.equalsIgnoreCase("S")){

            System.out.println("You want to W or D");
            Account account = new Saving();
            String val= sc.next();
            int amount = sc.nextInt();
            if(val .equalsIgnoreCase("W")){
                account.withdraw( amount);
                double ans = account.getBalance();
                System.out.println("Balance is"+ans);
            }
            else {
                account.Deposit( amount);
                double ans = account.getBalance();
                System.out.println("Balance is"+ans);
            }

        }
        else if(type.equalsIgnoreCase("C")){
            System.out.println("You want to W or D");
            Account account = new Current();
            String val= sc.next();
            int amount = sc.nextInt();
            if(val.equalsIgnoreCase("W")){
                account.withdraw(amount);
                double ans = account.getBalance();
                System.out.println("Balance is"+ ans);
            }
            else{
                account.Deposit(amount);
                double ans = account.getBalance();
                System.out.println("Balance is"+ ans);
            }

        }


    }


}