package es.studium.Tema8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio6
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
			BufferedReader entrada1 = new BufferedReader(fr1);
			FileWriter fw = new FileWriter(nombreFichero2);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			String cadena = "";

			while ((cadena = entrada1.readLine())!=null)
			{
				salida.println(cadena);
			}

			System.out.println("Copia realizada con éxito");

			
			salida.close();
			bw.close();
			fw.close();
			entrada1.close();
			fr1.close();

		} catch (FileNotFoundException e)
		{
			System.out.println("Error 1.- " + e.getMessage());
		} catch (IOException e)
		{
			System.out.println("Error 2.- " + e.getMessage());
		}


		teclado.close();


	}
}


