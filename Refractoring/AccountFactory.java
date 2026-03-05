import java.util.ArrayList;

public class AccountFactory {

    public static CustomerAccount createAccount(String type,ATMCard atm,String number,double balance,ArrayList<AccountTransaction> transactionList,double interest)
    {
        if (type.equalsIgnoreCase("Current Account"))
        {
            return new CustomerCurrentAccount(atm, number, balance, transactionList);
        }

        if (type.equalsIgnoreCase("Deposit Account"))
        {
            return new CustomerDepositAccount(interest, number, balance, transactionList);
        }
        return null;
    }
}