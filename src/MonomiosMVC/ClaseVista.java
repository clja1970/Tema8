package MonomiosMVC;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
public class ClaseVista extends Frame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Creamos la lista
	Choice Monomios = new Choice();
	Dialog unMonomio = new Dialog(this, "Un Monomio", true);
	Dialog dosMonomios = new Dialog (this, "Dos Monomios", true);
	MenuBar menuBar = new MenuBar();
	Menu mnuArchivo = new Menu ("Archivo");
	Menu mnuOperar = new Menu ("Operar");
	MenuItem mniSalir = new MenuItem("Salir");
	MenuItem mniCambiar = new MenuItem("Cambiar Signo");
	MenuItem mniSumar = new MenuItem("Sumar");
	MenuItem mniRestar = new MenuItem("Restar");
	MenuItem mniMultiplicar = new MenuItem("Multiplicar");
	MenuItem mniDerivar = new MenuItem("Derivar");
	
	Label lblUno = new Label ("Primer Monomio");
	Label lblDos = new Label ("Segundo Monomio");
	Label lblx1 = new Label ("x");
	Label lblx2 = new Label ("x");
	Label lblx3 = new Label ("x");
	Label lblUnico = new Label ("Monomio");
	
	TextField txtUno = new TextField (5);
	TextField txtGrado = new TextField (5);
	TextField txtUnResultado = new TextField (5);
	TextField txtValorUno = new TextField (5);
	TextField txtGradoUno = new TextField (5);
	TextField txtValorDos = new TextField (5);
	TextField txtGradoDos = new TextField (5);
	TextField txtResultado = new TextField (5);
	
	Button btnAceptarUno = new Button ("Cambiar signo");
	Button btnAceptarDos = new Button ("Suma");
	
	
	
	
	

	public ClaseVista()
	{
		setLayout(new FlowLayout());
		setBackground(new Color(100,220,220));
		
		
		setSize(300,160);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);


	}

}
