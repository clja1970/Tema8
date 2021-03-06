package Monomios;
public class PruebaMonomioConsola
{
public static void main(String[] args)
{
//Crear un par de Monomios
Monomio m1 = new Monomio(3,4);
Monomio m2 = new Monomio(2,4);
// Calcular su suma, que deber?a Monomio(5,4)
System.out.println(m1.mostrarMonomio(m1.sumaMonomio(m2)));
// Calcula la resta, que deber?a ser Monomio(1,4)
System.out.println(m1.mostrarMonomio(m1.restaMonomio(m2)));
// Cambiar de signo, que deber?a ser Monomio(-3,4)
System.out.println(m1.mostrarMonomio(m1.cambiaSignoMonomio()));
// Calcular el producto, que deber?a salir Monomio(-6,8)
System.out.println(m1.mostrarMonomio(m1.multiplicarMonomio(m2)));
// Calcular la derivada, que deber?a ser Monomio(-12,3)
System.out.println(m1.mostrarMonomio(m1.derivarMonomio()));
}
}
