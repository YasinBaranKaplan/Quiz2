package Quiz2BabaSoru;

public class DoktorOgretimUyesi extends Akademisyen{
	
	public DoktorOgretimUyesi(String isim, String soyIsim, int yas, boolean ehliyet) {
		super(isim, soyIsim, yas, ehliyet);
	}

	@Override
	public double maasHesapla() {
	
		return getMaas()*2;
	}

	@Override
	public void aracAta(String arac) {
		if(arac.equals("Bisiklet")) {
			Bisiklet bike = new Bisiklet("Salcano", "Bix10", 0, 2);
			setArac(bike);
		}
		if(arac.equals("Otomobil")) {
			System.out.println("Profesör olunca alabilirsiniz.");
		}
		if(arac.equals("Scooter")) {
			System.out.println("Araştırma görevlileri içindir.");
		}
		if(arac.equals("Motosiklet")) {
			System.out.println("Doçentler içindir.");
		}
	}
	
	public String toString() {
		return "Doktor Öğretim üyesi\n"+
				"İsim : "+getIsim()+"\n"+
				"Yas : "+getYas()+"\n"+
				"Soyisim : "+getSoyIsim()+"\n"+
				"Maas : " +maasHesapla()+"\n"+
				"Ehliyet : "+isEhliyet()+"\n"+
				"Sahip olunan Araç : "+getArac();
	}

}
