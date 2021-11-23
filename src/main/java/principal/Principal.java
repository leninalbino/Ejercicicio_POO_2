package principal;

import javax.swing.JOptionPane;

import model.Empleados;
import model.Personas;
import servicio.EmpleadoServicios;
import servicio.PersonaServicios;

public class Principal {

	public static void main(String[] args) {


		int opcion, cantidad=0;
		Long id;
		Double sueldo;
		String nombre, apellido;
		PersonaServicios per;
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleciones una Opcion \n1.Registrar Empleado"
					+ "\n2. Listar Empleado \n3. Registrar Persona \n4. Listar Persona \n5. Salir"));
			switch(opcion) {
			
				case 1:
					int j=0;
					per = new EmpleadoServicios();
					cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad datos que desea ingresar"));
					
					while (j<cantidad ) {
						per.llenarArreglo(cantidad);
						Empleados empleado = new Empleados();
						id = Long.parseLong(JOptionPane.showInputDialog("Ingrese el id"));
						nombre = JOptionPane.showInputDialog("Ingrese el nombre");
						apellido = JOptionPane.showInputDialog("Ingrese el apellido");
						sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
						per.guardarObjeto(empleado);
						empleado.setId(id);
						empleado.setNombre(nombre);
						empleado.setApellido(apellido);
						empleado.setSueldo(sueldo);
						j++;
						System.out.println(empleado.toString());
						
					}
					break;
				case 2:
					per = new EmpleadoServicios();
					per.mostrarInformacion();
					break;
				case 3:
					int i=0;
					per = new PersonaServicios();
					cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad datos que desea ingresar"));
					
					while (i<cantidad ) {
						per.llenarArreglo(cantidad);
						Personas persona = new Personas();
						id = Long.parseLong(JOptionPane.showInputDialog("Ingrese el id"));
						nombre = JOptionPane.showInputDialog("Ingrese el nombre");
						apellido = JOptionPane.showInputDialog("Ingrese el apellido");
						per.guardarObjeto(persona);
						persona.setId(id);
						persona.setNombre(nombre);
						persona.setApellido(apellido);
						i++;
						//System.out.println(persona.toString());
						
					}
					break;
				case 4:
					per = new PersonaServicios();
					per.mostrarInformacion();
					
					break;
			}
				
		}while(opcion <=4);

	}

}
