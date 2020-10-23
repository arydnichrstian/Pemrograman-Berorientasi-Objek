package com.Pengenalan_Inheritance;

public class Main{
 public static void main(String[] args) {
     Hero hero1 = new Hero();
     hero1.name = "Tobirama";
     hero1.display();
     
     HeroStrength hero2 = new HeroStrength();
     hero2.name = "Lucifer";
     hero2.display();

     HeroIntelligent hero3 = new HeroIntelligent();
     hero3.name = "Kakashi";
     hero3.display();
 }
}