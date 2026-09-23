package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	private String nombre;
	
	
	
//	@Override
//	public String toString() {
//		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
//	}
	
//	public Padre() {
//		System.out.println("COntructor vacio del padre");
//	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}

	public Padre(String nombre,int virtudes, int defectos) {
		this.nombre=nombre;
		this.virtudes=virtudes;
		this.defectos=defectos;
	}
	
	@Override
	public String toString() {
		return "Padre [nombre= "+nombre+", defectos=" + defectos + ", virtudes=" + virtudes +", totalAhorrado=" + totalAhorrado + "]";
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
	
	public void ahorrar(double monto) {
		totalAhorrado+=monto;
	}

}
