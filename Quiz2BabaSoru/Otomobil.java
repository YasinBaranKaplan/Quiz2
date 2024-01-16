package Quiz2BabaSoru;

import java.util.Random;

public class Otomobil extends Arac {

	public Otomobil(String marka, String model, int motorGucu, int tekerlekSayısı) {
		super(marka, model, motorGucu, tekerlekSayısı);
		
	}

	@Override
	public String yakıtTuruBelirle() {
		Random r = new Random();
		int yakıtTur = r.nextInt(1,3);
		if(yakıtTur==1) {
			return "Elektrikli";
		}else if(yakıtTur==2) {
			return "Benzinli";
		}else {
			return "Dizel";
		}
	}
	
	public String toString() {
		return "Otomobil\n"+
				"Marka : "+getMarka()+"\n"+
				"Model : "+getModel()+"\n"+
				"Motor Gücü : "+getMotorGucu()+"\n"+
				"Tekerlek sayısı : "+getTekerlekSayısı()+"\n"+
				"Yakıt türü : "+yakıtTuruBelirle();
	}

}
