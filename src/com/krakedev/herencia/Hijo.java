package com.krakedev.herencia;

public class Hijo extends Padre {

	private int juguetes;

	public int getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(int juguetes) {
		this.juguetes = juguetes;
	}

	public Hijo(int virtudes, int defectos, int juguetes) {
		super(virtudes, defectos);
		this.juguetes=juguetes;	
	}

	@Override
	public String toString() {
		return "Hijo [defectos=" + getDefectos() + ", virtudes=" + getVirtudes() + ", juguetes=" + juguetes + "]";
	}
	
	@Override
	public void ahorrar(double monto) {
		super.ahorrar(monto *0.50);
	}
}