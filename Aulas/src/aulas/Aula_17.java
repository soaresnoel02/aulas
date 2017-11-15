package aulas;

import java.util.Scanner;

public class Aula_17 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method s
		
		input = new Scanner(System.in);
		
		System.out.print("Qual é o seu nome ?");
		String primeiroNome =input.next();
		

		System.out.print("Qual é o seu Ultimo nome ?");
		String ultimoNome = input.next();
		
		System.out.print("Qual é o sua idade ?");
		int idade = input.nextInt();
		
			System.out.print("ola ,"+ primeiroNome +" "+ ultimoNome + " de "+ idade + " anos.\n");
			
		
	}

}
