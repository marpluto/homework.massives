package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    StatsService service = new StatsService();

    @Test
    void sumOfSalesTest() {
        int expected = 180;

        int actual = service.sumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void medValueOfSalesTest() {
        long expected = 15;

        long actual = service.medValueOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numMonthHighestTest() {
        int expected = 8;

        int actual = service.numMonthHighest(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numMonthLowestTest() {
        int expected = 1;

        int actual = service.numMonthLowest(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sumMonthLowerThanMedTest() {
        int expected = 5;

        int actual = service.sumMonthLowerThanMed(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sumMonthHigherThanMedTest() {
        int expected = 5;

        int actual = service.sumMonthHigherThanMed(sales);

        Assertions.assertEquals(expected, actual);
    }
}
