package aulas;

import java.util.Scanner;

public class Aula_14 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		input = new Scanner(System.in);
		
		System.out.println("Insira um valor em gramas.");
		int gramas =input.nextInt();
		
		int kilos = gramas/1000;
		gramas=gramas % 1000;
		
		System.out.println("O total de kilos é =" +kilos);
		System.out.println(" o total de gramas é =" + gramas);
		
	}

}
