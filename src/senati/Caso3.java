package senati;

import java.util.Scanner;

public class Caso3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.print("Ingrese n�mero 1: ");
		n1 = sc.nextInt();

		System.out.print("Ingrese n�mero 2: ");
		n2 = sc.nextInt();

		
		String estado = "";
		
		if (n1 == n2)
			estado = "Los tres n�meros son iguales";
		else if (n1 > n2)
			estado = "El primer n�mero es el mayor";
		else if (n2 > n1)
			estado = "El segundo n�mero es el mayor";
				
		System.out.println("Resultado: " + estado);
	} 

}
