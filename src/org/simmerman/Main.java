package org.simmerman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String Start, Go, Drawer, End;

        System.out.println("        Discord        ");
        System.out.println("");
        System.out.println("Would you like to begin the adventure?");
        System.out.print(" ");
        Start = keyboard.next();

        if (Start.equalsIgnoreCase("yes")) {
            int linesLeft = 40;
            while (linesLeft > 0) {
                System.out.println();
                linesLeft = linesLeft - 1;
            }
            System.out.println("    You wake up in a poorly lit room with very little furniture and barred 'windows'. ");
            System.out.println("In the corner of the room sits a derelict 'chest' that looks like it hasn't been");
            System.out.println("opened in centuries. On the opposite end of the room rests a rotten oak-wood 'desk'.");
            System.out.println("What do you inspect first?");
            System.out.print(" ");
            Go = keyboard.next();

            if (Go.equalsIgnoreCase("desk")) {
                System.out.println("You walk over to the desk to see a stack of blank 'papers' on top of it and");
                System.out.println("and a 'drawer' on it's front.");
                System.out.print(" ");
                Drawer = keyboard.next();

                if (Drawer.equalsIgnoreCase("drawer")) {
                    System.out.println("You open the drawer to find a small onyx key.");
                    System.out.println("Type return to continue.");
                    System.out.print(" ");
                    Start = keyboard.next();
                }
            }

            else if (Go.equalsIgnoreCase("chest")) {
                System.out.println("You walk over to the chest to see a 'lock' on the front of it.");
                System.out.print(" ");
            }
        }
        else if (Start.equalsIgnoreCase("return"));
        System.out.println("You are back in the center of the room.");
    }
}
