public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(20000.0);

        double withdrawAmount = 6000.0;

        while (true) {
            try {
                account.withdraw(withdrawAmount);
                System.out.println("Withdrawn " + withdrawAmount + " som");
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                System.out.println("Withdrawn " + remainingAmount + " som. Reached account limit.");
                break;
            }
        }

    }
}