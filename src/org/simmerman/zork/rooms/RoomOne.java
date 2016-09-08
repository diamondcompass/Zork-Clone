package org.simmerman.zork.rooms;

import org.simmerman.zork.command.HotKey;
import org.simmerman.zork.items.Inventory;
import org.simmerman.zork.items.Items;

import java.util.Scanner;

public class RoomOne {
    static void introScene() {
        Scanner input = new Scanner(System.in);
        String afterInput, takeItem;
        takeItem = "This";
        int a;
        a = 0;
        System.out.println("You wake up in a poorly lit room with only a small amount of furniture.");
        System.out.println("Press Enter to continue.");
        HotKey.enterContinue();
        while (Items.doorKey == 0 || Items.doorKey == 1) {
            HotKey.skipLines();
            System.out.println("In the corner of the room rests a derelict 'chest' that looks like is hasn't been");
            System.out.println("opened in centuries. Adjacent to the chest is a large wooden 'door'.");
            System.out.println("On the opposite end of the room is a rotten oak-wood 'desk' next");
            System.out.println("to some barred 'windows'.");
            System.out.print(" ");
            afterInput = input.nextLine();
            if (afterInput.equalsIgnoreCase("inventory")) {
                Inventory.viewInventoryOne();
            }
            else if (afterInput.equalsIgnoreCase("desk")){
                while (a < 100) {
                    HotKey.skipLines();
                    takeItem = "None";
                    System.out.println("There is a stack of blank 'papers' on top of the desk and a small 'drawer' on the front.");
                    System.out.println("You also may 'return' to the center of the room.");
                    System.out.print(" ");
                    afterInput = input.nextLine();

                    if (afterInput.equalsIgnoreCase("drawer") && Items.matchBox == 0 || afterInput.equalsIgnoreCase("drawer") && Items.onyxKey == 0) {
                        while (Items.onyxKey == 0 || Items.matchBox == 0) {
                            if (takeItem.equalsIgnoreCase("close")) {
                                break;
                            }
                            while (Items.onyxKey == 0 && Items.matchBox == 0) {
                                if (afterInput.equalsIgnoreCase("drawer") && Items.onyxKey == 0 && Items.matchBox == 0) {
                                    HotKey.skipLines();
                                    System.out.println("Within the drawer is a small 'key' and a box of 'matches'.");
                                    System.out.println("You may 'take' an item or you may 'close' the drawer and return to the front of the desk.");
                                    takeItem = input.nextLine();

                                    if (takeItem.equalsIgnoreCase("take key")) {
                                        HotKey.skipLines();
                                        Items.onyxKey = 1;
                                        System.out.println("'You have obtained an Onyx Key!'");
                                        System.out.println("Onyx Key placed into 'inventory'.");
                                        System.out.println("Press Enter to continue.");
                                        HotKey.enterContinue();
                                    } else if (takeItem.equalsIgnoreCase("take matches")) {
                                        HotKey.skipLines();
                                        Items.matchBox = 1;
                                        System.out.println("'You have obtained a Match Box!'");
                                        System.out.println("Match Box placed into 'inventory'.");
                                        System.out.println("Press Enter to continue.");
                                        HotKey.enterContinue();
                                    } else if (takeItem.equalsIgnoreCase("key")) {
                                        HotKey.skipLines();
                                        System.out.println("It is a small black key comprised of some sort of polished stone.");
                                        System.out.println("Press Enter to continue.");
                                        HotKey.enterContinue();
                                    } else if (takeItem.equalsIgnoreCase("matches")) {
                                        HotKey.skipLines();
                                        System.out.println("A worn box of matches, though not too worn for future use.");
                                        System.out.println("Press Enter to continue.");
                                        HotKey.enterContinue();
                                    } else if (takeItem.equalsIgnoreCase("close")) {
                                        break;
                                    } else {
                                        HotKey.skipLines();
                                    }
                                } else {
                                    HotKey.skipLines();
                                    break;
                                }
                            }
                            while (!(takeItem.equalsIgnoreCase("close")) && Items.onyxKey == 1 && Items.matchBox == 0) {
                                if (afterInput.equalsIgnoreCase("drawer") && Items.onyxKey == 1 && Items.matchBox == 0) {
                                    HotKey.skipLines();
                                    System.out.println("Within the drawer remains a box of 'matches'.");
                                    System.out.println("You may 'take' an item or you may 'close' the drawer and return to the front of the desk.");
                                    takeItem = input.nextLine();

                                    if (takeItem.equalsIgnoreCase("take matches")) {
                                        HotKey.skipLines();
                                        Items.matchBox = 1;
                                        System.out.println("'You have obtained a Match Box!'");
                                        System.out.println("Match Box placed into 'inventory'.");
                                        System.out.println("Press Enter to continue.");
                                        HotKey.enterContinue();
                                    } else if (takeItem.equalsIgnoreCase("matches")) {
                                        HotKey.skipLines();
                                        System.out.println("A worn box of matches, though not too worn for future use.");
                                        System.out.println("Press Enter to continue.");
                                        HotKey.enterContinue();
                                    } else if (takeItem.equalsIgnoreCase("close")) {
                                        break;
                                    } else {
                                        HotKey.skipLines();
                                    }
                                }
                                else {
                                    HotKey.skipLines();
                                    break;
                                }
                            }
                            while (!(takeItem.equalsIgnoreCase("close")) && Items.onyxKey == 0 && Items.matchBox == 1) {
                                if (!(afterInput.equalsIgnoreCase("close")) && Items.onyxKey == 0 && Items.matchBox == 1) {
                                    HotKey.skipLines();
                                    System.out.println("Within the drawer remains a small 'key'.");
                                    System.out.println("You may 'take' an item or you may 'close' the drawer and return to the front of the desk.");
                                    takeItem = input.nextLine();

                                    if (takeItem.equalsIgnoreCase("take key")) {
                                        HotKey.skipLines();
                                        Items.onyxKey = 1;
                                        System.out.println("'You have obtained an Onyx Key!'");
                                        System.out.println("Onyx Key placed into 'inventory'.");
                                        System.out.println("Press Enter to continue.");
                                        HotKey.enterContinue();
                                    } else if (takeItem.equalsIgnoreCase("key")) {
                                        HotKey.skipLines();
                                        System.out.println("It is a small black key comprised of some sort of polished stone.");
                                        System.out.println("Press Enter to continue.");
                                        HotKey.enterContinue();
                                    } else if (takeItem.equalsIgnoreCase("close")) {
                                        break;
                                    } else {
                                        HotKey.skipLines();
                                    }
                                } else {
                                    HotKey.skipLines();
                                    break;
                                }
                            }
                        }
                    }
                    else if (afterInput.equalsIgnoreCase("papers")) {
                        HotKey.skipLines();
                        System.out.println("Sifting through the papers provides no insight, as the are blank.");
                        System.out.println("Press Enter to continue.");
                        HotKey.enterContinue();
                    }
                    else if (afterInput.equalsIgnoreCase("take papers") && Items.paperStack == 0) {
                        HotKey.skipLines();
                        Items.paperStack = 1;
                        System.out.println("'You obtained some Papers!'");
                        System.out.println("Placed Papers into 'inventory'.");
                        System.out.println("Press Enter to continue.");
                        HotKey.enterContinue();
                    }
                    else if (afterInput.equalsIgnoreCase("inventory")) {
                        Inventory.viewInventoryOne();
                    }
                    else if (afterInput.equalsIgnoreCase("drawer") && Items.matchBox == 1 && Items.onyxKey == 1) {
                        System.out.println("Nothing remains within the drawer.");
                        System.out.println("Press Enter to continue.");
                        HotKey.enterContinue();
                    }
                    else if (afterInput.equalsIgnoreCase("return")) {
                        HotKey.skipLines();
                        break;
                    }
                }
            }
            else if (afterInput.equalsIgnoreCase("chest")) {
                while (a < 100) {
                    HotKey.skipLines();
                    System.out.println("On the front of the chest is a 'lock' and on top is a 'mural'.");
                    System.out.println("You also may 'return' to the center of the room.");
                    afterInput = input.nextLine();

                    if (afterInput.equalsIgnoreCase("lock")) {
                        HotKey.skipLines();
                        System.out.println("The lock requires a key.");
                        System.out.println("You can attempt to unlock it with an item from your 'inventory' or 'return' to the center of the room.");
                        afterInput = input.nextLine();

                        if (afterInput.equalsIgnoreCase("onyx key") && Items.doorKey == 0) {
                            HotKey.skipLines();
                            System.out.println("You unlocked the chest with the Onyx Key.");
                            System.out.println("Within the chest is another key.");
                            System.out.println("'Obtained Door Key!'");
                            Items.doorKey = 1;
                            System.out.println("Placed Door Key into 'inventory'.");
                            System.out.println("Press Enter to continue.");
                            HotKey.enterContinue();
                            HotKey.skipLines();
                            break;
                        }
                        else if (afterInput.equalsIgnoreCase("inventory")) {
                            Inventory.viewInventoryOne();
                        }
                        else if (afterInput.equalsIgnoreCase("return")) {
                            HotKey.skipLines();
                        }
                        else {
                            HotKey.skipLines();
                        }
                    }
                    else if (afterInput.equalsIgnoreCase("inventory")) {
                        Inventory.viewInventoryOne();
                    }
                    else if (afterInput.equalsIgnoreCase("mural")) {
                        HotKey.skipLines();
                        System.out.println("The mural depicts the silhouette of a man lifting up a large blade towards a lightning storm.");
                        System.out.println("Press Enter to continue.");
                        HotKey.enterContinue();
                    }
                    else if (afterInput.equalsIgnoreCase("return")) {
                        break;
                    }
                    else {
                        HotKey.skipLines();
                    }
                }
            }
            else if (afterInput.equalsIgnoreCase("windows")) {
                HotKey.skipLines();
                System.out.println("The windows are barred in a manner that you cannot open them without the necessary tools.");
                System.out.println("Press Enter to continue.");
                HotKey.enterContinue();
            }
            else if (afterInput.equalsIgnoreCase("door")) {
                while (a < 100) {
                    HotKey.skipLines();
                    System.out.println("The door is locked and requires a key.");
                    System.out.println("You can attempt to unlock it with an item from your 'inventory' or 'return' to the center of the room.");
                    afterInput = input.nextLine();

                    if (afterInput.equalsIgnoreCase("door key") && Items.doorKey == 1) {
                        HotKey.skipLines();
                        System.out.println("You unlock and open the door with the Door Key.");
                        System.out.println("Press Enter to continue.");
                        HotKey.enterContinue();
                        Items.doorKey = 3;
                        break;
                    }
                    else if (afterInput.equalsIgnoreCase("inventory")) {
                        Inventory.viewInventoryOne();
                    }
                    else if (afterInput.equalsIgnoreCase("return")) {
                        break;
                    }
                    else {
                        HotKey.skipLines();
                    }
                }
            }
            else {
                HotKey.skipLines();
            }
        }
    }
}
