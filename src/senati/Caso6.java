package senati;

import java.util.Scanner;
import java.text.DecimalFormat;
	
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("Ingrese sueldo: ");
		int sueldo = sc.nextInt();
		
		float impuesto = 0;
		
		if (sueldo > 2800)
			impuesto = sueldo * 0.05f;
		else
			impuesto = sueldo * 0.02f;
		
		System.out.println("\nRESULTADOS");
		System.out.println("==========");
		System.out.println("Impuesto calculado: " + df.format(impuesto));
	}
}
