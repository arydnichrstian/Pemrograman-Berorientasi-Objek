package Contoh_Abstract;

public abstract class Shape 
{
    private String color;

    public abstract double getArea();

    public String toString() 
    {
        return "Ini adalah bentuk";
    }
}