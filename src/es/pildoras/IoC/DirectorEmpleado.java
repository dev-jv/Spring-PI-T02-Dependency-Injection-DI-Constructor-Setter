package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es el informe presentado por el Director: " + informeNuevo.getInforme();
	}

	public Informes informeNuevo;
	
	public DirectorEmpleado(Informes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
}


