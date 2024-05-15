package exercicios;

import java.util.Scanner;

class Exercicio3 {

	static final Scanner ENTRADA = new Scanner(System.in);

	public static void main(String[] args) {
        double m, h, t, cavalos;
        
        System.out.print("Digite o valor da massa: ");
		m = ENTRADA.nextDouble();
		System.out.print("Digite o valor da altura: ");
		h = ENTRADA.nextDouble();
		System.out.print("Digite o valor do tempo: ");
		t = ENTRADA.nextDouble();
		

        cavalos = (m * h / t) / 745.6999;

        System.out.println("A quantidade de cavalos necessários é " + cavalos);
    }

}
