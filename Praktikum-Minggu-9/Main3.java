package PBOreg;

import java.util.ArrayList;

class DataMobil {
    private ArrayList<String> mobil = new ArrayList<String>();

    public void setMobil(String data){
        this.mobil.add(data);
    }
    public void viewAll(){
        System.out.println("List mobil");
        for(int i =0;i<mobil.size();i++){
            System.out.println("- "+mobil.get(i));
        }
    }
    public void viewAll2(){
        System.out.println("\nList Mobil");
        for(String data:mobil){
            System.out.println("- "+data);
        }
    }
    public void cariData(String cari){
        if (mobil.contains(cari)){
            System.out.println("Data ketemu");
        } else {
            System.out.println("gak ketemu");
        }
    }
    public void gantiMobil(int index, String data){
        this.mobil.set(index, data);
    }
    public void gantiMobil2(String dataAsli, String dataGanti){
        int i;
        if (mobil.contains(dataAsli)){
            i = mobil.indexOf(dataAsli);
            mobil.set(i,dataGanti);
        }else{
            System.out.println("tidak ketemu, gabisa diganti");
        }
    }

    public void hapusMobil2(String dataAsli){
        int i;
        if (mobil.contains(dataAsli)){
            i = mobil.indexOf(dataAsli);
            mobil.remove(i);
        }else{
            System.out.println("ga ketemu, gabisa dihapus");
        }
    }

}

public class Main3 {

    public static void main(String[] args) {
        // write your code here
        DataMobil dm = new DataMobil();
        System.out.println("Daftarnya:");
        dm.setMobil("Kijang");
        dm.setMobil("Ayla");
        dm.setMobil("Grand Livina");
        //dm.viewAll();
        dm.viewAll2();
        dm.gantiMobil2("Kijang","Suburban");
        dm.viewAll2();
        dm.hapusMobil2("Ayla");
        dm.viewAll2();

    }
    
}