package thisisjava.Bank_pro;

public class Account {
	private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
    	if(balance + amount < balance) {
        	System.out.println("계좌 입금 상한입니다. 계좌를 추가로 생성해주세요");
        	return;
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if(balance - amount < 0) {
        	System.out.println("잔고가 부족합니다.");
        	return;
        }
        balance -= amount;
    }
}
