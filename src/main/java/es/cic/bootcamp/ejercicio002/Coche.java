package es.cic.bootcamp.ejercicio002;

public class Coche {

	private Motor motor;
	
	public Coche(Motor motor) {
		this.motor = motor;
	}
	
	public double arrancar() {
		return motor.potenciaMotor()/7;
	}
}

