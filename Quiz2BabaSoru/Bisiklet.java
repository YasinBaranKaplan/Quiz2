package Quiz2BabaSoru;

public class Bisiklet extends Arac {

	public Bisiklet(String marka, String model, String yakıtTuru, int motorGucu, int tekerlekSayısı) {
		super(marka, model, yakıtTuru, motorGucu, tekerlekSayısı);
		this.setYakıtTuru(yakıtTuruBelirle());
	}

	@Override
	public String yakıtTuruBelirle() {
		String s ="Yakıtsız çevreci araç :)";
		return s ;
	}
	
	public String toString() {
		return getYakıtTuru();
	}
}
