package ru.netology.javaqa.javasqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SQRServicesTest {

    @Test

    public void testFindNumberSquares() {

        SQRService service = new SQRService();

        int min = 10;
        int max = 99;

        int expected = 0;
        int actual = service.calcSquares(min, max);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testFindNumberSquaresIfZeroMin() {

        SQRService service = new SQRService();

        int min = 0;
        int max = 99;

        int expected = 0;
        int actual = service.calcSquares(min, max);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testFindNumberSquaresIfMinNegative() {

        SQRService service = new SQRService();

        int min = -10;
        int max = 99;

        int expected = 0;
        int actual = service.calcSquares(min, max);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testFindNumberSquaresIfMaxNegative() {

        SQRService service = new SQRService();

        int min = 10;
        int max = -99;

        int expected = 0;
        int actual = service.calcSquares(min, max);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testFindNumberSquaresIfAllNegative() {

        SQRService service = new SQRService();

        int min = -10;
        int max = -99;

        int expected = 0;
        int actual = service.calcSquares(min, max);

        Assertions.assertEquals(expected, actual);
    }
}

