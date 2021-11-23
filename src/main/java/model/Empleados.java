package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleados extends Personas{

	protected Double sueldo;
	
	
	@Override
public String toString() {
	return super.toString()+ "Sueldo "+sueldo;
	
}


	public Empleados(Long id, String nombre, String apellido, Double sueldo) {
		super(id, nombre, apellido);
		this.sueldo = sueldo;
	}

	
}
