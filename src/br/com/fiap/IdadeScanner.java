package br.com.fiap;

import java.util.Scanner;

public class IdadeScanner {

	public static void main(String[] args) {
		int anoAtual, anoNascimento;
		Scanner scan;
				
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o ano atual");
			anoAtual = scan.nextInt();
			System.out.println("Digite o seu ano de nascimento");
			anoNascimento = scan.nextInt();
			int idade = anoAtual - anoNascimento;
			System.out.println("\n\nSua idade e: " + idade + " anos.");
			
		} catch (Exception e) {
			System.out.println("\n\nOps, Formato de numero incorreto, \nleia com atenção e tente novamente");
		}

	}

}
