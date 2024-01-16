package Quiz2BabaSoru;

public class ArastirmaGorevlisi extends Akademisyen {
	public ArastirmaGorevlisi(String isim, String soyIsim, int yas, boolean ehliyet) {
		super(isim, soyIsim, yas, ehliyet);
	}
	
	@Override
	public double maasHesapla() {
		return getMaas()*1.5;
	}

	@Override
	public void aracAta(String obj) {
		if(obj.equals("Scooter")) {
			Scooter scot = new Scooter("XmX1", "121c",110 ,2);
			setArac(scot);
		}
		if(obj.equals("Bisiklet")) {
			System.out.println("Bu size uygun değil.");
		}
		if(obj.equals("Otomobil")) {
			System.out.println("Profesörler içindir.");
		}
		if(obj.equals("Motosiklet")) {
			System.out.println("Doçentler içindir.");
		}
		
	}
	
	public String toString() {
		return "Araştırma Görevlisi\n"+
				"İsim : "+getIsim()+"\n"+
				"Yas : "+getYas()+"\n"+
				"Soyisim : "+getSoyIsim()+"\n"+
				"Maas : " +maasHesapla()+"\n"+
				"Ehliyet : "+isEhliyet()+"\n"+
				"Sahip olunan Araç : "+getArac();
	}

}
