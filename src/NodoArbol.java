public class NodoArbol {
	int dato ;
	Lista hijos ;
	
	NodoArbol(int d) {
		dato= d ;
		hijos= new Lista() ;
	}

	NodoArbol getHijo(int i) {
		Nodo n= hijos.get(i);
		return n!=null?n.getDato():null ;
	}
	
	Lista getHijos() {
		return hijos ;
	}
	
	int getDato() {
		return dato ;
	}
	
	void setDato(int d) {
		dato= d ;
	}
	
	void agregarHijo(int dato ) {
		
	}
	
	boolean esHijo(int dato) {
		return false ;
	}
	
	boolean esHoja() {
		return false ;
	}
}
