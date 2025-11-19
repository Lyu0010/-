package Account;

import java.util.Scanner;

public class CreateAccount {
    public void execute(Scanner scanner, account_list manager) {
        System.out.println("------------------");
        System.out.println("계좌생성");
        System.out.println("------------------");
        System.out.print("계좌번호: ");
        int accountNum = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("계좌주: ");
        String name = scanner.nextLine();
        
        System.out.print("초기입금액: ");
        int deposits = scanner.nextInt();
        scanner.nextLine();
        
        account_info newAccount = new account_info();
        newAccount.set_account_info(accountNum, name, deposits);
        
        manager.addAccount(newAccount);
        
        System.out.println("결과: 계좌가 생성되었습니다.");
    }
}