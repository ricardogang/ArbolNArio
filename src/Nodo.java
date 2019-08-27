
public class Nodo {
	NodoArbol dato ;
	Nodo siguiente ;
	
	public Nodo(NodoArbol d) {
		dato= d ;
		siguiente= null ;
	}
	
	public NodoArbol getDato() {
		return dato;
	}
	public void setDato(NodoArbol dato) {
		this.dato = dato;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
