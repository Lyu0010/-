package thisisjava.Bank_pro;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        boolean run = true;

        while(run) {
            System.out.println("------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------------");
            System.out.print("선택> ");

            String choice = scanner.nextLine();

            if(choice.equals("1")) {
                System.out.print("예금액> ");
                int amount = Integer.parseInt(scanner.nextLine());
                account.deposit(amount);

            } else if(choice.equals("2")) {
                System.out.print("출금액> ");
                int amount = Integer.parseInt(scanner.nextLine());
                account.withdraw(amount);

            } else if(choice.equals("3")) {
                System.out.println("잔고> " + account.getBalance());

            } else if(choice.equals("4")) {
                run = false;
            }
        }

        System.out.println("프로그램 종료");
    }

}
