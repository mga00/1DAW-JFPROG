package com.gsd.daw.prog;

public class ListaNodos {
	
	private NODO principal;

	public ListaNodos() {
		this.principal = null;
	}
	//añadir un elemento a la lista
	public void add (int n) {
		NODO nuevo = new NODO(n);
		if (principal == null) {
			principal = nuevo;
		}else {
			NODO actual = principal;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}
	//devuelve el elemento en la posicion dada
	public Integer get (int n) throws Exception {
		if(n < 0) throw new Exception("La posicion del elemento no es válida");
		NODO actual = principal;
		for (int i = 0; actual != null && i<n; i++) {
			actual = actual.siguiente;
		}
		return (actual != null) ? actual.entero : null;
	}
	//borra el elemento de la posicion dada
	public void remove(int n) {
		if (principal == null || n < 0)	return;
		if (n == 0) {
			principal = principal.siguiente;
			return;
		}
		NODO actual = principal;
		for (int i = 0; actual != null && i < n - 1; i++) {
			actual = actual.siguiente;
		}
		if (actual == null || actual.siguiente == null) return;
		actual.siguiente = actual.siguiente.siguiente;
	}
	//obtener el tamaño de la lista
	public int size() {
		int contador = 0;
		NODO actual = principal;
		while (actual != null) {
			contador++;
			actual = actual.siguiente;
		}
		return contador;
	}
	//imprime todos los elementos de la lista
	public void print() {
		NODO actual = principal;
		while (actual != null) {
			System.out.print(actual.entero + " ");
			actual = actual.siguiente;
		}
		System.out.println();
	}
	//ordenar la lista de forma ascedente
	public void sort() {
		if (principal == null || principal.siguiente == null) return;
		boolean ordenado;
		do {
			ordenado = false;
			NODO actual = principal;
			while (actual.siguiente != null) {
				if (actual.entero > actual.siguiente.entero) {
					int temp = actual.entero;
					actual.entero = actual.siguiente.entero;
					actual.siguiente.entero = temp;
					ordenado = true;
				}
				actual = actual.siguiente;
			}
		}while(ordenado);
	}
	//verificar si la lista esta vacia
	public boolean esVacia() {
		if (principal == null) return true;
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
