package Quiz2BabaSoru;

public class Docent extends Akademisyen {

	public Docent(String isim, String soyIsim, int yas, boolean ehliyet) {
		super(isim, soyIsim, yas, ehliyet);
	
	}

	@Override
	public double maasHesapla() {
		
		return getMaas()*3;
	}

	@Override
	public void aracAta(String arac) {
		if(arac.equals("Motosiklet")) {
			Motosiklet moto = new Motosiklet("Honda", "CBR250", 1500, 2);
			setArac(moto);
		}
		if(arac.equals("Otomobil")) {
			System.out.println("Profesör olunca alabilirsiniz.");
		}
		if(arac.equals("Scooter")) {
			System.out.println("Araştırma görevlileri içindir.");
		}
		if(arac.equals("Bisiklet")) {
			System.out.println("Doktor öğretim üyesi görevlileri içindir.");
		}
	}

	public String toString() {
		return "Doçent\n"+
				"İsim : "+getIsim()+"\n"+
				"Yas : "+getYas()+"\n"+
				"Soyisim : "+getSoyIsim()+"\n"+
				"Maas : " +maasHesapla()+"\n"+
				"Ehliyet : "+isEhliyet()+"\n"+
				"Sahip olunan Araç : "+getArac();
	}
}
