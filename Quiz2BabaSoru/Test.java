package Quiz2BabaSoru;

public class Test {

	public static void main(String[] args) {
		ArastirmaGorevlisi obj = new ArastirmaGorevlisi("Yasin", "Kaplan", 23, false, null);
		System.out.println(obj.maasHesapla()); 
		Bisiklet bis = new Bisiklet("Borabay", "X13", null, 10,2 );
		System.out.println(bis.toString());
	}

}
