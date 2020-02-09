package com.company;

import java.util.Scanner;

public class Main {
    static String[][] nums = {{"0", "1", "2"}, {"3", "4", "5"}, {"6", "7", "8"}};
    static int chek=1;

    public static void main(String[] args) {
        boolean b = false;
        vuvod();
        Scanner in = new Scanner(System.in);
        System.out.println("Do you wanna play the game? Choose a digit from 0 to 8:");
        while (!Testik(nums)) {
            System.out.println("Choose a free digit: ");
            String dig = in.next();
            if (dig.equals("x") || dig.equals("o")){
                System.out.println("You should choose a digit from list");
            }
            else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (dig.equals(nums[i][j])) {
                            if(chek%2 != 0){
                                nums[i][j] = "x";}
                            else{
                                nums[i][j] = "o";}
                            vuvod();
                            chek++;
                        }
                    }
                }
            }
            if(TstOver(nums)){
                continue;
            }
            else{
                System.out.println("Eto gg");
                return;
            }
        }
        if(chek%2 != 0){
            System.out.println("Player O WIN");}
        else{
            System.out.println("Player X WIN");}
    }


    public static void vuvod() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(' ' + nums[i][j] + ' ');
            }
            System.out.println();
        }
    }

    static boolean Testik(String[][] tst) {
        if (tst[0][0].equals(tst[0][1]) && tst[0][0].equals(tst[0][2])){
            return true;
        }
        else if( tst[1][0].equals(tst[1][1]) && tst[1][0].equals(tst[1][2])){
            return true;
        }
        else if( tst[2][0].equals(tst[2][1]) && tst[2][0].equals(tst[2][2])){
            return true;
        }
        else if( tst[0][0].equals(tst[1][0]) && tst[0][0].equals(tst[2][0])){
            return true;
        }
        else if( tst[0][1].equals(tst[1][1]) && tst[0][1].equals(tst[2][1])){
            return true;
        }
        else if( tst[0][2].equals(tst[1][2]) && tst[0][2].equals(tst[2][2])){
            return true;
        }
        else if( tst[0][0].equals(tst[1][1]) && tst[0][0].equals(tst[2][2])){
            return true;
        }
        else if( tst[0][2].equals(tst[1][1]) && tst[0][2].equals(tst[2][0])){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean TstOver(String[][] tst) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tst[i][j].equals("0") || tst[i][j].equals("1") || tst[i][j].equals("2") || tst[i][j].equals("3") || tst[i][j].equals("4") || tst[i][j].equals("5") || tst[i][j].equals("6") || tst[i][j].equals("7") || tst[i][j].equals("8")) {
                    return true;
                }
            }
        }
        return false;
    }


}

