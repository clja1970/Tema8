package es.studium.Tema8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2
{

	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("fich1.txt");
			String cadena;
			BufferedReader entrada = new BufferedReader(fr);
			while ((cadena = entrada.readLine())!= null)
			{
				System.out.println(cadena);
			}
			entrada.close();
			fr.close();
			
		} catch (FileNotFoundException e)
		{
			System.out.println("Error 1: "+e.getMessage());
		} catch (IOException e)
		{
			System.out.println("Error 2: "+e.getMessage());
		}
		
	}

}
