package src1.tareas;

import libs.Input;

public class BotellasAgua {

	public static void main(String[] args) {
		System.out.println("ingresa tu tiempo de ducha");
		int tiempoDucha = Input.get_int();//get_positive_int();
		System.out.println("Gastaste "+ (tiempoDucha*12)+ " botellas de agua, en bañarte");
	}

	private static int get_positive_int() {
		int n;
	    do
	    {
	        Input.print("n is ");
	        n = Input.get_int();
	    }
	    while (n >= 0);
	    return n;
	}
}
