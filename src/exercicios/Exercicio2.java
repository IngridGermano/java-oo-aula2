package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	static final Scanner ENTRADA = new Scanner(System.in);

	public static void main(String[] args) {
		double n1, n2, n3, n4, media;
		
		System.out.print("Digite o sálario do primeiro funcionário: ");
		n1 = ENTRADA.nextDouble();
		System.out.print("Digite o sálario do segundo funcionário: ");
		n2 = ENTRADA.nextDouble();
		System.out.print("Digite o sálario do terceiro funcionário: ");
		n3 = ENTRADA.nextDouble();
		System.out.print("Digite o sálario do quarto funcionário: ");
		n4 = ENTRADA.nextDouble();

		media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("A média salarial dos funcionários da empresa é de R$ " + media);
	}
}
