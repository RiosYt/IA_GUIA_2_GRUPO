package senati;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Ingrese número: ");
		numero = scn.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("El numero " + numero + " es par");
		else
			System.out.println("El número " + numero + " es impar");
	}
}
