package src1.tareas;

import libs.Input;

public class MinimoMonedas {

	public static void main (String args []) {
		
		
		
		
		/*
		1.  pedir al usuario cuanto es el cambio en fraccion.
		2.  tener un acumulador de monedas
		3.  tener un contador del resto de cambio sobrante
		4.  dividir por la moneda de 25c, sacar cuantas monedas de 25c necesito, y sumarlas al acumulador.
		5.  sacar el residuo para obtener el resto de cambio sobrante.
		6.  dividir por la moneda de 10c. sacar.........
		7.  repetir el paso 5 con la moneda de 10c
		8.  repetir el paso 4 con la moneda de 5c
		9   repetir el paso 5 con la moneda de 5c
		10. repetir el paso 4 con la moneda de 1c
		11. repetir el paso 5 con la moneda de 1c
		12  imprimir el numero de monedas en el acumulador.  */
		

		System.out.println("¿Cuanto cambio te debo?");
		double CambioDolares = Input.get_double();
		
		
		int CambioCentavos = (int)(CambioDolares * 100);

		int NumeroMonedas = 0;

		double restoCambio = CambioCentavos; 
		int numeroMonedas25c = CambioCentavos /25;
		CambioCentavos = CambioCentavos % 25;		  
		System.out.println("Monedas de 25c => "+ numeroMonedas25c);
		
		int numeroMoneda10c = CambioCentavos / 10;
		CambioCentavos = CambioCentavos % 10;		
		System.out.println("Monedas de 10c => "+ numeroMoneda10c);
		int numeroMoneda5c = CambioCentavos / 5;
		CambioCentavos = CambioCentavos % 5;	
		System.out.println("Monedas de 5c => "+ numeroMoneda5c);
		int numeroMoneda1c = CambioCentavos / 1;
		CambioCentavos = CambioCentavos % 1;	
		System.out.println("Monedas de 1c => "+ numeroMoneda1c);
	
		
	}

}
