package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
				
		System.out.print("Nombre del empleado: ");
		String nombre = sc.nextLine();
		
		System.out.print("Horas trabajadas: ");
		float horas = sc.nextFloat();
		
		System.out.print("Tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		System.out.print("Minutos de tardanza: ");
		int minuto = sc.nextInt();
		
		float importe = horas * tarifa;
		float bono = 0;
		
		if (horas > 60)
			bono = 0.13f * importe;
		else
			bono = 0.04f * importe;
		
		float dscto = 0;
		
		if (minuto > 15)
			dscto = 0.03f * importe;
		
		float meta = (horas / 70) * 100;
		
		
		System.out.println("==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Trabajador.........: " + nombre);
		System.out.println("Horas trabajadas...: " + horas);
		System.out.println("Tarifa por horas...: " + tarifa);
		System.out.println("Importe............: " + importe);
		System.out.println("Bono...............: " + df.format(bono));
		System.out.println("Descuento..........: " + df.format(dscto));
		System.out.println("Meta alcanzada.....: " + df.format(meta) + "%");
	}
}
