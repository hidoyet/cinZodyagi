package cinZodyagi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age,modeAge;
		System.out.println("Doðum yýlýnýzý giriniz:");
		age=scanner.nextInt();
		modeAge=age%12;
		switch(modeAge) {
			case 0:
				System.out.println("Çin zodyaðý burcunuz MAYMUN");
				break;
			case 1:
				System.out.println("Çin zodyaðý burcunuz HOROZ");
				break;
			case 2:
				System.out.println("Çin zodyaðý burcunuz KÖPEK");
				break;
			case 3:
				System.out.println("Çin zodyaðý burcunuz DOMUZ");
				break;
			case 4:
				System.out.println("Çin zodyaðý burcunuz FARE");
				break;
			case 5:
				System.out.println("Çin zodyaðý burcunuz ÖKÜZ");
				break;
			case 6:
				System.out.println("Çin zodyaðý burcunuz KAPLAN");
				break;
			case 7:
				System.out.println("Çin zodyaðý burcunuz TAVÞAN");
				break;
			case 8:
				System.out.println("Çin zodyaðý burcunuz EJDERHA");
				break;
			case 9:
				System.out.println("Çin zodyaðý burcunuz YILAN");
				break;
			case 10:
				System.out.println("Çin zodyaðý burcunuz AT");
				break;
			case 11:
				System.out.println("Çin zodyaðý burcunuz KOYUN");
				break;
		
		}
			
	}

}
