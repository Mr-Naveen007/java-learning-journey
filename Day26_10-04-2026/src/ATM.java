public class ATM {

    double balance = 1000;

    public static void main(String[] args) {
        ATM atm = new ATM();

        // Withdraw tests
        atm.withdraw(500);     // valid
        atm.withdraw(2000);    // insufficient balance
        atm.withdraw(0);       // invalid amount

        // Deposit tests
        atm.deposit(300);      // valid
        atm.deposit(-50);      // invalid
    }

    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }

            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }

            balance -= amount;
            System.out.println("Withdraw successful. Remaining balance: " + balance);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        balance += amount;
        System.out.println("Deposit successful. Balance: " + balance);
    }
}