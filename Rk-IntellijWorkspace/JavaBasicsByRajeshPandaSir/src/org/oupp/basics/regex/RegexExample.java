package org.oupp.basics.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String str="Odisha";
        System.out.println();

        Pattern p=Pattern.compile(".s");
        Matcher m=p.matcher("aas");
        System.out.println(m.matches());

        System.out.println(Pattern.compile("..s").matcher("aas").matches());


        System.out.println(Pattern.matches("..s","aas"));

        System.out.println(Pattern.matches("[0-9^[5-8]]*", "234"));

        System.out.println("aasbc".matches("[a]+[a-z]*"));

        System.out.println(Pattern.matches("[abc]*",""));

        System.out.println(Pattern.matches(".*@.*","abcd@gmail"));
        System.out.println(Pattern.matches(".*@.*","abcd"));
        System.out.println(Pattern.matches(".*@.*[.].*","asdf@gmail.co.in.org")); //One @ one atleast one .[dot]

        System.out.println(Pattern.matches("[^abc]+","zyxwvu")); //any character expect "abc"

        System.out.println(Pattern.matches("[a-z]+","asdfdsf"));
        System.out.println(Pattern.matches("[a-z]+","asdAdsf"));

        System.out.println(Pattern.matches("[A-Z]+","ABCD"));
        System.out.println(Pattern.matches("[A-Z]+","ABCdfdf"));

        System.out.println(Pattern.matches("[A-Za-z]+","asfAgsE"));
        System.out.println(Pattern.matches("[A-Za-z]+","asfAg%4sE"));

        System.out.println(Pattern.matches("[A-Za-z0-9]+","asfAgsE343gd"));

        System.out.println(Pattern.matches("[a-d[p-t]]+","abcpqr"));


        System.out.println(Pattern.matches("[0][7-9][\\d]{9}","07874561212"));
        System.out.println(Pattern.matches("[0][789]{3}[0-9]{7}","09784512325"));

        System.out.println(Pattern.matches(".*\\sdog\\s.*","ABC dog ZYZ"));

//        End with [.com],not contatins blank space, @, there should be no number, _ (underscore) can be at any position
        System.out.println(Pattern.matches("[a-z_]*@[a-z_]*[.]com","_ab_c@gma_il.com"));

        //        End with [.com or .org or .in],not contatins blank space, @, there should be no number, _ (underscore) can be at any position
        System.out.println(Pattern.matches("[a-z_]*@[a-z_]*[.](com|org|in)","_ab_c@gma_il.org"));



    }
}
