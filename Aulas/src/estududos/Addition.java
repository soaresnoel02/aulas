package estududos;

import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String firstNumber, secondNumber;
			int number1, number2, sum;
			firstNumber = JOptionPane.showInputDialog ("Digite o 1° n°" );
			secondNumber = JOptionPane.showInputDialog ( "Digite o 2° n°" );
			number1 = Integer.parseInt( firstNumber );
			number2 = Integer.parseInt( secondNumber );
			sum = number1 + number2;
			JOptionPane.showMessageDialog( null, "Soma= "
			+ sum, "Resultado", JOptionPane.PLAIN_MESSAGE );
			System.exit(0);
	}

	}
	}
