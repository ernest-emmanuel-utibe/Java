package tdd.AccountTest;

import Chapter3.Account;
import org.testng.annotations.Test;

public class AccountTest {
    @Test
    public static void main(String[] args) {
         Account account = new Account("EmmanuelAccount", 5000);
         account.withdraw(50);
	     System.out.println(account.getBalance());
    }
}
