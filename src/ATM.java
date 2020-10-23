public class ATM {
    private int amount;

    public ATM(int amount) {
        this.amount = amount;
    }

    public int withdraw (int money) {
        if (amount < money) {
            return 0;
        }
        amount = amount - money;
        return amount;
    }
    public int deposit (int money) {
        amount = amount + money;
        return amount;
    }

    public int getAmount() {
        return amount;
    }
}
