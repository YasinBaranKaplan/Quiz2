package Quiz2BabaSoru;

public abstract class Akademisyen extends Insan {
	private Arac arac;

	public Akademisyen(String isim, String soyIsim, int yas, boolean ehliyet,Arac arac) {
		super(isim, soyIsim, yas, ehliyet);
		this.arac=arac;			
	}
	
	public Arac getArac() {
		return arac;
	}

	public void setArac(Arac arac) {
		this.arac = arac;
	}

	public abstract double maasHesapla();
	public abstract Arac aracAta();

}
