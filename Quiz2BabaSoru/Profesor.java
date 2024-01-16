package Quiz2BabaSoru;

public class Profesor extends Akademisyen {

	public Profesor(String isim, String soyIsim, int yas, boolean ehliyet) {
		super(isim, soyIsim, yas, ehliyet);
	
	}

	@Override
	public double maasHesapla() {
		
		return getMaas()*5;
	}

	@Override
	public void aracAta(String arac) {
		if(arac.equals("Otomobil")) {
			Otomobil oto = new Otomobil("Toyota", "Corolla",130 ,4);
			setArac(oto);
		}
		if(arac.equals("Bisiklet")) {
			System.out.println("Araştırma Görevlilieri içinidir.");
		}
		if(arac.equals("Scooter")) {
			System.out.println("Doktor Öğretim görevlileri içindir.");
		}
		if(arac.equals("Motosiklet")) {
			System.out.println("Doçentler içindir.");
		}
		
	}
	
	public String toString() {
		return "Profesör\n"+
				"İsim : "+getIsim()+"\n"+
				"Yas : "+getYas()+"\n"+
				"Soyisim : "+getSoyIsim()+"\n"+
				"Maas : " +maasHesapla()+"\n"+
				"Ehliyet : "+isEhliyet()+"\n"+
				"Sahip olunan Araç : "+getArac();
	}

}
