package org.simmerman.zork.command;


import java.util.Scanner;

public class HotKey {

    private static Scanner input = new Scanner(System.in);

    public static void enterContinue() {
        input.nextLine();
        input.hasNextLine();
    }

    public static void skipLines() {
        int Lines = 0;
        while (Lines < 50) {
            System.out.println();
            Lines = Lines + 1;
        }
    }

    public static void threeLineSkip() {
        int Lines3 = 0;
        while (Lines3 < 3) {
            System.out.println();
            Lines3 = Lines3 + 1;
        }
    }
}
