package br.com.dna.hackerrank.firstweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {


    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        FizzBuzz.fizzBuzz(n);

        bufferedReader.close();
    }


    private static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            String out = "";
            if (i % 3 == 0) {
                out += "Fizz";
            }
            if (i % 5 == 0) {
                out += "Buzz";
            }

            if(out.isEmpty()) {
                out = String.valueOf(i);
            }
            System.out.println(out);
        }
    }
}



