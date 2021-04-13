package Monomios;
public class Monomio
{
// Atributos de clase
int valor;
int orden;
// Métodos de clase
// Constructores
public Monomio()
{
this.valor=0;
this.orden=0;
}
public Monomio(int val, int ord)
{
this.valor=val;
this.orden=ord;

}
// Inspectores
public String mostrarMonomio(Monomio m)
{
String cadena = null;
cadena = m.valor+"x elevado a "+m.orden;
return (cadena);
}
public Monomio cambiaSignoMonomio()
{
return (new Monomio((-this.valor), this.orden));
}
public Monomio sumaMonomio(Monomio m)
{
if(this.orden==m.orden)
{
return (new Monomio (this.valor+m.valor, this.orden));
}
else
{
return (null);
}
}
public Monomio restaMonomio(Monomio m)
{
if(this.orden==m.orden)
{
return (new Monomio (this.valor-m.valor, this.orden));
}
else
{
return (null);
}
}
public Monomio multiplicarMonomio(Monomio m)
{
return (new Monomio (this.valor*m.valor, this.orden+m.orden));
}
public Monomio derivarMonomio()
{
return (new Monomio (this.valor*this.orden, this.orden-1));
}
}
