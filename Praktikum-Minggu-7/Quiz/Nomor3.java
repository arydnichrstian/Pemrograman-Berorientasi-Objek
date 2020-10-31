package com.Quiz;

public class Nomor3 extends Nomor1 
{
	
    public Nomor3() 
    {
        super();
    }
    
    private double bilMax() 
    {
        double maks = -9999999;
        if (this.a > maks) {
            maks = this.a;
        }
        if (this.b > maks) {
            maks = this.b;
        }
        if (this.c > maks){
            maks = this.c;
        }
        return maks;
    }
    
    private double bilMin() 
    {
    	double mini = 9999999;
    	if (this.a < mini) {
            mini = this.a;
        }
        if (this.b < mini) {
            mini = this.b;
        }
        if (this.c < mini){
            mini = this.c;
        }
        return mini;
    }
    
    public void getData() 
    {
        System.out.println("\nBilangan 1 = " + this.a +
                "\nBilangan 2 = " + this.b +
                "\nBilangan 3 = " + this.c +
                "\n\nNilai Maximum = " + this.bilMax() +
                "\nNilai Minimum = " + this.bilMin() + "\n");
    }
    
}