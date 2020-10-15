abstract class person {

  public String fname = "Aryadani";
  public int age = 19;
  public abstract void study();
}

class student extends person {
  public int graduationYear = 2019;
  public void study() {
    System.out.println("Belajar sepanjang hari");
  }
}

class Abstract_Method {
  public static void main(String[] args) {
    student myObj = new student();

    System.out.println("Nama: " + myObj.fname);
    System.out.println("Umur: " + myObj.age);
    System.out.println("Tahun Kelulusan: " + myObj.graduationYear);
    myObj.study();
  }
}