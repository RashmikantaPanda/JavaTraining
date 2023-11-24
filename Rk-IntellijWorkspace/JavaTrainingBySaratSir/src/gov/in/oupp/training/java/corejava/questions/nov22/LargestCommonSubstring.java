package gov.in.oupp.training.java.corejava.questions.nov22;

/*
* Given two strings X and Y. Find the longest common subsequence (LCS).
* The LCS of two strings is subsequence that is common to both strings . For example , the LCS of
* the strings "AGGTAB" and "GXTXAYB" is "GTAB". Which is a subsequence of both strings
* */

import java.util.ArrayList;

public class LargestCommonSubstring {
    public static String subString(String str1, String str2) {
        String str = "";
 /*       Set<String> subStringSet = new LinkedHashSet<>(); */
        ArrayList<Character> subStringList = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
            /*        subStringSet.add(String.valueOf(str1.charAt(i))); */
                    if (!subStringList.contains(str1.charAt(i))) {
                        subStringList.add(str1.charAt(i));
                    }
                }
            }
        }
   /*
        for (String s : subStringSet) {
            str = str + s;
        }
   */
        for (Character s : subStringList) {
            str = str + s;
        }
        return str;
    }

    public static void main(String[] args) {
        String str1 = "GXTXAYB";
        String str2 = "AGGTAB";

        System.out.println("First string is : " + str1);
        System.out.println("Second string is : " + str2);
        System.out.println("Largest common substring is : " + subString(str1, str2));
    }
}
