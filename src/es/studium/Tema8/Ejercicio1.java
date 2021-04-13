package es.studium.Tema8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1
{

	public static void main(String[] args)
	{
		String cadena1;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escribe una cadena");
		cadena1=teclado.nextLine();
		try
		{
		// Destino de los datos
		FileWriter fw = new FileWriter("Archivo.txt",true);
		// Buffer de escritura
		BufferedWriter bw = new BufferedWriter(fw);
		// Objeto para la escritura
		PrintWriter salida = new PrintWriter(bw);
		//Guardamos la primera línea
		salida.println(cadena1);
		//Cerrar el objeto salida, el objeto bw y el fw
		salida.close();
		bw.close();
		fw.close();
		teclado.close();
		System.out.println("¡Archivo creado correctamente!");
		}
		catch(IOException i)
		{
		System.out.println("Se produjo un error de Archivo");
		}
	}
}
		
		
