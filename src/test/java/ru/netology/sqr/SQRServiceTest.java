package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testCalculatorWhenSomeSquaresFound () {
        SQRService service = new SQRService();
        int actual = service.cala(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();
        int actual = service.cala(100, 100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();
        int actual = service.cala(100, 9801);
        int expected = 90;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateNumberOfSquaresExceedingMaximumLimit() {
        SQRService service = new SQRService();
        int actual = service.cala(100, 100_000);
        int expected = 90;
        Assertions.assertEquals(expected, actual);

    }
}