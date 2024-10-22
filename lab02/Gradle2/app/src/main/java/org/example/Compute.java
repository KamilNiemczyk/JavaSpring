package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Compute {
    public static void calculations(double[] arr){
        DescriptiveStatistics stats = new DescriptiveStatistics();
        for (double number : arr) {
            stats.addValue(number);
        }
        
        double mean = stats.getMean();
        double standardDeviation = stats.getStandardDeviation();
        double variance = stats.getVariance();
        System.out.println("Mean: " + mean);
        System.out.println("Standard deviation: " + standardDeviation);
        System.out.println("Variance: " + variance);
    }
}