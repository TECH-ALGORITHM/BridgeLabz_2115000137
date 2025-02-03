class BankAccount {
    static String bankName = "National Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println(totalAccounts);
    }

    void display() {
        if (this instanceof BankAccount) {
            System.out.println(accountHolderName + " " + accountNumber + " " + bankName);
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Alice", 1001);
        BankAccount b2 = new BankAccount("Bob", 1002);
        b1.display();
        b2.display();
        getTotalAccounts();
    }
}
