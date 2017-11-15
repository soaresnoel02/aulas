package aulas;

public class Aula_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMilisegundos=System.currentTimeMillis()-10800000;
		
		long totalSegundos= totalMilisegundos /1000;
		long segundosAtual=totalSegundos %	60;

		long totalMinutos = totalSegundos / 60;
		long minutoAtual =totalMinutos % 60 ;
		
		long totalHora = totalMinutos /60 ;
		long horaAtual = totalHora % 24 ;
		
		System.out.println(horaAtual+":"+minutoAtual+":"+ segundosAtual);
	}

}
