package br.com.dna.hackerrank.firstweek;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SparseArrays {


    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String, Integer> occ = new HashMap<>();

        for (String s : strings) {
            occ.put(s, occ.getOrDefault(s, 0) + 1);
        }

        List<Integer> matchingStrings = new ArrayList<>();

        for (String q : queries) {
            int count = occ.getOrDefault(q, 0);
            matchingStrings.add(count);
        }

        return matchingStrings;

    }

    /*
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); - Cria um objeto BufferedReader que permite ler as entradas do usuário. System.in representa a entrada padrão do sistema (geralmente o console).
BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH"))); - Cria um objeto BufferedWriter que será usado para escrever a saída em um arquivo. O caminho do arquivo é obtido usando System.getenv("OUTPUT_PATH"), que lê o valor da variável de ambiente "OUTPUT_PATH".
int stringsCount = Integer.parseInt(bufferedReader.readLine().trim()); - Lê uma linha do BufferedReader, converte-a para um número inteiro e atribui o valor a stringsCount. Nesse caso, a linha lida deve conter um número que representa a quantidade de strings que serão fornecidas como entrada.
List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> { ... }).collect(toList()); - Lê as stringsCount linhas seguintes do bufferedReader e armazena-as em uma lista chamada strings. Cada linha lida é adicionada à lista por meio da função mapToObj.
int queriesCount = Integer.parseInt(bufferedReader.readLine().trim()); - Lê uma linha do BufferedReader, converte-a para um número inteiro e atribui o valor a queriesCount. Nesse caso, a linha lida deve conter um número que representa a quantidade de queries (consultas) que serão fornecidas como entrada.
List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> { ... }).collect(toList()); - Lê as queriesCount linhas seguintes do bufferedReader e armazena-as em uma lista chamada queries. Cada linha lida é adicionada à lista por meio da função mapToObj.
List<Integer> res = SparseArrays.matchingStrings(strings, queries); - Chama um método estático chamado matchingStrings da classe SparseArrays, passando as listas strings e queries como argumentos. Essa linha retorna uma lista de inteiros chamada res.
bufferedWriter.write(...); - Escreve a saída no bufferedWriter. A saída é composta pelos elementos da lista res, convertidos para strings e concatenados com "\n" (quebra de linha) entre eles.*/
    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            List<Integer> res = SparseArrays.matchingStrings(strings, queries);
        System.out.println(res);

//            bufferedWriter.write(
//                    res.stream()
//                            .map(Object::toString)
//                            .collect(joining("\n"))
//                            + "\n"
//            );

            bufferedReader.close();
//            bufferedWriter.close();
        }

}
