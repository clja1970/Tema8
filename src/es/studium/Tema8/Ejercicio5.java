package es.studium.Tema8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el nombre del primer Fichero y extension: ");
		String nombreFichero = teclado.nextLine();
		System.out.println("Introduce nombre del segundo Fichero y extension: ");
		String nombreFichero2 = teclado.nextLine();
		teclado.close();

		try
		{
			FileReader fr1 = new FileReader(nombreFichero);
			FileReader fr2 = new FileReader(nombreFichero2);
			BufferedReader entrada1 = new BufferedReader(fr1);
			BufferedReader entrada2 = new BufferedReader(fr2);
			Boolean iguales = true;
			String cadena1 = "";
			String cadena2 = "";

			// Se pone iguales, porque en el momento de que iguales ya no sea true entonces terminara la ejecucion y nos dira que no son iguales
			// Esto es ideal para ficheros donde son muy extensos
			while (iguales == true && (cadena1 = entrada1.readLine()) != null && (cadena2=entrada2.readLine()) != null) 
			{
				if (!cadena1.equals(cadena2))
				{	
					iguales = false;
				}
			}

			if (iguales == true)
			{
				System.out.println("El contenido de los dos ficheros es igual");
			}else {
				System.out.println("El contenido de los dos ficheros  no es igual");
			}

			entrada2.close();
			entrada1.close();
			fr2.close();
			fr1.close();


		} catch (FileNotFoundException e)
		{
			System.out.println("Error 1.- " + e.getMessage());
		} catch (IOException e)
		{
			System.out.println("Error 2.- " + e.getMessage());
		}


	}

}
