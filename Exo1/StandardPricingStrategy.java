class StandardPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(Package pkg, boolean urgent) {
        if (pkg.getWeight() < 0) {
            throw new IllegalArgumentException("Invalid weight!");
        }

        double base = pkg.getDistance() * 0.1;

        if (pkg.getWeight() > 10) {
            base += 5;
        }
        if (pkg.getWeight() > 5 && pkg.getWeight() <= 10) {
            base += 3;
        }

        if (urgent) {
            base *= 1.5;
        }

        return base;
    }
}