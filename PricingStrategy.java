interface PricingStrategy {
    double calculatePrice(Package pkg, boolean urgent);
}