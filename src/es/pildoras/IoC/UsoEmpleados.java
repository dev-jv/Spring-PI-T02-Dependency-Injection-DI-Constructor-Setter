package es.pildoras.IoC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		/*
		// Creación de objetos de tipo Empleado
		Empleados Empleado1 = new SecretarioEmpleado(); // Una interfaz y el const pertenece a una clase que implementa dicha interf  ... Abstracción
//		Empleados Empleado1 = new DirectorEmpleado();
		
		// Uso de los objetos creados
		System.out.println(Empleado1.getTareas());
		*/
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml"); // Cargar archivo xml
		
		Empleados Jorge = contexto.getBean("cDirector", Empleados.class);
		System.out.println(Jorge.getTareas());
		System.out.println(Jorge.getInforme());
		
		Empleados Juan = contexto.getBean("cJefe", Empleados.class); // Pedir el bean
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme()); // Utilizar el bean
		
		Empleados Kevin = contexto.getBean("sSecretario", Empleados.class);
		System.out.println(Kevin.getTareas());
		System.out.println(Kevin.getInforme());
		
		contexto.close(); // Cerrar el xml
	}
}

/*
-> Mediante un constructor

//--> 1 Crear la clase e interfaz de la dep.

//--> 2 Creación de constructor en la clase para la inyeccion de la dep.
	
//--> 3 Configurar la inyección de dep en archivo XML (ApplicationContext.xml)n



-> Mediante un setter

//--> 1 Crear la clase e interfaz de la dep.

//--> 2 Creación de método setter en la clase para la inyección
	
//--> 3 Configurar la inyección de dep en archivo XML (ApplicationContext.xml)n
*/