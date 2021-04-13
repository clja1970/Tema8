package MonomiosMVC;

import es.studium.Monomios.ControladorFichero;
import es.studium.Monomios.ModeloFichero;
import es.studium.Monomios.VistaFichero;

public class Monomios
{

	public static void main(String[] args)
	{
		ClaseVista claseVista= new ClaseVista();
		ClaseModelo claseModelo = new ClaseModelo ();
		new ClaseControlador (claseVista, claseModelo);
	}

}
