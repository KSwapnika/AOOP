package basic_concepts;

class Account {
    private double balance;

    public void setBalance(double b) {
        if (b > 0) {
            balance = b;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulatedFieldsWithGettersSetters {
	    public static void main(String[] args) {
	        Account acc = new Account();
	        acc.setBalance(1500.50);
	        System.out.println("Balance: " + acc.getBalance());
	    }
}
