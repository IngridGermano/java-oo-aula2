package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, n3, n4, media;
		
		System.out.print("Digite o sálario do primeiro funcionário: ");
		n1 = entrada.nextDouble();
		System.out.print("Digite o sálario do segundo funcionário: ");
		n2 = entrada.nextDouble();
		System.out.print("Digite o sálario do terceiro funcionário: ");
		n3 = entrada.nextDouble();
		System.out.print("Digite o sálario do quarto funcionário: ");
		n4 = entrada.nextDouble();

		media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("A média salarial dos funcionários da empresa é de R$ " + media);
	}
}
