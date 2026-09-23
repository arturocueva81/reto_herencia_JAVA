package com.krakedev.herencia.test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class testArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Hija> listaHijas = new ArrayList<Hija>();
		
		Hija h1=new Hija(2,4);
		h1.setDefectos(2);
		h1.setVirtudes(4);
		listaHijas.add(h1);
		
		Hija h2=new Hija(6,1);
		h2.setDefectos(6);
		h2.setVirtudes(1);
		listaHijas.add(h2);
		
		Hija h3=new Hija(3,3);
		h3.setDefectos(3);
		h3.setVirtudes(3);
		listaHijas.add(h3);
		
		System.out.println(listaHijas);
		
	}

}
