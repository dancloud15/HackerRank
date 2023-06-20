package br.com.dna.hackerrank.firstweek;

import com.sun.jdi.IntegerValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class XORString {



    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }

//    public static void main(String[] args) throws IOException {



//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine());
//        int m = Integer.parseInt(bufferedReader.readLine());
//        int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        int b =Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        System.out.println(a^b);
//        System.out.println(n ^ m);
//        bufferedReader.close();
//    }
}
