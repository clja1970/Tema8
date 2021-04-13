package es.studium.Tema8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroTextoEscritura
{
public FicheroTextoEscritura()
{
//FileWriter tambi�n puede lanzar una excepci�n
try
{
// Destino de los datos
FileWriter fw = new FileWriter("ArchivoDeTexto.txt",true);
// Buffer de escritura
BufferedWriter bw = new BufferedWriter(fw);
// Objeto para la escritura
PrintWriter salida = new PrintWriter(bw);
//Guardamos la primera l�nea
salida.println("Segunda l�nea");
//Cerrar el objeto salida, el objeto bw y el fw
salida.close();
bw.close();
fw.close();
System.out.println("�Archivo creado correctamente!");
}
catch(IOException i)
{
System.out.println("Se produjo un error de Archivo");
}
}
public static void main(String[] args)
{
new FicheroTextoEscritura();
}
}
