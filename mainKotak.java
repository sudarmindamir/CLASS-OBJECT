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
