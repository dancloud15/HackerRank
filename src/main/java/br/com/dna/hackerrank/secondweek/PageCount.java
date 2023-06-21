package br.com.dna.hackerrank.secondweek;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PageCount {
    private static int pageCount(int n, int p) {
        int count =-1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(i);
        }
        if (n/2<p){
            Collections.reverse(list);
            for (int i = 0; i <= p; i++) {
                i++;
                count++;

            }
        }else{
            for (int i = p; i >= 0; i--) {
                if (i==n || (i-1)==n)
                i--;
                count++;

            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = PageCount.pageCount(n, p);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }


}
