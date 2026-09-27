package br.com.dna.hackerrank.backToBasic;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String reverse = new StringBuilder(s)
                .reverse()
                .toString();

        System.out.println(s.equals(reverse) ? "Yes" : "No");;
    }
}
