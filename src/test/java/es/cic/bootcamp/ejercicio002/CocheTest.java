package es.cic.bootcamp.ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheTest {
	private Motor motor1 = new Motor("Yamaha");
	private Coche coche1 = new Coche(motor1);
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		double a = motor1.potenciaMotor();
		
		double b = 7*coche1.arrancar();
		
		assertEquals(a,b,"El coche al arrancar no da la potencia esperada");
	}

}
