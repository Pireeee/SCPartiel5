public class CustomerDiscountStrategy implements DiscountStrategy {
    private static final double BULK_DISCOUNT = 0.95;

    @Override
    public double applyDiscount(double price, String customerType, int packageCount) {
        CustomerType type = CustomerType.valueOf(customerType.toUpperCase());
        price *= type.getDiscountRate();

        if (packageCount > 3) {
            price *= BULK_DISCOUNT;
        }

        return price;
    }

}