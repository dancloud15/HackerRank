package br.com.dna.hackerrank.firstweek;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here

        Map<Character, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            occurrences.put(s.toLowerCase().charAt(i), i);

        }
        System.out.println(occurrences.size()>26?"pangram":"not pangram");

        return occurrences.size()>26?"pangram":"not pangram";



//        int[] count = new int[26];
//
//        char[] charArray = s.toCharArray();
//
//        for (Character letter: charArray) {
//            int i = letter;
//            System.out.println(i+" = "+ letter);
//        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Pangrams.pangrams("We promptly judged antique ivory buckles for the prize");

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
