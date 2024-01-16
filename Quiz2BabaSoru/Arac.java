package Quiz2BabaSoru;

public abstract class Arac {
	private String marka,model,yakıtTuru;
	private int motorGucu,tekerlekSayısı;
	public Arac(String marka, String model, String yakıtTuru, int motorGucu, int tekerlekSayısı) {
		super();
		this.marka = marka;
		this.model = model;
		this.yakıtTuru = yakıtTuru;
		this.motorGucu = motorGucu;
		this.tekerlekSayısı = tekerlekSayısı;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYakıtTuru() {
		return yakıtTuru;
	}
	public void setYakıtTuru(String yakıtTuru) {
		this.yakıtTuru = yakıtTuru;
	}
	public int getMotorGucu() {
		return motorGucu;
	}
	public void setMotorGucu(int motorGucu) {
		this.motorGucu = motorGucu;
	}
	public int getTekerlekSayısı() {
		return tekerlekSayısı;
	}
	public void setTekerlekSayısı(int tekerlekSayısı) {
		this.tekerlekSayısı = tekerlekSayısı;
	}
	
	public abstract String yakıtTuruBelirle();

}
