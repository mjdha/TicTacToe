package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
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
            Scanner input = new Scanner(System.in);
            String playAgain = "";
            while (!playAgain.equalsIgnoreCase("yes") && !playAgain.equalsIgnoreCase("no")) {
                System.out.println("Would you like to play again? \nplease Enter Yes or No: ");
                playAgain = input.nextLine();
            }
            if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Game Over. Thanks for playing. :)");
                break;
            }
        }
    }

    public static void usersInput(ArrayList<String> blocks) {
        Scanner userInput = new Scanner(System.in);

        int i = 0;
        while (i < blocks.size() - 1) {
            String charinput = "";
            if (i % 2 == 0) {
                charinput = "[ X ]";
            } else {
                charinput = "[ O ]";
            }
            while (true) {

                System.out.print("Please choose block: ");
                int intinput = userInput.nextInt();
                userInput.nextLine();

                   if (!blocks.get(intinput).equalsIgnoreCase("[   ]")) {
                     continue;
                     }

                blocks.set(intinput, charinput);
                break;

            }

            System.out.println(blocks.get(7) + " " + blocks.get(8) + " " + blocks.get(9));
            System.out.println(blocks.get(4) + " " + blocks.get(5) + " " + blocks.get(6));
            System.out.println(blocks.get(1) + " " + blocks.get(2) + " " + blocks.get(3));
            i++;
            boolean x = wChecker(blocks, "x");
            boolean o = wChecker(blocks, "o");

            if (x) {
                System.out.println("X Wins.");
                i = blocks.size() - 1;

            }
            if (o) {
                System.out.println("O Wins.");
                i = blocks.size() - 1;
            }

            if ((i == blocks.size() - 1) && (o == false && x == false)) {
                System.out.println("Its a Draw.");
            }
        }

    }

    public static boolean wChecker(ArrayList<String> blocks, String winner) {
        String winning = "[ " + winner + " ]";
        if (blocks.get(7).equalsIgnoreCase(winning) && blocks.get(8).equalsIgnoreCase(winning) && blocks.get(9).equalsIgnoreCase(winning)) {
            return true;
        }

        if (blocks.get(4).equalsIgnoreCase(winning) && blocks.get(5).equalsIgnoreCase(winning) && blocks.get(6).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(1).equalsIgnoreCase(winning) && blocks.get(2).equalsIgnoreCase(winning) && blocks.get(3).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(9).equalsIgnoreCase(winning) && blocks.get(5).equalsIgnoreCase(winning) && blocks.get(1).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(3).equalsIgnoreCase(winning) && blocks.get(5).equalsIgnoreCase(winning) && blocks.get(7).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(7).equalsIgnoreCase(winning) && blocks.get(4).equalsIgnoreCase(winning) && blocks.get(1).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(8).equalsIgnoreCase(winning) && blocks.get(5).equalsIgnoreCase(winning) && blocks.get(2).equalsIgnoreCase(winning)) {
            return true;
        }
        if (blocks.get(9).equalsIgnoreCase(winning) && blocks.get(6).equalsIgnoreCase(winning) && blocks.get(3).equalsIgnoreCase(winning)) {
            return true;
        } else {
            return false;
        }
    }


}







