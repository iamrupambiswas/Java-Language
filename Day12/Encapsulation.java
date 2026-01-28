package Day12;

public class Encapsulation {
    public static void main(String[] args) {
        
        BankAccount ba = new BankAccount(100);

        System.out.println(ba.getBalance());
        ba.setBalance(200);
        ba.setBalance(-1);

    }
}

class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        if(amount <= 0) {
            System.out.println("Account balance can't be negative!");
            return;
        }

        balance = amount;
        System.out.println("Account balance: " +balance);
    }
}