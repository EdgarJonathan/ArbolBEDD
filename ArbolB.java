package Arbol;

public class ArbolB {


	public Rama raiz;



	public void insertar(int valor) {//16

		NodoB nodo = new NodoB(valor);
		if (estaVacio()) {

			raiz = new Rama();
			raiz.insertar(nodo);

		} else {

			Object obj = inserta(nodo, raiz);
			
			
			if (obj instanceof NodoB) {
				raiz = new Rama();
				raiz.insertar((NodoB) obj);
				raiz.setHoja(false);

			}
			
		}
	}



	private Object inserta(NodoB nodo, Rama rama) {
		
		if (rama.isHoja()) {
			
			rama.insertar(nodo);
			
			if (rama.getCuenta() == 5) {
          			
				return dividir(rama);
				
			} else {
				
				return rama;
			
			}
		} else {
			
			
			NodoB temp = rama.getPrimero();
			
			do {
				
				if (nodo.getDato() == temp.getDato()) {
					
					return rama;
					
					
				} else if (nodo.getDato() < temp.getDato()) {
					
					Object obj = inserta(nodo, temp.getIzq());
					
					if (obj instanceof NodoB) {
						
						rama.insertar((NodoB) obj);
						if (rama.getCuenta() == 5) {
							return dividir(rama);
						}
						
					}
					return rama;
					
				} else if (temp.getSig() == null) {
					
					Object obj = inserta(nodo, temp.getDer());
					
					if (obj instanceof NodoB) {
						
						rama.insertar((NodoB) obj);
						
						if (rama.getCuenta() == 5) {
							
							return dividir(rama);
						}
					}
					
					return rama;
				}
				temp = temp.getSig();
				
			} while (temp != null);
			
			
			
		}
		
		
		return rama;  
	}


	

	private Object dividir(Rama c) {
		
		return 0;
	}

	
	
	
	public void imprimir() {
		imprimir(raiz);
	}
	
	private void imprimir(Rama raiz) {
	
		
		if(raiz!=null) {
			
			NodoB actual = raiz.getPrimero();
			
			while (actual!= null) {
				
				imprimir(actual.getIzq());
				
				System.out.println("Nodo-> "+actual.getDato());
				
				imprimir(actual.getDer());
				
				actual = actual.getSig();
			}
			
			 
		}
		
	}


	public boolean estaVacio(){

		if(raiz!=null) {
			
			return false;
		}else {
			return true;
		}

	}






}
