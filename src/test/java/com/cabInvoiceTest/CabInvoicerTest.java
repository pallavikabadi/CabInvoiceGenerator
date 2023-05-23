package com.cabInvoiceTest;
import org.junit.Test;
import com.cabInvoice.CabinvoiceGenerator ;
import org.junit.jupiter.api.Assertions;


public class CabInvoicerTest {
    CabinvoiceGenerator invoicer = new CabinvoiceGenerator();

    @Test
    public void givenDistance_ShouldReturnFare() {
        double distance = 2.0;
        int time = 5;
        double result = invoicer.calculateFare(distance, time);
        Assertions.assertEquals(25, result);
    }
}
