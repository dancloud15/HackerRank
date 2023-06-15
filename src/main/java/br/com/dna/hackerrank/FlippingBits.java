package br.com.dna.hackerrank;

import java.io.*;
import java.util.stream.IntStream;

public class FlippingBits {
    private static long flippingBits(long n) {

        String s = Long.toBinaryString(n);

        StringBuilder normal = new StringBuilder();
        StringBuilder inverse = new StringBuilder();

        for (int number = s.length(); number < 32; number++) {
            normal.append(0);
        }
        normal.append(s);
        System.out.println(normal.subSequence(0, 32));

        for (int i = 0; i < 32; i++) {
            char c = normal.charAt(i);
            if (c == '0') {
                inverse.append(1);
            } else {
                inverse.append(0);
            }
        }

        return Long.parseLong(inverse.toString(), 2);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = FlippingBits.flippingBits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }


}
