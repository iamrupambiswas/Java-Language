package Day8;

public class BankSystem {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123456", 100.00);

        bankAccount.checkBalance();
    }
}

class BankAccount {
    private String accountNumber;
    private Double balance;

    BankAccount(String accNumber, Double balance) {
        this.accountNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        balance += amount;
        System.out.println(amount+" is credited\nCurrent balance: "+balance);
    }

    public void withraw(Double amount) {
        if(balance < amount) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        System.out.println(amount+" is withrawn\nCurrent balance: "+balance);
    }

    public void checkBalance() {
        System.out.println("Account balance: "+balance);
    }
}
