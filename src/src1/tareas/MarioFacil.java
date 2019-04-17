package src1.tareas;

import libs.Input;

public class MarioFacil {

	
	public static void main(String args[])
	{
		System.out.println("ingresa un numero");
		int alturaTorre =  Input.get_int();
		/*int numero = 1;
		while(numero <= alturaTorre)
		{
			
			int num_asteriscos = numero;
			int control = 1;
			while (control <= num_asteriscos) {
				
				System.out.print("*");
				control ++;
				
			}
			System.out.println();
			numero +=1;
		}*/

		
		for(int i=1; i<=alturaTorre;i++)
        {



            for(int j=1;j<=i+1;j++)
            {
              
            	System.out.print("#");
            }
            System.out.println("");
        }
		
		
		/*
	    for(int k=1; k<=alturaTorre;k++)
        {
            for(int l=1;l<=k+1;l++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
*/
		
	
	}
}
