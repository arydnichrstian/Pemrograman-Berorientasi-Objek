
interface Binatang {
  public void animalSound(); 
  public void sleep(); 
}

class Pig_ implements Binatang {
  public void animalSound() {

    System.out.println("The pig says: Ngik ngok");
  }
  
  public void sleep() {

    System.out.println("\nHoaammm");
  }
}

public class Single_Interface {
  public static void main(String[] args) {
    Pig_ myPig = new Pig_();
    myPig.animalSound();
    myPig.sleep();
  }
}
