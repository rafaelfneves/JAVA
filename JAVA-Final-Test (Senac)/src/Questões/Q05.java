package Quest�es;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int lado1,lado2,lado3;
		
		System.out.print("Digite a medida em cm do primeiro lado do tri�ngulo:  ");
		lado1 = ler.nextInt();
		
		System.out.print("Digite a medida em cm do segundo lado do tri�ngulo:  ");
		lado2 = ler.nextInt();
		
		System.out.print("Digite a medida em cm do terceiro lado do tri�ngulo:  ");
		lado3 = ler.nextInt();
		ler.close();
		
		if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
			System.out.print("O tri�ngulo � Equil�tero.");
		} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
			System.out.print("O tri�ngulo � Is�sceles.");
		} else {
			System.out.print("O tri�ngulo � Escaleno");	
		}		
	}
}
