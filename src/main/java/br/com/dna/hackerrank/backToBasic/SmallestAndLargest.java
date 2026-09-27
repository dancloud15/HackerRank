package br.com.dna.hackerrank.backToBasic;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        String result= getSmallestAndLargest(s,n);
        System.out.println(result);

    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;
    }
}
