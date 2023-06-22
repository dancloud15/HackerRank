package br.com.dna.hackerrank.secondweek;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TowerBreakers {
    private static int towerBreakers(int n, int m) {
        int moves = 0;
        int height =m;

        for(int i=m-1;i>0;i--) {
            if(height -i !=0 && height%(height-i)==0 && height > 1) {
                height = height - i;
                moves ++;
            }
        }

        moves = n* moves;

        System.out.println(moves%2==0 ? 2:1);

        return moves%2==0 ? 2:1;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int result = TowerBreakers.towerBreakers(n,m);

//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }


}
