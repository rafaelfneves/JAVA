package Questões;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double val, juro;
		
		System.out.print("Digite o valor que foi depositado: ");
		val = ler.nextDouble();
		ler.close();
		
		val *= 5;
		juro = (val*0.70)/100;
		val += juro;
		
		System.out.print("O rendimento vai ser de: "+val);
	}
}
