package org.example.pojo;

import java.util.HashMap;
import java.util.Map;

public class AccountRepoaitoryImpl implements AccountRepository{
    private Map<Long,Account> accountsMap = new HashMap<>();

    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnerName("john");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwnerName("mary");
        account2.setBalance(20.0);

        accountsMap.put(account1.getId(), account1);
        accountsMap.put(account2.getId(), account2);
    }

    @Override
    public void insert(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public void update(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public Account find(long accountID) {
        return accountsMap.get(accountID);
    }
}
