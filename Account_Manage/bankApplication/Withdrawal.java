package bankApplication;

import Account.account_info;
import Account.account_list;
import java.util.Scanner;

public class Withdrawal {

    public void execute(Scanner scanner, account_list manager) {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");

        System.out.println("계좌번호: ");
        int accountNum = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("출금액: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        
        account_info account = manager.findAccount(accountNum);
        
        if (account == null) {
            System.out.println("결과: 해당 계좌를 찾을 수 없습니다.");
            return;
        }
        
        int currentBalance = account.getDeposits();
        
        if (currentBalance < amount) {
            System.out.println("결과: 잔액이 부족합니다.");
            return;
        }
        
        account.setDeposits(currentBalance - amount);
        
        System.out.println("결과: 출금이 성공되었습니다. (잔액: " + account.getDeposits() + ")");
    }
}