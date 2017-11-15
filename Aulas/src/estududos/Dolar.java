package estududos;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Dolar{
	
public static void main(String[] args) throws IOException {
String num, num2;
double qtde_dolar,cambio, real;

num = JOptionPane.showInputDialog
("Digite quantos dolares voce quer converter !!!");

qtde_dolar = Double.parseDouble(num);
num2 = JOptionPane.showInputDialog

("Digite o valor do cambio !!!");
cambio = Double.parseDouble(num2);

real = qtde_dolar*cambio;
JOptionPane.showMessageDialog
(null,"O valor canvertido é =" + real);
System.exit(0);
}
}
