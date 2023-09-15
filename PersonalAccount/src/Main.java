public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Bermet");
        account.deposit(1000);
        account.withdraw(440);
        account.deposit(150);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("\nTransaction History:");
        account.printHistory();
    }
}
