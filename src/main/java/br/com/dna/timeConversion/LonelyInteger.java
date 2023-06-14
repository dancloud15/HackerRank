package br.com.dna.timeConversion;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (Integer number : a) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }
        
     int unique =a.stream()
                .filter(number -> occurrences.get(number) == 1)
                .findFirst()
                .orElse(-1);
        return unique;
    }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = LonelyInteger.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
