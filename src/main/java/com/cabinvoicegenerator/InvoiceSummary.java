package com.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;

public class InvoiceSummary {

    public int noOfRides;
    public double totalFare;
    public double avgFare;

    public InvoiceSummary(int rides, double fare) {
        this.noOfRides = rides;
        this.totalFare = fare;
        this.avgFare = this.totalFare/this.noOfRides;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InvoiceSummary summary = (InvoiceSummary) obj;
        return Double.compare(summary.noOfRides,noOfRides) == 0 && totalFare == summary.totalFare
                && Double.compare(summary.avgFare,avgFare) == 0;
    }
}