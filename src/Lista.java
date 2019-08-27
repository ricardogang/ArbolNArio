
public class Lista {
	Nodo primero ;

	void insertar(NodoArbol dato) {
		if (primero== null) {
			primero= new Nodo(dato);
		}else {
			Nodo t= primero ;
			primero= new Nodo(dato) ;
			primero.setSiguiente(t);
		}
	}

	int longitud() {
		return longitud(primero);
	}
	
	Nodo get(int i) {
		Nodo n= primero ;
		for (int j = 0; j < i&&n!=null; j++) {
			n= n.getSiguiente() ;
		}
		return n ;
	}

	private int longitud(Nodo n) {
		int resultado=0 ;
		if (n!= null) {
			if (n.getSiguiente()==null) {
				resultado=1 ;
			} else {
				resultado= 1+ longitud(n.getSiguiente());
			}
		}
		return resultado;
	}

	boolean buscar(NodoArbol dato) {
		boolean resultado = false ;
		Nodo n= primero ;
		if (n!=null) {
			while(n.getDato()!= dato && n.getSiguiente()!=null ) {
				n= n.getSiguiente() ;

			}
			resultado=n.getDato()== dato?true:false ;
		}
		return resultado ;
	}

	void imprimir() {
		Nodo n= primero ;

		while(n!=null ) {
			System.out.print(n.getDato()+"->");
			n= n.getSiguiente() ;
		}
	}
	Nodo posHijo(int x) {
		Nodo n=primero;
		for(int i=0;i<=x;++i) {
			if(n.getSiguiente()!=null)
				n=n.getSiguiente();
		}
		return n;
	}
}
