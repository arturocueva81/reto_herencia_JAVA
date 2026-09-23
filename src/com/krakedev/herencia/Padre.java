package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	
//	@Override
//	public String toString() {
//		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
//	}
	
//	public Padre() {
//		System.out.println("COntructor vacio del padre");
//	}
	
	public Padre(int virtudes, int defectos) {
		this.virtudes=virtudes;
		this.defectos=defectos;
	}
	
	@Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
	}
	
	
	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	
	public void imprimir() {
		System.out.println(""+virtudes+" virtudes, y "+defectos+" defectos");
	}
	
	public void guardarSecreto() {
		System.out.println("NO SE HEREDA");
	}

}
