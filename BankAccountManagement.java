class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accNum, String holder, double bal) {
        this.accountNumber = accNum;
        this.accountHolder = holder;
        this.balance = bal;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }

    public double getBalance() {
        return this.balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accNum, String holder, double bal) {
        super(accNum, holder, bal);
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "Alice", 5000);
        sa.display();
        sa.setBalance(7000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
