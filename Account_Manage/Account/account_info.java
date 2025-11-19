package Account;

public class account_info {
	private int account_num;
	private String name;
	private int deposits;
	
	public account_info() { }
	
	public void set_account_info(int num, String name, int deposits) {
		this.account_num = num;
		this.name = name;
		this.deposits = deposits;
	}

    public void setDeposits(int deposits) { 
        this.deposits = deposits;
    }
    
	public int getAccount_num() { return account_num; }
	public String getName() { return name; }
	public int getDeposits() { return deposits; }
}