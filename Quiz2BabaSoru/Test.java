package Quiz2BabaSoru;

public class Test {

	public static void main(String[] args) {
		ArastirmaGorevlisi musto = new ArastirmaGorevlisi("Yasin", "Kaplan", 23, true);
		musto.aracAta("Scooter"); 
		System.out.println(musto.toString()); 
		System.out.println();
		DoktorOgretimUyesi dUye = new DoktorOgretimUyesi("Hakan", "Loyan", 20, true);
		dUye.aracAta("Motosiklet");
		System.out.println(dUye.toString());
		System.out.println();
		Docent doc = new Docent("Bozok", "Ozmutlu", 21, true);
		doc.aracAta("Motosiklet");
		System.out.println(doc.toString());
		System.out.println();
		Profesor prof = new Profesor("Galip","Açıkel", 22, true);
		prof.aracAta("Otomobil");
		System.out.println(prof.toString());
		System.out.println();
		
	}

}
