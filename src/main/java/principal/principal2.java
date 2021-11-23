package principal;

import model.Empleados;
import model.Personas;

public class principal2 {

	public static void main(String[] args) {
		Personas persona = new Empleados(1L, "lenin", "albino", 100.0);
		System.out.println(persona.toString());
		
	}

}
