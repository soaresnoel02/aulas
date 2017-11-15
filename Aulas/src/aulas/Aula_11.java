
package aulas;

import java.util.Scanner;

public class Aula_11 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);
		
		double base, altura,areaRetangulo;
		
		System.out.println("Informe o valor da base:\n");
		base = input.nextDouble();
		System.out.println("informeo valor da altura:\n");
		altura = input.nextDouble();
		
		areaRetangulo = base * altura;
		
		System.out.println(" A area de um retangulo de base ="+ base);
		System.out.println(" E altura e "+ altura );
		System.out.println(" e "+ areaRetangulo);
	}

}
