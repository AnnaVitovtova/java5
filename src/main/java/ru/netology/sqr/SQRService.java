package ru.netology.sqr;

public class SQRService {
    public static void main() {
        calculate(200,300);
    }

    public static int calculate(int min, int max)
    {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i <= max && i * i >= min) {
                counter++;
                System.out.println(counter);

            }


        }

        return counter;
    }
}

