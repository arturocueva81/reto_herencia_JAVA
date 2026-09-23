package com.krakedev.herencia;

public class Hija extends Padre{

//	es el constructor por default
	public Hija(int virtudes, int defectos) {
		super(virtudes, defectos);
	}
	
	public void escucharMusica() {
		System.out.println("Le gusta Bad Bunny");
	}

	@Override
	public String toString() {
		return "defectos "+getDefectos()+" virtudes "+getVirtudes();
	}
	
}