package aulas;

import java.util.Scanner;

public class Aula_25a {

	public static void main(String[]args) {
		
		int n;
		int y;
		Scanner ler = new Scanner(System.in);
		
		do{
		 System.out.println(" Digite um numero entre 0 e 10:");
		n = ler.nextInt();
		}while(n>10);
		 
		do{
			 System.out.println(" Digite um numero maior que 50:");
			y = ler.nextInt();
			}while(y<50);
		
		System.out.println("Numeros pares entre "+n + "e "+ y);		
		for(; n < y ; n++){
			if(n % 2 == 0){
				System.out.println(n);					
			}
		}
		
		
}


	}
