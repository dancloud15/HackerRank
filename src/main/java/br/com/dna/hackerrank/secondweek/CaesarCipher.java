package br.com.dna.hackerrank.secondweek;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*

RESPOSTA DADA PELO CHAT GPT

Existem algumas melhorias que você pode fazer no algoritmo do Cifra de César para deixá-lo mais eficiente e legível. Aqui estão algumas sugestões:

Evitar conversões desnecessárias: Em vez de converter as strings low e upper em arrays de caracteres a cada chamada da função caesarCipher, você pode declarar essas strings como arrays de caracteres no início do método. Dessa forma, você evita conversões repetitivas.

Utilizar o operador de módulo % para evitar estouro de índice: No trecho onde você está obtendo as letras deslocadas do alfabeto (substringlow e substringup), você pode usar o operador de módulo % em vez de acessar posições específicas das strings. Isso evita o estouro de índice caso o valor de k seja maior que 26.

Utilizar uma estrutura de dados para mapear as letras: Em vez de percorrer os arrays de caracteres originalLow e originalUp para encontrar a posição correta de uma letra, você pode utilizar uma estrutura de dados como HashMap<Character, Character>. Isso permite mapear diretamente cada letra para sua respectiva letra criptografada, sem a necessidade de iterações repetidas.

Utilizar a classe StringBuilder para construir a string de saída: Em vez de usar um array de caracteres e convertê-lo para uma string no final, você pode utilizar a classe StringBuilder para construir a string de saída de forma mais eficiente.

Aqui está uma versão modificada do código, incorporando essas melhorias:


char[] low = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        StringBuilder output = new StringBuilder();
        Map<Character, Character> letterMap = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            int newIndexLow = (i + k) % 26;
            int newIndexUpper = (i + k) % 26;
            letterMap.put(low[i], low[newIndexLow]);
            letterMap.put(upper[i], upper[newIndexUpper]);
        }

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                output.append(letterMap.get(c));
            } else {
                output.append(c); // Mantém caracteres especiais
            }
        }

        return output.toString();
*/
public class CaesarCipher {
    private static String caesarCipher(String s, int k) {
        String low = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String substringlow = low.substring(k, 26)+low.substring(0,k);
        String substringup = upper.substring(k, 26)+upper.substring(0,k);
        char[] originalLow = low.toCharArray();
        char[] originalUp = upper.toCharArray();
        char[] cifradolow = substringlow.toCharArray();
        char[] cifradoUp = substringup.toCharArray();
        char[] frase = s.toCharArray();
        char[] saida = new char[frase.length];
        for (int i = 0; i< frase.length ; i++){
            for (int j=0 ; j<26;j++){
                if (Character.isLetter(frase[i])) {
                    if (frase[i] == originalLow[j]) {
                        saida[i] = cifradolow[j];
                    } else if (frase[i] == originalUp[j]) {
                        saida[i] = cifradoUp[j];
                    }
                }else {
                    saida[i] = frase[i];
                }
            }
        }
        return String.valueOf(saida);
    }

    public static void main(String[] args) throws IOException {

        String result = CaesarCipher.caesarCipher("Testando-Cesar-Cipher", 9);
        System.out.println(result);

    }


}
