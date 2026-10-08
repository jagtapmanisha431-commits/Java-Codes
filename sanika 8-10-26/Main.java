class BankAccount {
    String accountHolderName;
    double balance;
    void transferTo(BankAccount receiver,double amount)
    {
        if(balance>=amount){
            balance=balance-amount;
            receiver.balance=receiver.balance+amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount ();
        BankAccount a2 = new BankAccount ();
        a1.balance=20000;
        a2.balance=150000;
        a1.transferTo(a2,5000);
        System.out.println("a1 balance:"+a1.balance);
        System.out.println("a2 balance:"+a2.balance);
    }
}
