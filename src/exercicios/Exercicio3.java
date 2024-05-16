package exercicios;

import java.util.Scanner;

class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
        double m, h, t, cavalos;
        
        System.out.print("Digite o valor da massa: ");
		m = entrada.nextDouble();
		System.out.print("Digite o valor da altura: ");
		h = entrada.nextDouble();
		System.out.print("Digite o valor do tempo: ");
		t = entrada.nextDouble();
		

        cavalos = (m * h / t) / 745.6999;

        System.out.println("A quantidade de cavalos necessários é " + cavalos);
    }

}
