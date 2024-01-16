package Quiz2BabaSoru;

public class ArastirmaGorevlisi extends Akademisyen {
	private double maas=17002;
	public ArastirmaGorevlisi(String isim, String soyIsim, int yas, boolean ehliyet, Arac arac) {
		super(isim, soyIsim, yas, ehliyet, arac);
	}
	

	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maasHesapla();
	}
	@Override
	public double maasHesapla() {
		return getMaas()*1.5;
	}

	@Override
	public Arac aracAta() {
		
		return null;
	}

}
