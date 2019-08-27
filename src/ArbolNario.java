
public class ArbolNario {
	NodoArbol raiz ;

	//Efecto:Agrega un nodo especifico al Padre dado.
	//Requiere:Que tenga raiz y que el nodo padre exista.
	//Modifica:Modifica la lista hijos del nodo padre.
	void insertar(int padre, int dato ) {
		NodoArbol nodoPadre = buscar(padre);
		if (nodoPadre!=null) {
			nodoPadre.agregarHijo(dato);	
		}
	}

	void imprimir() {

	}	

	//EFECTO:
	//REQUIERE:
	//MODIFICA:
	void borrar() {

	}


	//EFECTO:
	//REQUIERE:
	//MODIFICA:
	void padre(int dato) {

	}


	//EFECTO:
	//REQUIERE:
	//MODIFICA:
	boolean existe(int dato) {
		if(raiz == null) return false;
		if(raiz.getDato() == dato) return true;
		else existe(raiz,dato);
		return false ;
	}
	private boolean existe(NodoArbol nodo,int dato) {

		Lista lista = nodo.getHijos();
		for(int i = 0; i<lista.longitud();i++) {
			if(lista.get(i).getDato().getDato() == dato) return true;
			else existe(lista.get(i).getDato(),dato);

		}
		return false;
	}

	//EFECTO: recorre el arbol para encontrar el primer nodo que tiene el dato
	//REQUIERE: un arbol n-ario, nombres, cuidado pierde
	//MODIFICA: nothing
	NodoArbol buscar (int dato){
		return buscar(raiz,dato) ;
	}

	NodoArbol buscar (NodoArbol n, int dato){
		if (n!= null && n.getDato()!=dato) {
			int i=0 ;
			while(n!= null && n.getDato()!= dato) {
				n= buscar(n.getHijo(i),dato);
				i++ ;	
			}

		}

		return (n!=null&&n.getDato()==dato)?n:null ;
	} 



//EFECTO:
//REQUIERE:
//MODIFICA:
int altura() {
	return 0 ;
}


//EFECTO:
//REQUIERE:
//MODIFICA:
void vaciar() {
	raiz= null ;
}


//EFECTO:
//REQUIERE:
//MODIFICA:
boolean esVacio() {
	return raiz==null ;
}


//EFECTO:
//REQUIERE:
//MODIFICA:
NodoArbol distinto() {
	return null ;
}

public void insertarEnRaiz(int d) {
	if (raiz!= null) {
		raiz.setDato(d);
	} else {
		raiz= new NodoArbol(d) ;
	}
	
}


}
