package es.studium.Tema8;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12
{

	public static void main(String[] args)
	{
	BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
	int entero;
	System.out.println("Dame un entero: ");
	try
	{
		entero=Integer.parseInt(entrada.readLine());
		FileOutputStream fos = new FileOutputStream("uno.bin");
		BufferedOutputStream bos = new BufferedOutputStream (fos);
		//Necesitamos un objeto de la clase DataOutputStream
		DataOutputStream salidaB = new DataOutputStream(bos);
		salidaB.writeInt(entero);
		entrada.close();
		salidaB.close();
		bos.close();
		fos.close();
		System.out.println("Archivo creado correctamente");
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}

	}

}
