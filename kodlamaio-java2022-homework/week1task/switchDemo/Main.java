package switchDemo;

public class Main {

	public static void main(String[] args) {
        char grade= 'A';
		

		switch(grade) {
			case 'A':
				System.out.println("m�kemmel : ge�iniz");
				break;
			case 'B':
			case 'C':
				System.out.println("iyi : ge�iniz");
				break;
			case 'D':
				System.out.println("fena de�il: ge�iniz");
				break;
			case 'F':
				System.out.println("maalesef: kald�n�z");
				break;
			default:
					System.out.println("gecersiz not girdiniz");
			
		}
	}

}
