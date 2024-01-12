
public class Soru2 {
	public static void main(String[] args) {
		int[][] matris1 = {{1,2}};
		int[][] matris2 = {{3,5}};
		//int[][]a=tranzpozAl(matris1);
		
		System.out.print("Matris 1 transpoz:\n");
		yaz(tranzpozAl(matris1));
		System.out.print("MAtris 2 transpoz:\n");
		yaz(tranzpozAl(matris2));
		System.out.print("Matrislerin toplamı:\n");
		yaz(topla(tranzpozAl(matris1),tranzpozAl(matris2)));
		System.out.print("Matrislerin cıkarımı:\n");
		yaz(cıkra(tranzpozAl(matris1),tranzpozAl(matris2)));
	}
	public static void yaz(int[][] m) {
			for(int i=0;i<m.length;i++) {
				for(int j = 0;j<m[0].length;j++) {
					System.out.print(m[i][j]+" ");
				}System.out.println();
			}
		}
	
	public static int[][] tranzpozAl(int[][] matris){
		int satirSayisi = matris.length;
		int sutunSayisi = matris[0].length;
		
		int[][] transpozMatris = new int[sutunSayisi][satirSayisi];
		
		for(int i=0;i<satirSayisi;i++) {
			for(int j = 0;j<sutunSayisi;j++) {
				transpozMatris[j][i]=matris[i][j];
			}
		}return transpozMatris;
	}
	
	public static int[][] topla(int[][] a,int[][] b){
		int[][] toplanmısMatris = new int[a.length][a[0].length];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0 ; j<a[0].length;j++) {
				toplanmısMatris[i][j]=a[i][j]+b[i][j];
			}
		}return toplanmısMatris;
	}
	
	public static int[][] cıkra(int[][] a,int[][] b){
		int[][] cıkarılmısMatris = new int[a.length][a[0].length];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0 ; j<a[0].length;j++) {
				cıkarılmısMatris[i][j]=a[i][j]-b[i][j];
			}
		}return cıkarılmısMatris;
	}
	
}
