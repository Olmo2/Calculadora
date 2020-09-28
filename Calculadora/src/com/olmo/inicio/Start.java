package com.olmo.inicio;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Operacion operacion = new Operacion();
		
		
		System.out.println("Elige la operación a realizar: Suma(S) Resta(R) Multipicacion(M) Division(D) ó Resto(DR)");
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		switch(teclado.next()) {
		case "S":
			System.out.println("Has elegido Suma, introduce los numeros a sumar");
			System.out.println(operacion.Suma(teclado.nextFloat(), teclado.nextFloat()));
			break;
		case "R":
			System.out.println("Has elegido resta, introduce los números a restar");
				System.out.println(operacion.Resta(teclado.nextFloat(), teclado.nextFloat()));
				break;
		case "D":
			System.out.println("Has elegido Division, introduce los numeros a dividir");
			System.out.println(operacion.Division(teclado.nextFloat(), teclado.nextFloat()));
			break;
		case "M":
			System.out.println("Has elegido Multiplicacion, introduce los numeros ");
			System.out.println(operacion.Multiplicacion(teclado.nextFloat(), teclado.nextFloat()));
			break;
		case "DR":
			System.out.println("Has elegido Resto, introduce");
			System.out.println(operacion.Resto(teclado.nextFloat(), teclado.nextFloat()));
			break;
		
		}

	}

}
