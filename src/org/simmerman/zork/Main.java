package org.simmerman.zork;

//test

import org.simmerman.zork.command.HotKey;
import org.simmerman.zork.items.Items;
import org.simmerman.zork.rooms.RoomOne;

public class Main {
    public static void main(String[] args) {
        Items.initializeItems();
        System.out.println("Trapped With Precision");
        HotKey.threeLineSkip();
        System.out.println("Press Enter twice to begin game.");
        HotKey.enterContinue();
        HotKey.skipLines();
        RoomOne.introScene();
        System.out.println("You move on to room 2.");

    }
}
