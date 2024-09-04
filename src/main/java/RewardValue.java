public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor to initialize with cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor to initialize with miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (!isMiles) {
            throw new IllegalArgumentException("The second parameter must be true to initialize with miles.");
        }
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Getter for MILES_TO_CASH_RATE
    public static double getMilesToCashRate() {
        return MILES_TO_CASH_RATE;
    }
}
