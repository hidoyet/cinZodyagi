package cinZodyagi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age,modeAge;
		System.out.println("Do�um y�l�n�z� giriniz:");
		age=scanner.nextInt();
		modeAge=age%12;
		switch(modeAge) {
			case 0:
				System.out.println("�in zodya�� burcunuz MAYMUN");
				break;
			case 1:
				System.out.println("�in zodya�� burcunuz HOROZ");
				break;
			case 2:
				System.out.println("�in zodya�� burcunuz K�PEK");
				break;
			case 3:
				System.out.println("�in zodya�� burcunuz DOMUZ");
				break;
			case 4:
				System.out.println("�in zodya�� burcunuz FARE");
				break;
			case 5:
				System.out.println("�in zodya�� burcunuz �K�Z");
				break;
			case 6:
				System.out.println("�in zodya�� burcunuz KAPLAN");
				break;
			case 7:
				System.out.println("�in zodya�� burcunuz TAV�AN");
				break;
			case 8:
				System.out.println("�in zodya�� burcunuz EJDERHA");
				break;
			case 9:
				System.out.println("�in zodya�� burcunuz YILAN");
				break;
			case 10:
				System.out.println("�in zodya�� burcunuz AT");
				break;
			case 11:
				System.out.println("�in zodya�� burcunuz KOYUN");
				break;
		
		}
			
	}

}
