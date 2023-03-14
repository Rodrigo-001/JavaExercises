package br.com.fiap;

import javax.swing.JOptionPane;

public class IdadeJOption {

		/*MODO RESUMIDO:
		 * AQUI OS VALORES SÃO DIRETAMENTE CONVERTIDOS E GUARDADOS EM SUAS VARIAVEIS
		 * O programa pede que o usuario digite ano atual e ano de nascimento e retorna sua idade*/
	public static void main(String[] args) {
		int anoAtual = 0, anoNascimento = 0;
		
		try {
			anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
			anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));
			int idade = anoAtual - anoNascimento;
			
			JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
					
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ops Formato de numero incorreto, "
					+ "\nleia com atenção e tente novamente");
		}
		
		/*MODO ALTERNATIVO:
		 * Aqui o valor idade é guardado na variavel string e logo depois convertido e 
		 * guardado em sua respectiva variavel*/
		try {
			String auxiliar;
			auxiliar = JOptionPane.showInputDialog("Digite o ano atual");
			anoAtual = Integer.parseInt(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite seu ano de nascimento");
			anoNascimento = Integer.parseInt(auxiliar);
			int idade = anoAtual - anoNascimento;
			
			JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}











