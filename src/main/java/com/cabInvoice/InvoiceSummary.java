package com.cabInvoice;

import java.util.Objects;
public class InvoiceSummary {
    private int numOfRiders;
    private double totalFare;
    private double avarage;
    /*
    *Constructor
    */
    public InvoiceSummary(int numOfRiders, double totalFare) {
        this.numOfRiders = numOfRiders;
        this.totalFare = totalFare;
        this.avarage = this.totalFare/this.numOfRiders;
    }
    /*
    *To compare the objects.
    */
    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || (getClass() != object.getClass()))
            return false;

        InvoiceSummary invoice = (InvoiceSummary) object;
        return  avarage == invoice.avarage && numOfRiders == invoice.numOfRiders && totalFare == invoice.totalFare;
    }
}
