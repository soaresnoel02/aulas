package estududos;

import java.io.IOException;

import javax.swing.JOptionPane;

public class T2_Q3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String nome, sobre_nome, nome_completo;
		
		nome = JOptionPane.showInputDialog("Digite o nome.");
		
		sobre_nome = JOptionPane.showInputDialog		("Digite o sobre-nome.");
		
		nome_completo = nome + " " + sobre_nome;
		JOptionPane.showMessageDialog(null,
		"Nome completo, " + nome_completo);
		System.exit(0);

	}

} 
