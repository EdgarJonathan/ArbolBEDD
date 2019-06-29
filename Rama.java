package Arbol;

public class Rama {

	
	private NodoB primero;
	private int Cuenta;
	private boolean Hoja;
	
	

	//constructor
	Rama(){
		
		this.Hoja= true;
		this.primero= null;
		this.Cuenta=0;
	}
	
	
	public void insertar(NodoB nuevo) {
		
		
		if(primero==null) {
			
			primero = nuevo;
			Cuenta++;
			primero.setSig(null);
			primero.setAnt(null);
		}else {
			
			ordenar(nuevo);			
		}
		
		
		

	}

	
	public void ordenar(NodoB nuevo) {
		
		NodoB aux=primero;
		
		while(aux!=null) {
			
			if(aux.getDato() == nuevo.getDato()) {
				break;
			}else if(nuevo.getDato() < aux.getDato()) {
				Cuenta++;
				
				if(aux == primero) {
					
					primero.setAnt(nuevo);
					primero.setIzq(nuevo.getDer());
					nuevo.setSig(primero);
					primero = nuevo;
					break;
					
				}else{
					
					nuevo.setAnt(aux.getAnt());
					nuevo.setSig(aux);
					aux.getAnt().setSig(nuevo);
					aux.getAnt().setDer(nuevo.getIzq());
					nuevo.setAnt(nuevo);
					aux.setIzq(nuevo.getDer());
					
				}
				
			}else if(aux.getSig()==null) {
				Cuenta++;
				aux.setSig(nuevo);
				aux.setDer(nuevo.getIzq());
				nuevo.setAnt(aux);
				nuevo.setSig(null);
				break;

			}
			
			
			aux=aux.getSig();
		}
		
	}
	
	

	public NodoB getPrimero() {
		return primero;
	}


	public void setPrimero(NodoB primero) {
		this.primero = primero;
	}
	
	public int getCuenta() {
		return Cuenta;
	}


	public void setCuenta(int cuenta) {
		Cuenta = cuenta;
	}


	public boolean isHoja() {
		return Hoja;
	}


	public void setHoja(boolean hoja) {
		Hoja = hoja;
	}


	
	





	




}
