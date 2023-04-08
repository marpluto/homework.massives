package ru.netology.stats;

public class StatsService {
    public int sumOfSales(int[] sales) {
        int sumOfSales = 0;
        for (int sale : sales) {
            sumOfSales = sumOfSales + sale;
        }
        return sumOfSales;
    }

    public long medValueOfSales(int[] sales) {
        long medValue = sumOfSales(sales) / sales.length;
        return medValue;
    }

    public int numMonthHighest(int[] sales) {
        int monthHighest = 0;
        int highestSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= highestSale) {
                highestSale = sales[i];
                monthHighest = i;
            }
        }
        return monthHighest + 1;
    }

    public int numMonthLowest(int[] sales) {
        int monthLowest = 0;
        int lowestSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= lowestSale) {
                lowestSale = sales[i];
                monthLowest = i;
            }
        }
        return monthLowest + 1;
    }

    public int sumMonthLowerThanMed(int[] sales) {
        int sumMonthLow = 0;
        for (int sale : sales) {
            if (sale < medValueOfSales(sales)) {
                sumMonthLow++;
            }
        }
        return sumMonthLow;
    }

    public int sumMonthHigherThanMed(int[] sales) {
        int sumMonthHigh = 0;
        for (int sale : sales) {
            if (sale > medValueOfSales(sales)) {
                sumMonthHigh++;
            }
        }
        return sumMonthHigh;
    }
}
