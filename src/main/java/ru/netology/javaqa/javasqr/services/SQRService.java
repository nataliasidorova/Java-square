package ru.netology.javaqa.javasqr.services;

public class SQRService {

    public int calcSquares(int min, int max) {
        for (int num = 10; num <= 99; num++) {
            int squareNumber = num * num;
            if (squareNumber >= min && squareNumber <= max) {
                return num;
            }
        }
        return 0;
    }
}
