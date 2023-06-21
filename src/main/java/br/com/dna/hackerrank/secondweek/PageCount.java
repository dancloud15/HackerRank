package br.com.dna.hackerrank.secondweek;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PageCount {
    private static int pageCount(int n, int p) {
        // O número mínimo de páginas a serem viradas é a menor distância entre o início e o final do livro
        // em relação à página alvo
        int total = n / 2;  // Total de páginas no livro
        int pagina = p / 2;  // Página alvo

        int count = Math.min(pagina, total - pagina);
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
