package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test

    void rangeThreeNumber() {

        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;

        int actual = service.calculate(min, max);

        assertEquals(expected, actual);

    }

    @Test

    void rangeMaxRange() {

        SQRService service = new SQRService();
        int min = 9900;
        int max = 10_000;
        int expected = 0;

        int actual = service.calculate(min, max);

        assertEquals(expected, actual);

    }
    @Test

    void rangeMinRange() {

        SQRService service = new SQRService();
        int min = 10;
        int max = 99;
        int expected = 0;

        int actual = service.calculate(min, max);

        assertEquals(expected, actual);

    }
}

