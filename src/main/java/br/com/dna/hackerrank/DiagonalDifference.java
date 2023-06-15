package br.com.dna.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Vou colocar a resposta do chat GPT para economizar recursos, fica ai de aprendizado 

int size = array.size();
    int leftToRight = 0;
    int rightToLeft = 0;

    for (int i = 0; i < size; i++) {
        List<Integer> row = array.get(i);
        leftToRight += row.get(i);
        rightToLeft += row.get(size - 1 - i);
    }

    return Math.abs(leftToRight - rightToLeft);

*/

public class DiagonalDifference{

    public static int diagonalDifference(List<List<Integer>> array) {

        int leftToRight =0;
        int rightToLeft =0;
        int size = array.size()-1;
        for (int i = 0; i < array.size(); i++) {
            leftToRight += array.get(i).get(i);
            rightToLeft += array.get(i).get(size-i);
        }        
        return Math.abs(leftToRight-rightToLeft);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = DiagonalDifference.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
