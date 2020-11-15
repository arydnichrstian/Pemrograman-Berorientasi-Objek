
abstract class Suara {

  public abstract void animalSound();

  public void sleep() {
    System.out.println("\nZzz...");
  }
}

class Babi extends Suara {
	  public void animalSound() {
		  
	    System.out.println("Si Babi mengatakan: wee wee");
	  }
	}

public class Abstract_Class {
	  public static void main(String[] args) {
	    Babi myPig = new Babi(); 
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}
