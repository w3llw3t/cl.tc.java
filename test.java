package com.company;
import java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Введите число строк: ");
        int n = scn.nextInt();
        String[] a = new String [n];
        for (int i = 0; i <= n; i++)
        {
            if (isDoubloon(scn.nextLine())) {
                System.out.println("ДА");
            }
            else {
                System.out.println("НЕТ");
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
