package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Elif";
		String ogrenci2 = "Ef�an";
		String ogrenci3 = "Hakan";
		String ogrenci4 = "Gamze";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println("************");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Elif";
		ogrenciler[1] = "Ef�an";
		ogrenciler[2] = "Hakan";
		ogrenciler[3] = "Gamze";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		// ForEach

		System.out.println("************");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
