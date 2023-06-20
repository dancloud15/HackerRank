package br.com.dna.hackerrank.secondweek;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ListPairs {

    private static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for ( Integer num: ar){
            if (set.contains(num)){
                count++;
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        System.out.println(count);
        return count;

    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ListPairs.sockMerchant(n, ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }


}
