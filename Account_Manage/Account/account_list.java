package Account;

import java.util.ArrayList;
import java.util.List;

public class account_list {
    
    private static account_list instance = new account_list();
    private List<account_info> accountList;
    
    private account_list() {
        accountList = new ArrayList<>();
    }
    
    public static account_list getInstance() { return instance; }
    
    public void addAccount(account_info account) { this.accountList.add(account); }
    public List<account_info> getAccountList() { return accountList; }
    
    public account_info findAccount(int accountNum) {
        for (account_info account : accountList) {
            if (account.getAccount_num() == accountNum) {
                return account;
            }
        }
        return null;
    }
}