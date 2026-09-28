package br.com.dna.hackerrank.backToBasic;

import java.util.Scanner;

public class RegexIP {
    public static void main(String[] args) {
        String pattern =
                        "((25[0-5])|(2[0-4][0-9])|([01]?[0-9][0-9]?))\\." +
                        "((25[0-5])|(2[0-4][0-9])|([01]?[0-9][0-9]?))\\." +
                        "((25[0-5])|(2[0-4][0-9])|([01]?[0-9][0-9]?))\\." +
                        "((25[0-5])|(2[0-4][0-9])|([01]?[0-9][0-9]?))";

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            String ip = scanner.nextLine();

            System.out.println(ip.matches(pattern));
        }

        scanner.close();
    }
}
