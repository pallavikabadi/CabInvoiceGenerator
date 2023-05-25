package com.cabInvoiceTest;
import com.cabInvoice.InvoiceGenerator;
import com.cabInvoice.InvoiceSummary;
import com.cabInvoice.Ride;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorForMulitpleRides {
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    @Test
    public void givenMultipleRides_ReturnInvoiceSummary(){
        Ride[] rides = { new Ride(1.1, 1),
                new Ride(10.0, 5),
                new Ride(5.0, 6),
                new Ride(8.9, 1),
                new Ride(9.0, 9) };
        InvoiceSummary fare = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummery = new InvoiceSummary(5, 362);
        Assertions.assertEquals(expectedInvoiceSummery, fare);
    }
}
