package com.company;
import java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String []a;
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Число строк: ");
        n = scn.nextInt();
        a = new String [n];
        for (int i = 0; i <= n; i++)
            {
                if (isDoubloon(scn.nextLine())) {
                    System.out.println("ДА");
                }
                else {
                    System.err.println("НЕТ");
                }
                }
            }
        public static boolean isDoubloon(final String s) {
            final String l = s.toLowerCase();
            for (int i = 0; i < l.length(); i++) {
                int count = 0;
                for (int j = 0; j < l.length(); j++) {
                    if (l.charAt(i) == l.charAt(j)) {
                        count++;
                        if (2 < count) {
                            return false;
                        }
                    }
                }
                if (1 == count) {
                    return false;
                }
            }
            return true;
        }
}
