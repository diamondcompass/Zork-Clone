package org.simmerman.zork.items;

import org.simmerman.zork.command.HotKey;

public class Inventory {

    public static void viewInventoryOne() {
        if (Items.doorKey == 0 && Items.onyxKey == 0 && Items.paperStack == 0 && Items.matchBox == 1) {
            System.out.println("- Match Box -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else if (Items.paperStack == 1 && Items.onyxKey == 0 && Items.doorKey == 0 && Items.matchBox == 0) {
            System.out.println("- Papers -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else if (Items.doorKey == 0 && Items.onyxKey == 1 && Items.paperStack == 0 && Items.matchBox == 0) {
            System.out.println("- Onyx Key -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else if (Items.doorKey == 1 && Items.onyxKey == 1 && Items.paperStack == 0 && Items.matchBox == 0) {
            System.out.println("- Onyx Key - Door Key -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else if (Items.onyxKey == 1 && Items.matchBox == 1 && Items.paperStack == 0 && Items.doorKey == 0) {
            System.out.println("- Onyx Key - Match Box -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else if (Items.onyxKey == 1 && Items.doorKey == 1 && Items.matchBox == 1 && Items.paperStack == 0) {
            System.out.println("- Onyx Key - Door Key - Match Box -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else if (Items.onyxKey == 0 && Items.paperStack == 1 && Items.matchBox == 1 && Items.doorKey == 0) {
            System.out.println("- Papers - Match Box -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else if (Items.onyxKey == 1 && Items.paperStack == 1 && Items.matchBox == 0 && Items.doorKey == 0) {
            System.out.println("- Onyx Key - Papers -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else if (Items.onyxKey == 1 && Items.matchBox == 1 && Items.paperStack == 1 && Items.doorKey == 0) {
            System.out.println("- Onyx Key - Papers - Match Box -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else if (Items.doorKey == 1 && Items.paperStack == 1 && Items.matchBox == 1 && Items.onyxKey == 1) {
            System.out.println("- Onyx Key - Door Key - Papers - Match Box -");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
        else {
            System.out.println("Nothing in inventory.");
            System.out.println("Press Enter to continue.");
            HotKey.enterContinue();
            HotKey.skipLines();
        }
    }
}
