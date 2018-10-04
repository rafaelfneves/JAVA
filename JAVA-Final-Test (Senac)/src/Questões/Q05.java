package Questões;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int lado1,lado2,lado3;
		
		System.out.print("Digite a medida em cm do primeiro lado do triângulo:  ");
		lado1 = ler.nextInt();
		
		System.out.print("Digite a medida em cm do segundo lado do triângulo:  ");
		lado2 = ler.nextInt();
		
		System.out.print("Digite a medida em cm do terceiro lado do triângulo:  ");
		lado3 = ler.nextInt();
		ler.close();
		
		if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
			System.out.print("O triângulo é Equilátero.");
		} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
			System.out.print("O triângulo é Isósceles.");
		} else {
			System.out.print("O triângulo é Escaleno");	
		}		
	}
}
