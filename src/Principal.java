
public class Principal {

	public static void main(String[] args) {
		Lista l= new Lista() ;
		l.insertar(new NodoArbol((int)(Math.random()*10)));
		l.insertar(new NodoArbol((int)(Math.random()*10)));
		l.insertar(new NodoArbol((int)(Math.random()*10)));
		for (int i = 0; i < l.longitud(); i++) {
			System.out.println("lista(i):"+l.get(i).getDato().getDato());
		}
		
		ArbolNario a= new ArbolNario() ;
		a.insertarEnRaiz(2) ;
		a.insertar(2,3) ;
		a.insertar(2,31) ;
		a.insertar(29,37) ;
		a.insertar(2,23) ;
		a.insertar(31,3) ;
		
		System.out.println(a.buscar(2)+": "+a.buscar(2).getDato());
		System.out.println(a.buscar(3));
		System.out.println(a.buscar(31));
		System.out.println(a.buscar(29));
		
	}

}
