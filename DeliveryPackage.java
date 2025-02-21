class DeliveryPackage {
    private final double weight;
    private final double distance;

    public DeliveryPackage(double weight, double distance) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.weight = weight;
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }
}
