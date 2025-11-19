package bankApplication;

import Account.CreateAccount;
import Account.account_info;
import Account.account_list;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
    private static account_list accountManager = account_list.getInstance();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        CreateAccount createAccount = new CreateAccount();
        Deposit deposit = new Deposit();
        Withdrawal withdrawal = new Withdrawal();
        
        while (run) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            
            int selectNo;
            try {
                selectNo = scanner.nextInt();
                scanner.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
                scanner.nextLine();
                continue;
            }

            if (selectNo == 1) {
                createAccount.execute(scanner, accountManager);
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit.execute(scanner, accountManager);
            } else if (selectNo == 4) {
                withdrawal.execute(scanner, accountManager);
            } else if (selectNo == 5) {
                run = false;
            } else {
                System.out.println("잘못된 메뉴 번호입니다. 다시 선택해 주세요.");
            }
        }
        
        System.out.println("프로그램 종료");
        scanner.close();
    }

    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");
        
        List<account_info> list = accountManager.getAccountList();
        
        if (list.isEmpty()) {
            System.out.println("생성된 계좌가 없습니다.");
            return;
        }

        for (account_info account : list) {
            System.out.printf("%s\t%s\t%d\n", 
                account.getAccount_num(), 
                account.getName(), 
                account.getDeposits());
        }
    }
}