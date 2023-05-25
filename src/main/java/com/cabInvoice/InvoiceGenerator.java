package com.cabInvoice;

public class InvoiceGenerator {
    public static  double costPerKm = 10.0;
    public static  double costPerMinute = 1.0;
    public static  double min_fare = 5;
    /*
    *To calculate fare for a ride.
    */
    public double calculateFare(double distance, int time) {
        double totalFare =  distance * costPerKm + time * costPerMinute;
        return Math.max( min_fare, totalFare);
    }
    /*
    *To calculate fare for multiple rides.
    */
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFares = 0;
        for(Ride ride: rides)
            totalFares += this.calculateFare(ride.distance, ride.time);
        return new InvoiceSummary(rides.length, totalFares);
    }
}
