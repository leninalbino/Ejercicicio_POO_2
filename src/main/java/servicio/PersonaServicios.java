package servicio;

import java.util.ArrayList;
import java.util.List;

import model.Personas;

public class PersonaServicios {
	
	public Personas []  persona;
	
	public void  llenarArreglo (int cantArreglo) {
		 persona= new Personas[cantArreglo];
		
	}
	
	public  List <Personas>mostrarInformacion() {
		List<Personas> per = new ArrayList<Personas>();
		per.forEach(System.out::println);
		return per;
		
		
		
		
			
	}
	
	public  Personas guardarObjeto (Personas personas) {
		return personas;
		
	}

}
