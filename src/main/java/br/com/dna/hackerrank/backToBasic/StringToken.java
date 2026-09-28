package br.com.dna.hackerrank.backToBasic;

import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().trim();
        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
