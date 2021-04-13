package es.studium.Tema8;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio15
{
        public static void main(String[] args)
        {
                final int TAM = 10;
                Scanner teclado = new Scanner(System.in);
                int tabla[] = new int[TAM];
                for(int i = 0; i < TAM; i++)
                {
                        System.out.println("Dame el valor de la posici�n " + i);
                        tabla[i] = teclado.nextInt();
                }
                try
                {
                        FileOutputStream fos = new FileOutputStream("tabla2.dat");
                        BufferedOutputStream bos = new BufferedOutputStream(fos);
                        DataOutputStream salidaB = new DataOutputStream(bos);
                        for(int i = 0; i < TAM; i++)
                        {
                                salidaB.writeInt(tabla[i]);
                        }
                        System.out.println("Archivo creado correctamente");
                        salidaB.close();
                        bos.close();
                        fos.close();
                        teclado.close();
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
