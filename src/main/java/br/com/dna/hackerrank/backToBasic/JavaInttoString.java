package br.com.dna.hackerrank.backToBasic;

import java.io.*;
import java.util.*;
import java.util.Scanner;

/*
Você recebe um número inteiro e deve convertê-lo em uma string.

Por favor, complete o código que está parcialmente preenchido no editor.
Se o seu código converter com sucesso o número em uma string,
ele imprimirá "Good job". Caso contrário, imprimirá "Wrong answer".

O valor pode variar de a , inclusive.

Entrada de Exemplo 0

100
Saída de Exemplo 0

Good job

 */
public class JavaInttoString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = String.valueOf(n);

        System.out.println(n == Integer.parseInt(s) ? "Good job" : "Wrong answer");
    }
}
