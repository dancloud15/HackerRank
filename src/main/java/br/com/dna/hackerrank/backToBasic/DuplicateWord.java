package br.com.dna.hackerrank.backToBasic;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DuplicateWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        while (n-- > 0) {
            String input = scan.nextLine();

            String regex = "\\b(\\w+)(\\s+\\1\\b)+";
            Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            input = p.matcher(input).replaceAll("$1");

            System.out.println(input);
        }

        scan.close();
    }
}

