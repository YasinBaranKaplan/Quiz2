package Quiz2BabaSoru;

public class Insan {
	private String isim,soyIsim;
	private int yas;
	private boolean ehliyet;//0 yok 1 var
	
	public Insan(String isim,String soyIsim,int yas,boolean ehliyet) {
		this.ehliyet=ehliyet;
		this.yas=yas;
		this.isim=isim;
		this.soyIsim=soyIsim;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public boolean isEhliyet() {
		return ehliyet;
	}
	public void setEhliyet(boolean ehliyet) {
		this.ehliyet = ehliyet;
	}

	public String toString() {
		return "yas";
	}

}
