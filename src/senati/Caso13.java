package senati;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		String ope = "";
		
		System.out.print("Primer Numero...: ");
		num1 = scn.nextFloat();
		System.out.print("Segundo Numero..: ");
		num2 = scn.nextFloat();
		System.out.print("Operacion [1-6].: ");
		int o = scn.nextInt();
		
		float op = 0;
		
		switch (o) {
			case 1:
				op = num1 + num2;
				ope = "Suma";
				break;
				
			case 2:
				op = num1 - num2;
				ope = "Resta";
				break;
				
			case 3:
				op = num1 * num2;
				ope = "Producto";
				break;
				
			case 4:
				ope = "Division";
				op = num1 / num2;
				
				if(num2 == 0) {				
					ope = "No es posible dividir en 0";
					op = num2;
				}
			    break;
			    
			case 5:
				ope = "Resto Entero";
				op = num1 % num2;
				if(num2 == 0) {				
					ope = "No es posible hallar el resto entero";
					op = num2;
				}			
			    break;
			    
			case 6:
				op = (num1 + num2) / 2;
				ope = "Promedio";
				break;
				
			default:
				op = 0; 
				num1 = 0f;
				num2 = 0f;
				ope = "Opcion Invalida";
				break;
		}

		
		System.out.println("==============");
		System.out.println("  RESULTADOS  ");
		System.out.println("==============");
		System.out.println("Número 1....: " + num1);
		System.out.println("Número 2....: " + num2);
		System.out.println("Operación...: " + ope);
		System.out.println("Resultado...: " + op);
		
	}
}
