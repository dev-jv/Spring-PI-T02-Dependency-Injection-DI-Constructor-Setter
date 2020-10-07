package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es el informe presentado por el Secretario: " + informeNuevo.getInforme();
	}

	public Informes informeNuevo;
	
	public void setInformeNuevo(Informes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
}

