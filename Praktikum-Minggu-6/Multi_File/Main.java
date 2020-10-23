package com.MultiFile;

import com.MultiFile.Console;

class Main{
    public static void main(String[] args) {
        Player player1 = new Player("Madara");
        Player player2 = new Player("itachi");
        Player player3 = new Player("Sasuke");
        player1.show();
        player2.show();
        player3.show();

        Console.log("Hi");
        Console.log("Hallo");
    }
}
