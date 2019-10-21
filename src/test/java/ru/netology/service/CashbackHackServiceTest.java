package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldThrowIfAmountIs0() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 0;
        assertThrows(IllegalArgumentException.class,
                () -> cashback.remain(amount)
        );
    }

    @Test
    void shouldReturn50IfAmountIs950() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 950;
        int actual = cashback.remain(amount);
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn500IfAmountIs1500() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1500;
        int actual = cashback.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }
}