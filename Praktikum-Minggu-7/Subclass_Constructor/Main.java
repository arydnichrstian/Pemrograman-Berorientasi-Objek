package com.Subclass_Constructor;

public class Main{
	public static void main(String[] args) {
		Hero hero1 = new Hero("Esmeralda", 10);
		hero1.display();
		
		HeroStrength hero2 = new HeroStrength("Alucard", 15);
		hero2.display();
		
		HeroStrength hero3 = new HeroStrength("Harith", 20);
		hero3.display();
	}
	
}