package senati;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese nota: ");
		int nota = scn.nextInt();
		
		if (nota <= 7)
			System.out.println("Estado obtenido: Sin Palabras");
		else if (nota >= 8 && nota <= 10)
			System.out.println("Estado obtenido: Mala");
		else if (nota >= 11 && nota <= 14)
			System.out.println("Estado obtenido: Regular");
		else if (nota >= 15 && nota <= 17)
			System.out.println("Estado obtenido: Notable");
		else if (nota >= 18 && nota <= 20)
			System.out.println("Estado obtenido: Excelente");
		
		
	}
}
