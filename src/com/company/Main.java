package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> blocks = new ArrayList<>();
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        blocks.add("[   ]");
        usersInput(blocks);
        System.out.println("Game Over. Thanks for playing :)");

    }

    public static void usersInput(ArrayList<String> blocks) {
        Scanner userInput = new Scanner(System.in);

        int i = 0;
        while (i < blocks.size() - 1) {
            System.out.print("Please choose X or O: ");
            String charinput = "[ " + userInput.nextLine() + " ]";
            System.out.print("Please choose block: ");
            int intinput = userInput.nextInt();
            userInput.nextLine();
            blocks.set(intinput, charinput);
            System.out.println(blocks.get(7) + " " + blocks.get(8) + " " + blocks.get(9));
            System.out.println(blocks.get(4) + " " + blocks.get(5) + " " + blocks.get(6));
            System.out.println(blocks.get(1) + " " + blocks.get(2) + " " + blocks.get(3));
            i++;
            boolean x = xChecker(blocks);
            boolean o = oChecker(blocks);
            if (x == true) {
                System.out.println("X Wins.");
                i = blocks.size() - 1;

            }
            if (o == true) {
                System.out.println("O Wins.");
                i = blocks.size() - 1;

            }
            if ((i == blocks.size() - 1) && (o == false && x == false)) {
                System.out.println("Its a Draw.");
            }
        }

    }

    public static boolean xChecker(ArrayList<String> blocks) {
        if (blocks.get(7).equalsIgnoreCase("[ x ]") && blocks.get(8).equalsIgnoreCase("[ x ]") && blocks.get(9).equalsIgnoreCase("[ x ]")) {
            //System.out.println("Player X Wins this game.");
            return true;
        }

        if (blocks.get(4).equalsIgnoreCase("[ x ]") && blocks.get(5).equalsIgnoreCase("[ x ]") && blocks.get(6).equalsIgnoreCase("[ x ]")) {
            return true;
        }
        if (blocks.get(1).equalsIgnoreCase("[ x ]") && blocks.get(2).equalsIgnoreCase("[ x ]") && blocks.get(3).equalsIgnoreCase("[ x ]")) {
            return true;
        }
        if (blocks.get(9).equalsIgnoreCase("[ x ]") && blocks.get(5).equalsIgnoreCase("[ x ]") && blocks.get(1).equalsIgnoreCase("[ x ]")) {
            return true;
        }
        if (blocks.get(3).equalsIgnoreCase("[ x ]") && blocks.get(5).equalsIgnoreCase("[ x ]") && blocks.get(7).equalsIgnoreCase("[ x ]")) {
            return true;
        }
        if (blocks.get(7).equalsIgnoreCase("[ x ]") && blocks.get(4).equalsIgnoreCase("[ x ]") && blocks.get(1).equalsIgnoreCase("[ x ]")) {
            return true;
        }
        if (blocks.get(8).equalsIgnoreCase("[ x ]") && blocks.get(5).equalsIgnoreCase("[ x ]") && blocks.get(2).equalsIgnoreCase("[ x ]")) {
            return true;
        }
        if (blocks.get(9).equalsIgnoreCase("[ x ]") && blocks.get(6).equalsIgnoreCase("[ x ]") && blocks.get(3).equalsIgnoreCase("[ x ]")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean oChecker(ArrayList<String> blocks) {
        if (blocks.get(7).equalsIgnoreCase("[ o ]") && blocks.get(8).equalsIgnoreCase("[ o ]") && blocks.get(9).equalsIgnoreCase("[ o ]")) {
            //System.out.println("Player X Wins this game.");
            return true;
        }

        if (blocks.get(4).equalsIgnoreCase("[ o ]") && blocks.get(5).equalsIgnoreCase("[ o ]") && blocks.get(6).equalsIgnoreCase("[ o ]")) {
            return true;
        }
        if (blocks.get(1).equalsIgnoreCase("[ o ]") && blocks.get(2).equalsIgnoreCase("[ o ]") && blocks.get(3).equalsIgnoreCase("[ o ]")) {
            return true;
        }
        if (blocks.get(9).equalsIgnoreCase("[ o ]") && blocks.get(5).equalsIgnoreCase("[ o ]") && blocks.get(1).equalsIgnoreCase("[ o ]")) {
            return true;
        }
        if (blocks.get(3).equalsIgnoreCase("[ o ]") && blocks.get(5).equalsIgnoreCase("[ o ]") && blocks.get(7).equalsIgnoreCase("[ o ]")) {
            return true;
        }
        if (blocks.get(7).equalsIgnoreCase("[ o ]") && blocks.get(4).equalsIgnoreCase("[ o ]") && blocks.get(1).equalsIgnoreCase("[ o ]")) {
            return true;
        }
        if (blocks.get(8).equalsIgnoreCase("[ o ]") && blocks.get(5).equalsIgnoreCase("[ o ]") && blocks.get(2).equalsIgnoreCase("[ o ]")) {
            return true;
        }
        if (blocks.get(9).equalsIgnoreCase("[ o ]") && blocks.get(6).equalsIgnoreCase("[ o ]") && blocks.get(3).equalsIgnoreCase("[ o ]")) {
            return true;
        } else {
            return false;
        }
    }


}





