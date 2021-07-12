package es.cic.bootcamp.ejercicio002;

public class Motor {
	private double potenciaMotor = 20 + Math.random() * 20;
	private String nombre;

	public Motor(String nombre) {
		this.nombre = nombre;
	}

	public double potenciaMotor() {
		return potenciaMotor;
	}

	public String nombreMotor() {
		return nombre;
	}
}
