
package aulas;

import java.util.Scanner;
import java.util.Random;

public class Aula_25 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Random random= new Random();
		
		boolean acertou =false;
		int tentativas=10;
		int numeroSecreto = random.nextInt();
		long chute=0;
		
		while(tentativas>0 && acertou==false){
			System.out.println("Qual seu chute ?");
			chute =input.nextLong();
			
			if (numeroSecreto==chute){
				System.out.println("Voce acertou .");
			}
			
		}
		

	}

}
