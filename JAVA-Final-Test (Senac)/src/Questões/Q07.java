package Questões;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double val,dolar;
		
		System.out.print("Digite a cotação do Dólar: ");
		dolar = ler.nextDouble();
		
		System.out.print("Digite o valor a ser convertido em Real: ");
		val = ler.nextDouble();
		ler.close();
		
		
		val = val * dolar;
		System.out.print("A conversão é de: "+val);
		
		
		
	}
}
