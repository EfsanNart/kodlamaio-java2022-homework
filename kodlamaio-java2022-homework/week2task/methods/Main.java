package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();// sayiBulmaca'yi cag�rabilmek icin onu main i�erisinde �a��rmal�y�z

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 7;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "sayi mevcut: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("sayi mevcut de�ildir : " + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {// java da metot isimleri camel casing
		System.out.println(mesaj);
	}
}
