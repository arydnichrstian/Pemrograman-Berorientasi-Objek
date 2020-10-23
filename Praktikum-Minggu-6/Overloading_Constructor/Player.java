package com.Overloading_Constructor;

public class Player {
    private String name;
    private static int jumlahPlayer;

    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    Player(){
        Player.jumlahPlayer++;
        this.name = "Pemain" + Player.jumlahPlayer;
    }

    void show(){
        System.out.println("Nama: " + this.name);
    }
}