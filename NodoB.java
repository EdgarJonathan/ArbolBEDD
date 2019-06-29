package Arbol;

public class NodoB {
	

	private NodoB  sig , ant;

	private Rama izq , der;
	
	
	//contenido del arbol b
	//alias dato
	private int Dato;

	
	NodoB(int Dato){
		
		this.Dato = Dato;
		sig=ant=null;
		izq=der=null;
		
	}
	
	NodoB(){
		
		this.Dato = 0;
		sig=ant=null;
		izq=der=null;
	}


	
	
	public NodoB getSig() {
		return sig;
	}


	public void setSig(NodoB sig) {
		this.sig = sig;
	}


	public NodoB getAnt() {
		return ant;
	}


	public void setAnt(NodoB ant) {
		this.ant = ant;
	}


	public Rama getIzq() {
		return izq;
	}


	public void setIzq(Rama izq) {
		this.izq = izq;
	}


	public Rama getDer() {
		return der;
	}


	public void setDer(Rama der) {
		this.der = der;
	}


	public int getDato() {
		return Dato;
	}


	public void setDato(int valor) {
		Dato = valor;
	}




}
