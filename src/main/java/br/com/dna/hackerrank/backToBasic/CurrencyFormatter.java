package br.com.dna.hackerrank.backToBasic;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        NumberFormat indiaFormat = NumberFormat.getNumberInstance(Locale.US);
        indiaFormat.setMinimumFractionDigits(2);
        indiaFormat.setMaximumFractionDigits(2);

        String india = "Rs." + indiaFormat.format(payment);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india);
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

    }
}
