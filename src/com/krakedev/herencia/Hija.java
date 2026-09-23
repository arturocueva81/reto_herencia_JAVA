package com.krakedev.herencia;

public class Hija extends Padre{

//	es el constructor por default
	public Hija(String nombre, int virtudes, int defectos) {
		super(nombre, virtudes, defectos);
	}
	
	public void escucharMusica() {
		System.out.println("Le gusta Bad Bunny");
	}

	@Override
	public String toString() {
		return "nombre: "+getNombre()+", defectos "+getDefectos()+" virtudes "+getVirtudes();
	}
	
}