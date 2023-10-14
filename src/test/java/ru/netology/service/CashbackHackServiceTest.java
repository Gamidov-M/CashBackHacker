package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void testLessThanBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 700;
        int expected = 300; // 1000 - 700 = 300
        int actual = cashbackService.remain(amount);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testEqualsBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0; // 1000 - 1000 = 0
        int actual = cashbackService.remain(amount);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGreaterThanBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 1500;
        int expected = 0; // Все что больше 1000 возвращается с 0
        int actual = cashbackService.remain(amount);
        Assert.assertEquals(expected,actual);
    }
}
