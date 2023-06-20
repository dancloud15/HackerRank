package br.com.dna.hackerrank.firstweek;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

    /*
    * SOLUÇÃO CHAT GPT
    * class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
        int maxValue = Collections.max(arr) + 1;
        int[] count = new int[maxValue];

        for (int num : arr) {
            count[num]++;
        }

        List<Integer> contador = new ArrayList<>();
        for (int i = 0; i < maxValue; i++) {
            if (count[i] > 0) {
                contador.addAll(Collections.nCopies(count[i], i));
            }
        }

        if (contador.size() > 100) {
            return contador.subList(0, 100);
        }

        return contador;
    }
}
*/
public class CountingSort {



    public static List<Integer> countingSort(List<Integer> arr) {
        int[] count = new int[arr.size()];
        List<Integer> contador = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            count[arr.get(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            contador.add(count[i]);
        }
        if (contador.size() > 100) {
            return contador.subList(0, 100);
        }

        return contador;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = CountingSort.countingSort(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}



