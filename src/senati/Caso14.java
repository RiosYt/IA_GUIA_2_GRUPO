package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del Alumno: ");
		String nombre = scn.nextLine();
		
		System.out.print("Carrera (DS, RC, DG): ");
		String carrera = scn.nextLine();
		
		System.out.print("Turno (M, T, N): ");
		String turno = scn.nextLine();
		
		String nom_carrera = "", nom_turno = "";
		int monto = 0;
		
		switch (carrera) {
			case "DS":
				nom_carrera = "Desarrollo de Software";
				monto = 1500;
				break;
			case "RC":
				nom_carrera = "Redes y Conectividad";
				monto = 1400;
				break;
			case "DG":
				nom_carrera = "Diseña Gráfico";
				monto = 1300;
				break;
		}
			
		float dscto = 0;
		
		switch (turno) {
			case "M":
				nom_turno = "Mañana";
				dscto = 0.1f * monto;
				break;
			case "T":
				nom_turno = "Tarde";
				dscto = 0.2f * monto;
				break;
			case "N":
				nom_turno = "Noche";
				dscto = 0.15f * monto;
				break;
		}
				
		float total = monto - dscto;
		float dolar = total * 3.33f;
		
		System.out.println("\n================");
		System.out.println("   RESULTADOS   ");
		System.out.println("================");
		System.out.println("Alumno.........: " + nombre);
		System.out.println("Carrera........: " + nom_carrera);
		System.out.println("Turno..........: " + nom_turno);
		System.out.println("Monto..........: " + monto);
		System.out.println("Descuento......: " + df.format(dscto));
		System.out.println("Total(S/.).....: S/." + df.format(total));
		System.out.println("Total($).......: $/." + df.format(dolar));
	}
}
