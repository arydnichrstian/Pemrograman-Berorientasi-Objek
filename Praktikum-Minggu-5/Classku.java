class Classku {
	
    public int x = 5; 
    int y = 15; 
    private int z = 20;
    
    public int tampilkan_X(){
        return this.x;
    }
    
    public int tampilkan_Y(){
        return this.y;
    }

    public int tampilkan_Z(){
        return this.z;
    }
    
    public static void main(String[] args) {
    	
    	Classku cetak = new Classku();
    	
    	System.out.println("Nilai X = " + cetak.tampilkan_X());
    	System.out.println("Nilai Y = " + cetak.tampilkan_Y());
    	System.out.println("Nilai Z = " + cetak.tampilkan_Z());
    }
}