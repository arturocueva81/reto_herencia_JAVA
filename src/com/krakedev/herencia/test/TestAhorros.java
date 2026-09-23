package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("- PADRE");
		Padre padre = new Padre("Carlos", 1, 2);
		padre.ahorrar(15);
		System.out.print(padre);
		System.out.println(", Ahorro: $"+padre.getTotalAhorrado());

		System.out.println("- HIJA");
		Hija hija = new Hija("Andrea", 3,4);
		hija.ahorrar(15);
		System.out.print(hija);
		System.out.println(", Ahorro: $"+hija.getTotalAhorrado());

		System.out.println("- HIJO");
		Hijo hijo= new Hijo("Miguel", 5, 6,10);
		hijo.ahorrar(15);
		System.out.print(hijo);
		System.out.println(", Ahorro: $"+hijo.getTotalAhorrado());

	}

}
