package es.studium.Tema8;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio16 {

	public static void main(String[] args)
	{
		final int TAM = 10;
		int tabla[]= new int[TAM];
		try
		{
			FileInputStream fos = new FileInputStream("tabla2.dat");
			BufferedInputStream bos = new BufferedInputStream(fos);
			//Necesitamos un objeto de la clase DataOutputStream
			DataInputStream entradaB = new DataInputStream(bos);
			//Recorrer la tabla e ir guardando elemento a elemento
			for (int i=0; i<TAM; i++)
			{
				tabla[i]= entradaB.readInt();
			}
			for (int i=0; i<TAM; i++)
			{
				System.out.println(tabla[i]);
			}
			System.out.println("Archivo leído correctamente");
			entradaB.close();
			bos.close();
			fos.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}