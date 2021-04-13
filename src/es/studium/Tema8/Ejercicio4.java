package es.studium.Tema8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio4
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		char caracter;
		do{
			System.out.println("Introduce caracteres hasta pulsar *: ");
			caracter = teclado.nextLine().charAt(0);
			try
			{
				FileWriter fr = new FileWriter("fich2.txt", true);
				BufferedWriter br = new BufferedWriter(fr);
				PrintWriter salida = new PrintWriter(br);
				
				if (caracter != '*')
				{
					salida.println(caracter);
				}
				
				salida.close();
				br.close();
				fr.close();
				
			} catch (IOException e)
			{
				System.out.println("Error 1: "+e.getMessage());
			}
		}while(caracter!='*');
		teclado.close();
	}
}
