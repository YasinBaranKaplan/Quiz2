package Quiz2BabaSoru;

public abstract class Akademisyen extends Insan {
	private Arac arac;
	private double maas=17002;
	public Akademisyen(String isim, String soyIsim, int yas, boolean ehliyet) {
		super(isim, soyIsim, yas, ehliyet);		
	}
	
	
	public double getMaas() {
		return maas;
	}


	public void setMaas(double maas) {
		this.maas = maas;
	}


	public Arac getArac() {
		return arac;
	}

	public void setArac(Arac arac) {
		this.arac = arac;
	}

	public abstract double maasHesapla();
	public abstract void aracAta(String arac);

}
