package org.oupp.basics.basics;

public class PerfectNoCheck {

    public static boolean checkPerfectNo(int n) {
        int sumOfFact = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sumOfFact += i;
            }
        }
        if (sumOfFact == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (checkPerfectNo(i)) {
                System.out.println(i + "    ");
                System.nanoTime();
            }

        }

    }
}
