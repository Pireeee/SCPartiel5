public class DeliveryService {
    private final PricingStrategy pricingStrategy;
    private final DiscountStrategy discountStrategy;

    public DeliveryService(PricingStrategy pricingStrategy, DiscountStrategy discountStrategy) {
        this.pricingStrategy = pricingStrategy;
        this.discountStrategy = discountStrategy;
    }

    public double calculateDeliveryPrice(List<Package> packages, String customerType, boolean urgent) {
        double total = 0;
        for (Package pkg : packages) {
            total += pricingStrategy.calculatePrice(pkg, urgent);
        }
        return discountStrategy.applyDiscount(total, customerType, packages.size());
    }

    public void printInvoice(List<Package> packages, String customerType) {
        double price = calculateDeliveryPrice(packages, customerType, false);
        System.out.println("Total: " + price);

        if (price > 100) {
            System.out.println("Apply special discount next time!");
        }
    }
}