package senati;

import java.util.Scanner;

public class Caso4 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n1 = 0, n2 = 0;
	
	System.out.print("Ingrese primer n�mero: ");
	n1 = sc.nextInt();
	
	System.out.print("Imgrese segundo n�mero: ");
	n2 = sc.nextInt();
	
	if (n1 == n2)
		System.out.println("Los n�meros son iguales");
	else if (n1 < n2)
		System.out.println("El primer n�mero es menor");
	else if (n2 < n1)
		System.out.println("El segundo n�mero es menor");
		
	}
}
