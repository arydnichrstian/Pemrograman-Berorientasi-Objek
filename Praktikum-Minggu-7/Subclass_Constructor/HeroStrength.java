package com.Subclass_Constructor;

public class HeroStrength extends Hero{
	
	HeroStrength(String name, double defencePower){
		super(name, defencePower);
	}
	
	HeroStrength(String name){
		super(name);
	}

}