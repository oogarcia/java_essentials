package numericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		System.out.println("ingresa valor flotante 1");
		float f = Input.get_float();
		System.out.println("Ingresa valor flotante 2");
		float f2 = Input.get_float();
		
		Input.print("f/f2 = " + (f/f2));

	}

}
