package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void testLessThanBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 700;
        int expected = 300; // 1000 - 700 = 300
        int actual = cashbackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testEqualsBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0; // 1000 - 1000 = 0
        int actual = cashbackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testGreaterThanBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 1500;
        int expected = 0; // Все что больше 1000 возвращается с 0
        int actual = cashbackService.remain(amount);
        assertEquals(actual, expected);
    }
}
