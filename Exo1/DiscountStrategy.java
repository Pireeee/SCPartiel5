interface DiscountStrategy {
    double applyDiscount(double price, String customerType, int packageCount);
}