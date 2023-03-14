package br.com.fiap;

import javax.swing.JOptionPane;

public class MediaJOption {

	public static void main(String[] args) {
		double prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0, media = 0;
		
		/*Esse programa pede quatro notas para o usuario, calcula o resultado e mostra
		 usando numero DECIMAIS
		 MODO DE CONVERSÃO DIRETA, OS VALORES SÃO CONVERTIDOS E GUARDADOS NAS VARIAVEIS*/
		try {
			prova1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova"));
			prova2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova"));
			prova3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da terceira prova "));
			prova4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da terceira prova"));
			media = (prova1 + prova2 + prova3 + prova4) / 4;

			JOptionPane.showMessageDialog(null, "Sua média é: " + media);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Ops, Formato de numero incorreto, \nleia com atenção e tente novamente");
		}
		/*MODO ALTERNATIVO: 
		 *Guarda os valores na variavel aux e depois converte o tipo de dados, 
		 *guardando-os em suas respectivas variaveis 
		*/
		try {
			String auxiliar;
			auxiliar = JOptionPane.showInputDialog("Digite a primeira nota: ");
			prova1 = Double.parseDouble(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a segunda nota: ");
			prova2 = Double.parseDouble(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a terceira nota: ");
			prova3 = Double.parseDouble(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a quarta nota: ");
			prova4 = Double.parseDouble(auxiliar);
			
			media = (prova1 + prova2 + prova3 + prova4) / 4;
			JOptionPane.showMessageDialog(null, "Sua média é: " + media);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ops, Formato de numero incorreto, \nleia com atenção e tente novamente");
		}
	}
}















