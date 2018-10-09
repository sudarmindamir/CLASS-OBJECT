    public class main {	
    
    //UNTUK KOTAK	
    public class mainKotak {
	public static void main(String[] args) {

				kotak kotakHitam = new kotak();
				
				kotakHitam.setpanjang(8);
				kotakHitam.setlebar(4);
				
				kotakHitam.hitungLuas();
				kotakHitam.hitungKeliling();
			
				System.out.println("Panjang : " + kotakHitam.getpanjang());
				System.out.println("Lebar : " + kotakHitam.getlebar());
				System.out.println("LuasKotak : " + kotakHitam.getluas());
				System.out.println("KelilingKotak " + kotakHitam.getkeliling());
		

	}

}

    
//UNTUK NODE
public class mainNode {

	public static void main(String[] args) {
		Node mhluk = new Node();
		mhluk.setLabel("Sudarmin ");
		mhluk.setValue(4);
		
		
		System.out.println("Banyak pacar "+ mhluk.getLabel());
		System.out.println("Jumlah : " + mhluk.getValue());
	}

}
//UNTUK MAHASISWA
public class mainMahasiswa {

	public static void main(String[] args) {
		Mahasiswa mhluk = new Mahasiswa();
		mhluk.setNama("Uchiha Sudarmin");
		mhluk.setNim("D0217302");
		mhluk.setAlamat("Planet Saiya");
		mhluk.setGolonganDarah("A");
		mhluk.setStatus("masih Mahasiswa");
		mhluk.setTinggiBadan(165);
		mhluk.setBeratBadan(48);
		System.out.println("-----------tadaaaaaaaaaaaaaaa------------");
		System.out.println("Nama : " + mhluk.getNama());
		System.out.println("Nim : " + mhluk.getNim());
		System.out.println("Alamat : " + mhluk.getAlamat());
		System.out.println("GolonganDarah : " + mhluk.getGolonganDarah());
		System.out.println("Status : " + mhluk.getStatus());
		System.out.println("TinggiBadan : " + mhluk.getTinggiBadan());
		System.out.println("BeratBadan : " + mhluk.getBaratBadan());


	}
	}

}
//UNTUK STACK
    public class mainMahasiswa {

    	public static void main(String[] args) {
    		Mahasiswa mhluk = new Mahasiswa();
    		mhluk.setNama("Uchiha Sudarmin");
    		mhluk.setNim("D0217302");
    		mhluk.setAlamat("Planet Saiya");
    		mhluk.setGolonganDarah("A");
    		mhluk.setStatus("masih Mahasiswa");
    		mhluk.setTinggiBadan(165);
    		mhluk.setBeratBadan(48);
    		System.out.println("-----------tadaaaaaaaaaaaaaaa------------");
    		System.out.println("Nama : " + mhluk.getNama());
    		System.out.println("Nim : " + mhluk.getNim());
    		System.out.println("Alamat : " + mhluk.getAlamat());
    		System.out.println("GolonganDarah : " + mhluk.getGolonganDarah());
    		System.out.println("Status : " + mhluk.getStatus());
    		System.out.println("TinggiBadan : " + mhluk.getTinggiBadan());
    		System.out.println("BeratBadan : " + mhluk.getBaratBadan());



    	}

    }
