package edu.miu.shipment;

public class StandardShipment implements Shipment {
    private final String trackingNumber;
    private final String estimatedDelivery;

    public StandardShipment(String trackingNumber, String estimatedDelivery) {
        this.trackingNumber = trackingNumber;
        this.estimatedDelivery = estimatedDelivery;
    }

    @Override
    public String getTrackingDetails() {
        return "Standard - Tracking: " + trackingNumber + ", ETA: " + estimatedDelivery;
    }
}