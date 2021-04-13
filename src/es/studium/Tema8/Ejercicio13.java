package es.studium.Tema8;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio13
{

	public static void main(String[] args)
	{
		
		new Ejercicio13();
		{
			
			try
			{
				int entero;
				FileInputStream fos = new FileInputStream("uno.bin");
				BufferedInputStream bis = new BufferedInputStream (fos);
				//Necesitamos un objeto de la clase DataInputStream
				DataInputStream entradaB = new DataInputStream(bis);
				entero = entradaB.readInt();
				System.out.println(entero);
				entradaB.close();
				bis.close();
				fos.close();
				
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}

			}
		}
	}
	


