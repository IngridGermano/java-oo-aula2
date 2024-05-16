package aula2;

import java.util.*;

class MyApp {
	
	public static void main(String[] args) {
		String nome = "Gerson";
		int idade = 19;
		String texto = nome + " " + idade;
		System.out.println(nome);
		System.out.println(texto);
		System.out.println(idade + 1);
		
		System.out.println(idade > 20); // true false?
		System.out.println(10 <= 10);
		System.out.println(5 == 5);
		System.out.println(10 != 20);
		
		System.out.println(10 <= 10 && idade < 20); // and
		System.out.println(10 > 50 || idade < 20); // or
		System.out.println(!(10 > 50)); // not
		System.out.println(((10 > 20 || 4 < 3 ) && 3 > 2) || 1 == 1);
		System.out.println(!true); // = false
		
		
		int valor = 10;
		
		valor += 2;
		valor = valor + 2;
		
		double capacidadeCopo1 = 1000.51242353252;// copo de 1L
		float capacidadeCopo2 = 500.0f; // copo de 500ml
		
		capacidadeCopo2 = (float)capacidadeCopo1;// cats explicito
		System.out.println(capacidadeCopo1);
		System.out.println(capacidadeCopo2);
		/*
		++idade; // faz a atribuição antes da operação
		idade++; // faz a atribuição depois da operação
		
		idade += 1;
		idade = idade + 1;
		*/
//		idade = 10;
		++idade;
		System.out.println(++idade);// idade + 1
		//12
		System.out.println(++idade);// 12
		
		int valor1 = 10;
		double valor2 = 50.0;
		
		double reultado = valor1 + valor2;
		
		char c = 'D';
		
		float var1 = 532.8700000f;
		double var2 = 532.870000000000;
		
		long var3 = 255L;
		
		int varNova;
		
//		valor = input("Digite alguma coisa:")
		
//		texto.replace(".", "-")
		
		int scanInt = 12;
		Scanner scan = new Scanner(System.in);
		
		String valorInput = scan.next();// método = função
		double valorDouble = scan.nextDouble();
		int valorInt = scan.nextInt();
		System.out.println(valorInput);
		scan.close();
		System.out.println(valorDouble + valorInt);
	}
}
