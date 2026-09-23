package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hija hija = new Hija(null, 2,5);
		hija.setDefectos(2);
		hija.setVirtudes(5);
		
		System.out.print("La hija tiene ");
		hija.imprimir();

	}

}
