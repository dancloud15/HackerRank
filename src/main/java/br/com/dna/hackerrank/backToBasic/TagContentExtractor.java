package br.com.dna.hackerrank.backToBasic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());

        Pattern pattern = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");

        while (testCases-- > 0) {
            String line = sc.nextLine();

            Matcher matcher = pattern.matcher(line);

            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        sc.close();
    }
}
