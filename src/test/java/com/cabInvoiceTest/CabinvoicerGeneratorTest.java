package com.cabInvoiceTest;

import com.cabInvoice.Uc1.CabinvoiceGenerator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class CabinvoicerGeneratorTest {

    CabinvoiceGenerator invoicer = new CabinvoiceGenerator();

    @Test
    public void givenDistance_ShouldReturnFare() {
        double distance = 2.0;
        int time = 5;
        double result = invoicer.calculateFare(distance, time);
        Assertions.assertEquals(25, result);
    }
}
