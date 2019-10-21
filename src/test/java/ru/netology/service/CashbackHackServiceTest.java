package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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

    @ParameterizedTest
    @CsvFileSource(resources = "/AmountData.csv", numLinesToSkip = 1)
    void shouldCalculateAmount(int amount, int expected, String message) {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(amount);
        assertEquals(expected, actual, message);
    }
}