package estududos;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) throws IOException {
		
		String nota1, nota2;
		double media, n1, n2;
		
		nota1 = JOptionPane.showInputDialog
		("Digite a primeira nota: ");
		
		n1 = Double.parseDouble(nota1);
		nota2 = JOptionPane.showInputDialog
		("Digite a segunda nota: ");
		
		n2 = Double.parseDouble(nota2);
		media = (n1+n2)/2;
		
		JOptionPane.showMessageDialog
		(null,"A media aritmetica " + media);
		System.exit(0);
	}

}
