package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj=	"Bug�n hava �ok g�zel";
		String yeniMesaj=mesaj.substring(0,2);//burada substring bir de�er return ediyor
		//String yeniMesaj=ekle();string olan bir de�ere void olan bir operasyonu atayamay�z
		System.out.println(yeniMesaj);
		int sayi=topla(12,43);
		System.out.println(sayi);


	}
	public static void ekle () {
		System.out.println("Eklendi");
	}
    public static void sil () {
    	System.out.println("Silindi");
	}
   public static void guncelle () {
	   System.out.println("Guncellendi");
  }

   public static int topla(int sayi1,int sayi2) {
	   return sayi1+sayi2;
   }

}
