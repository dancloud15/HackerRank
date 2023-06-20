package br.com.dna.hackerrank.firstweek;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public static String timeConversion(String s) {
        LocalTime time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        String formatted = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return formatted;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
