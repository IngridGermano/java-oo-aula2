package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double C, K, F, Re, Ra;

		System.out.print("Digite o valor em graus Celsius: ");
		C = entrada.nextDouble();

		F = C * 1.8 + 32;
		K = C + 273.15;
		Ra = C * 1.8 + 32 + 459.67;
		Re = C * 0.8;

		System.out.println("A temperatura em Fahrenheit é: " + F);
		System.out.println("A temperatura em Kelvin é: " + K);
		System.out.println("A temperatura em Reaumur é: " + Ra);
		System.out.println("A temperatura em Rankine é: " + Re);
	}
}