package br.com.dna.hackerrank;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class FlippingMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("QUAL É O MAIOR?");
                System.out.println(matrix.get(i).get(j) +" ou " + matrix.get(i).get(2 * n - j - 1));
                System.out.println(matrix.get(2 * n - i - 1).get(j)+" ou "+ matrix.get(2 * n - i - 1).get(2 * n - j - 1));

                int maxVal = Math.max(
                        Math.max(matrix.get(i).get(j), matrix.get(i).get(2 * n - j - 1)),
                        Math.max(matrix.get(2 * n - i - 1).get(j), matrix.get(2 * n - i - 1).get(2 * n - j - 1))
                );
                System.out.println("RESPOSTA : " + maxVal);
                sum += maxVal;
            }
        }




        return sum;

    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(112, 42, 83, 119),
                List.of(56, 125, 56, 49),
                List.of(15, 78, 101, 43),
                List.of(62, 98, 114, 108)
        );

        int result = flippingMatrix(matrix);
        System.out.println(result);
    }
}
