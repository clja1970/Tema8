package es.studium.Tema8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8
{
	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		String nombreFichero, cadena;
		FileReader fr = null;
		BufferedReader br = null;
		int vocales = 0, consonantes = 0, otros = 0;
		System.out.println("Dame el nombre del fichero:");
		nombreFichero = teclado.nextLine();
		teclado.close();
		try
		{
			fr = new FileReader(nombreFichero);
			br = new BufferedReader(fr);
			while((cadena=br.readLine())!=null)
			{
				cadena = cadena.toUpperCase();
				for(int i = 0; i < cadena.length(); i++)
				{
					switch(cadena.charAt(i))
					{
					case 'Á':
					case 'É':
					case 'Í':
					case 'Ó':
					case 'Ú':
					case 'A':
					case 'E':
					case 'I':
					case 'O':
					case 'U':
						vocales++;
						break;
					case ',':
					case '.':
					case ';':
					case ':':
					case '!':
					case '¡':
					case '¿':
					case '?':
					case ' ':
						otros++;
						break;
					default:
						consonantes++;
					}
				}
			}
			System.out.println("Hay "+ vocales + " vocales, "+ consonantes + " consonantes y " + otros + " signos de puntuación.");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				br.close();
				fr.close();
			}
			catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
