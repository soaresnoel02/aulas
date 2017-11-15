
package aulas;
import java.util.Scanner;

public class Aula_13 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI=3.1456;
		input = new Scanner(System.in);
		
		System.out.println(" informe o valor do raio :\n");
		double raio= input.nextDouble();
		
		double area=raio * raio *PI;
		
		System.out.println(" O Valor é " + area  );

	}

}
