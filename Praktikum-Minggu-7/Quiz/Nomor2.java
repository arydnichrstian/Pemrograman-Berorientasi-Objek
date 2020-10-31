package com.Quiz;

public class Nomor2 extends Nomor1 
{
	
    public Nomor2 ()
    {
        super();
    }
    
    
    public void getData() 
    {
        System.out.println("Bilangan 1 = " + this.a +
                "\nBilangan 2 = " + this.b +
                "\nBilangan 3 = " + this.c +
                "\n\nHasil penjumlahan dari 3 buah bilangan tersebut adalah " + (this.a + this.b + this.c) + "\n");
    }
    
}