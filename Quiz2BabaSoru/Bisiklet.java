package Quiz2BabaSoru;

public class Bisiklet extends Arac {

	public Bisiklet(String marka, String model, int motorGucu, int tekerlekSayısı) {
		super(marka, model,  motorGucu, tekerlekSayısı);
		this.setMotorGucu(0);
	}
	
	@Override
	public String yakıtTuruBelirle() {
		String s ="Yakıtsız çevreci araç :)";
		return s ;
	}
	
	public String toString() {
		return "Bisiklet\n"+
				"Marka : "+getMarka()+"\n"+
				"Model : "+getModel()+"\n"+
				"Tekerlek sayisi : "+getTekerlekSayısı()+"\n"+
				"Motor gücü : -\n"+
				"Yakıt türü : "+yakıtTuruBelirle();			
	}
}
