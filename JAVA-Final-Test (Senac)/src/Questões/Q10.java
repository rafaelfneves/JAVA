package Questões;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite a Idade do nadador: ");
		idade = ler.nextInt();
		ler.close();
		
		if(idade >=5 && idade<=7) {
			System.out.print("Infantil A");
		} else if(idade >=8 && idade<10) {
			System.out.print("Infantil B");
		} else if(idade >=11 && idade<=13) {
			System.out.print("Juvenil A");
		} else if(idade >=14 && idade<=17) {
			System.out.print("Juvenil B");
		} else if(idade >17) {
			System.out.print("Sênior");
		} else {
			System.out.print("Não têm a idade mínima necessária.");
		}
	}
}
