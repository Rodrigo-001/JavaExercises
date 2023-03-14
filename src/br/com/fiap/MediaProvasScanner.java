package br.com.fiap;

import java.util.Scanner;

public class MediaProvasScanner {

	public static void main(String[] args) {
		float prova1 = 0.0f, prova2 = 0.0f, prova3 = 0.0f, prova4 = 0.0f, media = 0.0f;
		Scanner scan; //importa a classe scanner e atribui a ela o objeto scan
		
		//Esse programa pede quatro notas para o usuario, calcula o resultado e mostra usando numero INTEIROS
		try {  
			scan = new Scanner(System.in);
			System.out.println("Digite as 4 notas");
			prova1 = scan.nextFloat();
			prova2 = scan.nextFloat();
			prova3 = scan.nextFloat();
			prova4 = scan.nextFloat();
			media = (prova1 + prova2 + prova3 + prova4) / 4;
			System.out.println("\n\nSua média é: " + media);
			
		} catch (Exception e) {
			System.out.println("\n\nFormato de numero incorreto, \nleia com atenção e tente novamente");
		}
	}

}

//*Este programa faz exatamente a mesma coisa, mas possibilita o uso de numeros decimais
