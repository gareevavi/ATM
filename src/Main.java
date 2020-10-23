public class Main {
    public static void main(String[] args) {
        ATM service = new ATM (1_000);
        int withdraw = service.withdraw(950);
        int deposit = service.deposit(10);

        System.out.println(service.getAmount());
    }
}
