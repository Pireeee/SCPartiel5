enum CustomerType {
    VIP(0.8),
    BUSINESS(0.9),
    REGULAR(1.0);

    private final double discountRate;

    CustomerType(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}